package io.github.tuguzd.restaurantapp.domain.model.meal.menu

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.User
import io.github.tuguzd.restaurantapp.domain.model.organization.service_item.ServiceItem
import io.github.tuguzd.restaurantapp.domain.model.util.*
import io.github.tuguzd.restaurantapp.domain.model.util.feature.*

/**
 * Basic interface for menu data representation.
 */
public interface Menu : Identifiable<NanoId>, Datable, Presentable, Describable {
    public val menuType: MenuType
    public val creator: User
    public val serviceItem: ServiceItem?

    public val name: String
}
