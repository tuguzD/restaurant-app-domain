package io.github.tuguzd.restaurantapp.domain.repository.util

import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable

/**
 * Base interface for all repositories which contains data of type [T].
 */
public interface Repository<I : Any, T : Identifiable<I>> {
    public suspend fun readAll(): List<T>
    public suspend fun readById(id: I): T?

    public suspend fun save(item: T): T

    public suspend fun delete(item: T)
//    public suspend fun deleteById(id: I)

    public suspend fun clear()
}
