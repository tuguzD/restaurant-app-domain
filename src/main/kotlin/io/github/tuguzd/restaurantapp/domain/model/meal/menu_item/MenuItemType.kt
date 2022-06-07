package io.github.tuguzd.restaurantapp.domain.model.meal.menu_item

import kotlinx.serialization.Serializable

/**
 * Type of [menu item][MenuItem] in the application.
 */
@Serializable
public enum class MenuItemType {
    Hot,
    Cold,
    Dessert,
    Beverage,
    Cocktail,
    Vegetarian,
}
