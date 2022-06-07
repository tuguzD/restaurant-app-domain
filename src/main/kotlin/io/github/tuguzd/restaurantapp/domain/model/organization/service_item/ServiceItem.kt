package io.github.tuguzd.restaurantapp.domain.model.organization.service_item

import io.github.tuguzd.restaurantapp.domain.model.organization.service.Service
import io.github.tuguzd.restaurantapp.domain.model.util.*
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Datable
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Describable
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Identifiable
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Presentable

/**
 * Basic interface for food service item data representation.
 */
public interface ServiceItem : Identifiable<NanoId>, Datable, Presentable, Describable {
    public val serviceItemType: ServiceItemType
    public val service: Service

    public val name: String
    public val address: String // TODO: Use coordinates
}
