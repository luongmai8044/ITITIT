package mowede.framework.ititit.datasource.local

import io.reactivex.Observable
import io.reactivex.Single
import mowede.framework.ititit.datasource.local.options.Options
import mowede.framework.ititit.datasource.local.questions.Question

interface LocalDataHelper{

    fun isOptionsRepoEmpty(): Observable<Boolean>

    fun insertOptions(options: List<Options>): Observable<Boolean>

    fun loadOptions(questionId: Long): Single<List<Options>>

    fun isQuestionsRepoEmpty(): Observable<Boolean>

    fun insertQuestions(questions: List<Question>): Observable<Boolean>

    fun loadQuestions(): Observable<List<Question>>

}