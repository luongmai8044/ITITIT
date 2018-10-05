package mowede.framework.ititit.storage.mapper

interface DomainMappable<Domain> {
    fun transform(): Domain
}