package io.github.tuguzd.restaurantapp.domain.usecase.util.crud

import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable
import io.github.tuguzd.restaurantapp.domain.repository.util.DomainRepository

/**
 * Base class for "delete" use cases which contains data of type [T].
 */
public open class DeleteUseCase<I : Any, T : Identifiable<I>>(
    private val domainRepository: DomainRepository<I, T>
) : suspend (I) -> Unit {
    public override suspend operator fun invoke(id: I): Unit = domainRepository.delete(id)
}
