package io.github.tuguzd.restaurantapp.domain.usecase.util.crud

import io.github.tuguzd.restaurantapp.domain.model.util.feature.Identifiable
import io.github.tuguzd.restaurantapp.domain.repository.util.crud.ReadAllRepositoryService

/**
 * Base class for "find all" use cases which contains data of type [T].
 */
public open class ReadAllUseCase<I : Any, T : Identifiable<I>>(
    private val domainRepository: ReadAllRepositoryService<I, T>
) : suspend () -> List<T>? {
    public override suspend operator fun invoke(): List<T>? = domainRepository.readAll()
}
