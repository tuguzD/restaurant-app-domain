package io.github.tuguzd.restaurantapp.domain.usecase.util.crud

import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable
import io.github.tuguzd.restaurantapp.domain.repository.util.Repository

/**
 * Base class for "find all" use cases which contains data of type [T].
 */
public open class ReadAllUseCase<I : Any, T : Identifiable<I>>(
    private val repository: Repository<I, T>
) : suspend () -> List<T>? {
    public override suspend operator fun invoke(): List<T>? = repository.readAll()
}
