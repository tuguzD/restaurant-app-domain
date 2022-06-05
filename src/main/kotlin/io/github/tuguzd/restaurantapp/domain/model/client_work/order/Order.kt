package io.github.tuguzd.restaurantapp.domain.model.client_work.order

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.User
import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPoint
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.model.util.feature.*

/**
 * Basic interface for client order data representation.
 */
public interface Order : Identifiable<NanoId>, Datable, Describable {
    public val creator: User
    public val serviceItemPoint: ServiceItemPoint

    public val clientCount: Int
    public val purchased: Boolean
}
