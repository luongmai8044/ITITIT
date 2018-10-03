package mowede.framework.ititit.ui.splash.interactor

import android.content.Context
import com.google.gson.GsonBuilder
import com.google.gson.internal.`$Gson$Types`
import io.reactivex.Observable
import mowede.framework.ititit.datasource.local.options.Options
import mowede.framework.ititit.datasource.local.questions.Question
import mowede.framework.ititit.repository.AppDataRepository
import mowede.framework.ititit.datasource.preferences.PreferenceHelper
import mowede.framework.ititit.ui.base.interactor.BaseInteractor
import mowede.framework.ititit.util.AppConstants
import mowede.framework.ititit.util.FileUtils
import mowede.framework.ititit.util.SchedulerProvider
import javax.inject.Inject

class SplashInteractor
@Inject constructor(private val mContext: Context,
                    private val schedulerProvider: SchedulerProvider,
                    dataRepository: AppDataRepository,
                    preferenceHelper: PreferenceHelper) : BaseInteractor(preferenceHelper, dataRepository), SplashMVPInteractor {

    override fun getQuestion(): Observable<List<Question>> {
        return dataRepository.loadQuestions()
    }

    override fun seedQuestions(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return dataRepository.isQuestionsRepoEmpty().concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Question::class.java)
                val questionList = gson.fromJson<List<Question>>(
                        FileUtils.loadJSONFromAsset(
                                mContext,
                                AppConstants.SEED_DATABASE_QUESTIONS),
                        type)
                dataRepository.insertQuestions(questionList)
            } else
                Observable.just(false)
        }
    }

    override fun seedOptions(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return dataRepository.isOptionsRepoEmpty().concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Options::class.java)
                val optionsList = gson.fromJson<List<Options>>(
                        FileUtils.loadJSONFromAsset(
                                mContext,
                                AppConstants.SEED_DATABASE_OPTIONS),
                        type)
                dataRepository.insertOptions(optionsList)
            } else
                Observable.just(false)
        }
    }
}