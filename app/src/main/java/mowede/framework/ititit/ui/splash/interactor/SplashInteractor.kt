package mowede.framework.ititit.ui.splash.interactor

import android.content.Context
import com.google.gson.GsonBuilder
import com.google.gson.internal.`$Gson$Types`
import io.reactivex.Observable
import mowede.framework.ititit.data.database.repository.options.Options
import mowede.framework.ititit.data.database.repository.options.OptionsRepo
import mowede.framework.ititit.data.database.repository.questions.Question
import mowede.framework.ititit.data.database.repository.questions.QuestionRepo
import mowede.framework.ititit.data.network.DataRepository
import mowede.framework.ititit.data.preferences.PreferenceHelper
import mowede.framework.ititit.ui.base.interactor.BaseInteractor
import mowede.framework.ititit.util.AppConstants
import mowede.framework.ititit.util.FileUtils
import mowede.framework.ititit.util.SchedulerProvider
import javax.inject.Inject

class SplashInteractor
@Inject constructor(private val mContext: Context,
                    private val questionRepoHelper: QuestionRepo,
                    private val optionsRepoHelper: OptionsRepo,
                    private val schedulerProvider: SchedulerProvider,
                    dataRepository: DataRepository,
                    preferenceHelper: PreferenceHelper) : BaseInteractor(preferenceHelper, dataRepository), SplashMVPInteractor {

    override fun getQuestion(): Observable<List<Question>> {
        return questionRepoHelper.loadQuestions()
    }

    override fun seedQuestions(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return questionRepoHelper.isQuestionsRepoEmpty().concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Question::class.java)
                val questionList = gson.fromJson<List<Question>>(
                        FileUtils.loadJSONFromAsset(
                                mContext,
                                AppConstants.SEED_DATABASE_QUESTIONS),
                        type)
                questionRepoHelper.insertQuestions(questionList).compose(schedulerProvider.ioToMainObservableScheduler())
            } else
                Observable.just(false)
        }
    }

    override fun seedOptions(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return optionsRepoHelper.isOptionsRepoEmpty().concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Options::class.java)
                val optionsList = gson.fromJson<List<Options>>(
                        FileUtils.loadJSONFromAsset(
                                mContext,
                                AppConstants.SEED_DATABASE_OPTIONS),
                        type)
                optionsRepoHelper.insertOptions(optionsList).compose(schedulerProvider.ioToMainObservableScheduler())
            } else
                Observable.just(false)
        }
    }
}