package io.github.tuguzd.restaurantapp.domain.usecase.util.crud

import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable
import io.github.tuguzd.restaurantapp.domain.repository.util.Repository

/**
 * Base class for "find by [ID][I]" use cases which contains data of type [T].
 */
public open class ReadByIdUseCase<I : Any, T : Identifiable<I>>(
    private val repository: Repository<I, T>
) : suspend (I) -> T? {
    public override suspend operator fun invoke(id: I): T? = repository.readById(id)
}
