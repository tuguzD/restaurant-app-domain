package io.github.tuguzd.restaurantapp.domain.model.client_work.order

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.User
import io.github.tuguzd.restaurantapp.domain.model.client_work.order_item.OrderItem
import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPoint
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.util.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [client order][Order].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class OrderData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val user: User,
    override val serviceItemPoint: ServiceItemPoint,

    override val clientCount: Int,
    @EncodeDefault override val purchased: Boolean = false,

    @EncodeDefault override val description: String? = null,

    override val datetimeCreate: String,
    @EncodeDefault override val datetimeModify: String? = null,

    @EncodeDefault override val orderItems: Set<OrderItem> = setOf(),
) : Order
