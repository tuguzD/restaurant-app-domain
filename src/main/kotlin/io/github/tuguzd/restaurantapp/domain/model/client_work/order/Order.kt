package io.github.tuguzd.restaurantapp.domain.model.client_work.order

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPoint
import io.github.tuguzd.restaurantapp.domain.model.util.Datable
import io.github.tuguzd.restaurantapp.domain.model.util.Describable
import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable

/**
 * Basic interface for client order data representation.
 */
public interface Order : Identifiable<String>, Datable, Describable {
    // TODO: Make not nullable
    public val serviceItemPoint: ServiceItemPoint?

    public val clientCount: Int
    public val purchased: Boolean
}
