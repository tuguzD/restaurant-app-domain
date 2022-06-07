package io.github.tuguzd.restaurantapp.domain.model.meal.menu

import kotlinx.serialization.Serializable

/**
 * Type of [menu][Menu] in the application.
 */
@Serializable
public enum class MenuType {
    Breakfast,
    Dinner,
    Supper,
    Lunch,
}
