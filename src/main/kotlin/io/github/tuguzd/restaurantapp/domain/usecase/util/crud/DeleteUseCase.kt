package io.github.tuguzd.restaurantapp.domain.usecase.util.crud

import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable
import io.github.tuguzd.restaurantapp.domain.repository.util.Repository

/**
 * Base class for "delete" use cases which contains data of type [T].
 */
public open class DeleteUseCase<I : Any, T : Identifiable<I>>(
    private val repository: Repository<I, T>
) : suspend (T) -> Unit {
    public override suspend operator fun invoke(item: T): Unit = repository.delete(item)
}
