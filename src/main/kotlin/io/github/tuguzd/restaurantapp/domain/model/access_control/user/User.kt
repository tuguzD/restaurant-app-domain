package io.github.tuguzd.restaurantapp.domain.model.access_control.user

import io.github.tuguzd.restaurantapp.domain.model.client_work.order.Order
import io.github.tuguzd.restaurantapp.domain.model.util.*

/**
 * Basic interface for user data representation.
 */
public interface User : Identifiable<NanoId>, Datable, Presentable, Describable {
    public val type: UserType

    public val email: String?
    public val username: String

    public val orders: Set<Order>
}
