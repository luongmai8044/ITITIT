package mowede.framework.ititit.data.network

interface DomainMappable<R> {
    fun asDomain() : R
}