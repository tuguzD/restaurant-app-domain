package io.github.tuguzd.restaurantapp.domain.model.client_work.order

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.UserData
import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPointData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.util.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import java.util.Date

/**
 * Serializable data of some [client order][Order].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class OrderData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val creator: UserData,
    @EncodeDefault override val serviceItemPoint: ServiceItemPointData? = null,

    override val clientCount: Int,
    @EncodeDefault override val purchased: Boolean = false,

    @EncodeDefault override val description: String? = null,

    @EncodeDefault override val datetimeCreate: String = Date().toString(),
    @EncodeDefault override val datetimeModify: String? = null,
) : Order
