package io.github.tuguzd.restaurantapp.domain.model.util

/**
 * Represent objects which can be identified by [id].
 */
public interface Identifiable<T> {
    public val id: T
}
