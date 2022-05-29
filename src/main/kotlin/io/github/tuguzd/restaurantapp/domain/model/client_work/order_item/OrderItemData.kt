package io.github.tuguzd.restaurantapp.domain.model.client_work.order_item

import com.aventrix.jnanoid.jnanoid.NanoIdUtils.randomNanoId
import io.github.tuguzd.restaurantapp.domain.model.client_work.order.Order
import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItem
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [client order item][OrderItem].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class OrderItemData(
    @EncodeDefault override val id: String = randomNanoId(),

    override val order: Order,
    override val menuItem: MenuItem,

    @EncodeDefault override val itemCount: Int = 1,
    @EncodeDefault override val description: String? = null,

    @EncodeDefault override val datetimeCreate: String? = null,
    @EncodeDefault override val datetimeModify: String? = null,
) : OrderItem
