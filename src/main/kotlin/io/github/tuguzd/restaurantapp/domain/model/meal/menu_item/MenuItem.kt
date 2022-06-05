package io.github.tuguzd.restaurantapp.domain.model.meal.menu_item

import io.github.tuguzd.restaurantapp.domain.model.client_work.order_item.OrderItem
import io.github.tuguzd.restaurantapp.domain.model.meal.menu.Menu
import io.github.tuguzd.restaurantapp.domain.model.util.*
import io.github.tuguzd.restaurantapp.domain.model.util.feature.*

/**
 * Basic interface for menu item data representation.
 */
public interface MenuItem : Identifiable<NanoId>, Datable, Presentable, Describable {
    public val type: MenuItemType
    public val menu: Menu

    public val name: String

    public val orderItems: Set<OrderItem>
}
