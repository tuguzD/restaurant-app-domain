package io.github.tuguzd.restaurantapp.domain.repository.util.crud

import io.github.tuguzd.restaurantapp.domain.model.util.feature.Identifiable

public interface ReadByIdRepositoryService<I, T : Identifiable<I>> {
    public suspend fun readById(id: I): T?
}
