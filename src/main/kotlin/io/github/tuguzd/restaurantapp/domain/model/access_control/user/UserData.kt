package io.github.tuguzd.restaurantapp.domain.model.access_control.user

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item.ServiceItemData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.util.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import java.util.*

/**
 * Serializable data of some [user][User].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class UserData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val userType: UserType,
    @EncodeDefault override val serviceItem: ServiceItemData? = null,

    @EncodeDefault override val email: String? = null,
    override val username: String,

    @EncodeDefault override val imageUri: String? = null,
    @EncodeDefault override val description: String? = null,

    @EncodeDefault override val datetimeCreate: String = Date().toString(),
    @EncodeDefault override val datetimeModify: String? = null,
) : User
