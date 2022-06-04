package io.github.tuguzd.restaurantapp.domain.repository.util.crud

import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable

public interface SaveRepositoryService<I, T : Identifiable<I>> {
    public suspend fun save(item: T): T
}
