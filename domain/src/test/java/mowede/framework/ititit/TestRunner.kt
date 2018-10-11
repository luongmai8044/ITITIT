package mowede.framework.ititit

import org.jbehave.core.configuration.Configuration
import org.jbehave.core.configuration.MostUsefulConfiguration
import org.jbehave.core.i18n.LocalizedKeywords
import org.jbehave.core.io.CodeLocations
import org.jbehave.core.io.LoadFromClasspath
import org.jbehave.core.io.StoryFinder
import org.jbehave.core.junit.JUnitStories
import org.jbehave.core.model.ExamplesTableFactory
import org.jbehave.core.model.TableTransformers
import org.jbehave.core.parsers.RegexStoryParser
import org.jbehave.core.reporters.Format.*
import org.jbehave.core.reporters.StoryReporterBuilder
import org.jbehave.core.steps.InjectableStepsFactory
import org.jbehave.core.steps.InstanceStepsFactory
import org.jbehave.core.steps.ParameterConverters
import org.jbehave.core.steps.ParameterConverters.ExamplesTableConverter
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

class TestRunner : JUnitStories() {

    init {
        configuredEmbedder().embedderControls()
                .doGenerateViewAfterStories(true)
                .doIgnoreFailureInStories(true).doIgnoreFailureInView(false)

        configuredEmbedder().embedderControls()
                .doGenerateViewAfterStories(true)
                .doIgnoreFailureInStories(false).doIgnoreFailureInView(true)
                .useThreads(1).useStoryTimeouts("60000")
    }

    override fun configuration(): Configuration {
        val embeddableClass = this.javaClass
        val parameterConverters = ParameterConverters()
        val tableTransformers = TableTransformers()

        val examplesTableFactory = ExamplesTableFactory(
                LocalizedKeywords(),
                LoadFromClasspath(embeddableClass), tableTransformers)
        parameterConverters.addConverters(ParameterConverters.DateConverter(
                SimpleDateFormat("yyyy-MM-dd")),
                ExamplesTableConverter(examplesTableFactory))

        return MostUsefulConfiguration()
                .useStoryLoader(LoadFromClasspath(embeddableClass))
                .useStoryParser(RegexStoryParser(examplesTableFactory))
                .useStoryReporterBuilder(
                        StoryReporterBuilder()
                                .withCodeLocation(CodeLocations.codeLocationFromPath("src\\test\\resources\\report"))
                                .withDefaultFormats()
                                .withFormats(HTML))
                .useParameterConverters(parameterConverters)
    }

    override fun stepsFactory(): InjectableStepsFactory {

        val stepsPackage = "mowede.framework.ititit.usecases"
        val stepsLoc = "src/test/java/" + stepsPackage.replace(".", "/")

        val stepList = ArrayList<Any>()

        val steps = File(stepsLoc)
        val filesDirectory = steps.listFiles { file -> file.isDirectory}

        for (fileDir in filesDirectory) {
            for (file in fileDir.listFiles()) {
                var fileLoc = file.path.replace("src\\test\\java\\","").replace("\\", ".").replace(".kt", "")
                    try {
                        val stepObject = Class.forName(fileLoc).newInstance()
                        stepList.add(stepObject)
                    } catch (e: InstantiationException) {
                        e.printStackTrace()
                    } catch (e: IllegalAccessException) {
                        e.printStackTrace()
                    } catch (e: ClassNotFoundException) {
                        e.printStackTrace()
                    }

            }
        }
        return InstanceStepsFactory(configuration(), stepList)
    }

    override fun storyPaths(): List<String> {
        return StoryFinder().findPaths(CodeLocations.codeLocationFromPath("src/test/resources/"), "**/*.story", "")
    }
}