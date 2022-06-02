package io.github.tuguzd.restaurantapp.domain.model.meal.menu_item

import io.github.tuguzd.restaurantapp.domain.model.client_work.order_item.OrderItem
import io.github.tuguzd.restaurantapp.domain.model.meal.menu.Menu
import io.github.tuguzd.restaurantapp.domain.model.util.Datable
import io.github.tuguzd.restaurantapp.domain.model.util.Describable
import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable
import io.github.tuguzd.restaurantapp.domain.model.util.Presentable

/**
 * Basic interface for menu item data representation.
 */
public interface MenuItem : Identifiable<String>, Datable, Presentable, Describable {
    public val type: MenuItemType
    public val menu: Menu? // TODO: Make not nullable

    public val orderItems: Set<OrderItem>
}
