package io.github.tuguzd.restaurantapp.domain.model.organization.service_item

import kotlinx.serialization.Serializable

/**
 * Type of [food service item][ServiceItem] in the application.
 */
@Serializable
public enum class ServiceItemType {
    Mixed,
    Serving,
    Delivery,
}
