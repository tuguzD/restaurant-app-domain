package io.github.tuguzd.restaurantapp.domain.repository.util

import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable

/**
 * Base interface for all repositories which contains data of type [T].
 */
public interface DomainRepository<I : Any, T : Identifiable<I>> {
    public suspend fun readAll(): List<T>
    public suspend fun readById(id: I): T?

    public suspend fun save(item: T): T

    public suspend fun delete(id: I)
    public suspend fun clear()
}
