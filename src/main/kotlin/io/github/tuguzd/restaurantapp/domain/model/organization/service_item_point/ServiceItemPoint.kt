package io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point

import io.github.tuguzd.restaurantapp.domain.model.client_work.order.Order
import io.github.tuguzd.restaurantapp.domain.model.organization.service_item.ServiceItem
import io.github.tuguzd.restaurantapp.domain.model.util.*
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Datable
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Describable
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Identifiable
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Presentable

/**
 * Basic interface for food service item point data representation.
 */
public interface ServiceItemPoint : Identifiable<NanoId>, Datable, Presentable, Describable {
    public val serviceItem: ServiceItem

    public val name: String

    public val availability: Boolean
    public val clientMaxCount: Int

    public val orders: Set<Order>
}
