package io.github.tuguzd.restaurantapp.domain.model.util

/**
 * Represent objects which can be identified by [ID][id].
 */
public interface Identifiable<out T : Any> {
    public val id: T
}
