package mowede.framework.ititit.datasource.local

import io.reactivex.Observable
import io.reactivex.Single
import mowede.framework.ititit.datasource.local.options.Options
import mowede.framework.ititit.datasource.local.questions.Question
import javax.inject.Inject

class AppLocalDataHelper @Inject constructor(appDatabase: AppDatabase) : LocalDataHelper{

    private var optionsDao = appDatabase.optionsDao()
    private var questionsDao = appDatabase.questionsDao()

    override fun isOptionsRepoEmpty(): Observable<Boolean> = Observable.just(optionsDao.loadAll().isEmpty())

    override fun insertOptions(options: List<Options>): Observable<Boolean> {
        optionsDao.insertAll(options)
        return Observable.just(true)
    }

    override fun loadOptions(questionId: Long): Single<List<Options>>
            = Single.fromCallable { optionsDao.loadOptionsByQuestionId(questionId) }

    override fun isQuestionsRepoEmpty(): Observable<Boolean> = Observable.fromCallable({ questionsDao.loadAll().isEmpty() })

    override fun insertQuestions(questions: List<Question>): Observable<Boolean> {
        questionsDao.insertAll(questions)
        return Observable.just(true)
    }

    override fun loadQuestions(): Observable<List<Question>> = Observable.fromCallable({ questionsDao.loadAll() })

}