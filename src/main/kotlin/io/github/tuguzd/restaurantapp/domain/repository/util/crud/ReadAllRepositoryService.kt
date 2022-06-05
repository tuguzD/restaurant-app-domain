package io.github.tuguzd.restaurantapp.domain.repository.util.crud

import io.github.tuguzd.restaurantapp.domain.model.util.feature.Identifiable

public interface ReadAllRepositoryService<I, T : Identifiable<I>> {
    public suspend fun readAll(): List<T>
}
