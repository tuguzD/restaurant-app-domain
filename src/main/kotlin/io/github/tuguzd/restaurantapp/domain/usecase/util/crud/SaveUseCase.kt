package io.github.tuguzd.restaurantapp.domain.usecase.util.crud

import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable
import io.github.tuguzd.restaurantapp.domain.repository.util.crud.SaveRepositoryService

/**
 * Base class for "save" use cases which contains data of type [T].
 */
public open class SaveUseCase <I, T : Identifiable<I>>(
    private val domainRepository: SaveRepositoryService<I, T>
) : suspend (T) -> T {
    public override suspend operator fun invoke(item: T): T = domainRepository.save(item)
}
