package io.github.tuguzd.restaurantapp.domain.model.meal.menu

import io.github.tuguzd.restaurantapp.domain.model.util.Datable
import io.github.tuguzd.restaurantapp.domain.model.util.Describable
import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable
import io.github.tuguzd.restaurantapp.domain.model.util.Presentable

/**
 * Basic interface for menu data representation.
 */
public interface Menu : Identifiable<String>, Datable, Presentable, Describable {
    // TODO: Make menu global for food-service
    //  or local for food-service item
    public val type: MenuType

    public val name: String
}
