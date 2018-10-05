package mowede.framework.ititit.data.mapper

interface DomainMappable<Domain> {
    fun transform(): Domain
}