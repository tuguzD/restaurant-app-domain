package io.github.tuguzd.restaurantapp.domain.model.util.feature

/**
 * Represent objects which can be identified by [id].
 */
public interface Identifiable<T> {
    public val id: T
}
