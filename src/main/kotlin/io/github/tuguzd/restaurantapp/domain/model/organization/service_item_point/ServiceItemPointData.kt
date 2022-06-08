package io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.UserData
import io.github.tuguzd.restaurantapp.domain.model.organization.service_item.ServiceItemData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.util.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import java.util.*

/**
 * Serializable data of some [food service item point][ServiceItemPoint].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class ServiceItemPointData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val creator: UserData,
    override val serviceItem: ServiceItemData,

    override val name: String,

    @EncodeDefault override val availability: Boolean = true,
    @EncodeDefault override val clientMaxCount: Int = 0,

    @EncodeDefault override val imageUri: String? = null,
    @EncodeDefault override val description: String? = null,

    @EncodeDefault override val datetimeCreate: String = Date().toString(),
    @EncodeDefault override val datetimeModify: String? = null,
) : ServiceItemPoint
