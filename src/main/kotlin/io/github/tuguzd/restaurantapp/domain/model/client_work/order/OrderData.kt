package io.github.tuguzd.restaurantapp.domain.model.client_work.order

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.UserData
import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPointData
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
    override val creator: UserData,
    override val serviceItemPoint: ServiceItemPointData,

    override val clientCount: Int,
    @EncodeDefault override val purchased: Boolean = false,

    @EncodeDefault override val description: String? = null,

    override val datetimeCreate: String,
    @EncodeDefault override val datetimeModify: String? = null,
) : Order
