package io.github.tuguzd.restaurantapp.domain.model.client_work.order

import com.aventrix.jnanoid.jnanoid.NanoIdUtils.randomNanoId
import io.github.tuguzd.restaurantapp.domain.model.client_work.order_item.OrderItem
import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPoint
import io.github.tuguzd.restaurantapp.domain.model.role_access_control.user.User
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [client order][Order].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class OrderData(
    @EncodeDefault override val id: String = randomNanoId(),
    @EncodeDefault override val user: User? = null,
    @EncodeDefault override val serviceItemPoint: ServiceItemPoint? = null,

    @EncodeDefault override val description: String? = null,

    override val clientCount: Int,
    @EncodeDefault override val purchased: Boolean = false,

    @EncodeDefault override val datetimeCreate: String? = null,
    @EncodeDefault override val datetimeModify: String? = null,

    @EncodeDefault override val orderItems: Set<OrderItem> = setOf(),
) : Order
