package io.github.tuguzd.restaurantapp.domain.model.client_work.order_item

import io.github.tuguzd.restaurantapp.domain.model.client_work.order.Order
import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItem
import io.github.tuguzd.restaurantapp.domain.model.util.Datable
import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable

/**
 * Basic interface for client order item data representation.
 */
public interface OrderItem : Identifiable<String>, Datable {
    public val order: Order
    public val menuItem: MenuItem

    public val itemCount: Int
    public val description: String? // TODO: Expand with a set of values like "no salt"
}
