package io.github.tuguzd.restaurantapp.domain.model.organization.service_item

import io.github.tuguzd.restaurantapp.domain.model.meal.menu.Menu
import io.github.tuguzd.restaurantapp.domain.model.organization.service.Service
import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPoint
import io.github.tuguzd.restaurantapp.domain.model.util.Datable
import io.github.tuguzd.restaurantapp.domain.model.util.Describable
import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable
import io.github.tuguzd.restaurantapp.domain.model.util.Presentable

/**
 * Basic interface for food service item data representation.
 */
public interface ServiceItem : Identifiable<String>, Datable, Presentable, Describable {
    public val type: ServiceItemType
    public val service: Service? // TODO: Make not nullable

    public val name: String
    public val address: String? // TODO: Make not nullable, use coordinates

    public val serviceItemPoints: Set<ServiceItemPoint>
    public val menus: Set<Menu>
}
