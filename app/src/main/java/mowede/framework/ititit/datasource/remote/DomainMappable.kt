package mowede.framework.ititit.datasource.remote

interface DomainMappable<R> {
    fun asDomain() : R
}