package io.github.tuguzd.restaurantapp.domain.model.meal.menu

import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItem
import io.github.tuguzd.restaurantapp.domain.model.organization.service_item.ServiceItem
import io.github.tuguzd.restaurantapp.domain.model.util.*
import io.github.tuguzd.restaurantapp.domain.model.util.feature.*

/**
 * Basic interface for menu data representation.
 */
public interface Menu : Identifiable<NanoId>, Datable, Presentable, Describable {
    public val type: MenuType
    public val serviceItem: ServiceItem

    public val name: String

    public val menuItems: Set<MenuItem>
}
