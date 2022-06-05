package io.github.tuguzd.restaurantapp.domain.model.access_control.user

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item.ServiceItem
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.util.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [user][User].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class UserData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val type: UserType,
    @EncodeDefault override val serviceItem: ServiceItem? = null,

    @EncodeDefault override val email: String? = null,
    override val username: String,

    @EncodeDefault override val imageUri: String? = null,
    @EncodeDefault override val description: String? = null,

    override val datetimeCreate: String,
    @EncodeDefault override val datetimeModify: String? = null,
) : User
