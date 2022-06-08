package io.github.tuguzd.restaurantapp.domain.model.client_work.order_item

import io.github.tuguzd.restaurantapp.domain.model.client_work.order.OrderData
import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItemData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.util.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import java.util.*

/**
 * Serializable data of some [client order item][OrderItem].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class OrderItemData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val order: OrderData,
    override val menuItem: MenuItemData,

    @EncodeDefault override val ready: Boolean = false,
    @EncodeDefault override val delivered: Boolean = false,

    @EncodeDefault override val itemCount: Int = 1,

    @EncodeDefault override val description: String? = null,

    @EncodeDefault override val datetimeCreate: String = Date().toString(),
    @EncodeDefault override val datetimeModify: String? = null,
) : OrderItem
