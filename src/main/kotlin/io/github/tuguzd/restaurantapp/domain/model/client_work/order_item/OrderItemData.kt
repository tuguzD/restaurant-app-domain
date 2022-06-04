package io.github.tuguzd.restaurantapp.domain.model.client_work.order_item

import io.github.tuguzd.restaurantapp.domain.model.client_work.order.Order
import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItem
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.util.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [client order item][OrderItem].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class OrderItemData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val order: Order,
    override val menuItem: MenuItem,

    @EncodeDefault override val itemCount: Int = 1,

    @EncodeDefault override val description: String? = null,

    override val datetimeCreate: String,
    @EncodeDefault override val datetimeModify: String? = null,
) : OrderItem
