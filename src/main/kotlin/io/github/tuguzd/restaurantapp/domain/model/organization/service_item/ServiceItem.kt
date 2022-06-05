package io.github.tuguzd.restaurantapp.domain.model.organization.service_item

import io.github.tuguzd.restaurantapp.domain.model.meal.menu.Menu
import io.github.tuguzd.restaurantapp.domain.model.organization.service.Service
import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPoint
import io.github.tuguzd.restaurantapp.domain.model.util.*
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Datable
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Describable
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Identifiable
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Presentable

/**
 * Basic interface for food service item data representation.
 */
public interface ServiceItem : Identifiable<NanoId>, Datable, Presentable, Describable {
    public val type: ServiceItemType
    public val service: Service

    public val name: String
    public val address: String // TODO: Use coordinates

    public val serviceItemPoints: Set<ServiceItemPoint>
    public val menus: Set<Menu>
}
