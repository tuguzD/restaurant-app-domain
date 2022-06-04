package io.github.tuguzd.restaurantapp.domain.repository.util.crud

public interface DeleteRepositoryService<I> {
    public suspend fun delete(id: I)
}
