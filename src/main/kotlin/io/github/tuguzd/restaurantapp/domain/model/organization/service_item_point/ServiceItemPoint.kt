package io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.User
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
    public val creator: User
    public val serviceItem: ServiceItem

    public val name: String

    // can it function or not at all?
    public val availability: Boolean
    public val clientMaxCount: Int
}
