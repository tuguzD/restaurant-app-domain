package io.github.tuguzd.restaurantapp.domain.model.access_control.user

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item.ServiceItem
import io.github.tuguzd.restaurantapp.domain.model.util.*
import io.github.tuguzd.restaurantapp.domain.model.util.feature.*

/**
 * Basic interface for user data representation.
 */
public interface User : Identifiable<NanoId>, Datable, Presentable, Describable {
    public val type: UserType
    public val serviceItem: ServiceItem?

    public val email: String?
    public val username: String
}
