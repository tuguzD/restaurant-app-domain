package io.github.tuguzd.restaurantapp.domain.model.client_work.order_item

import io.github.tuguzd.restaurantapp.domain.model.client_work.order.Order
import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItem
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.model.util.feature.*

/**
 * Basic interface for client order item data representation.
 */
// TODO: Expand with a set of values like "no salt"
public interface OrderItem : Identifiable<NanoId>, Datable, Describable {
    public val order: Order
    public val menuItem: MenuItem

    public val itemCount: Int
}
