package io.github.tuguzd.restaurantapp.domain.model.role_access_control.user

import com.aventrix.jnanoid.jnanoid.NanoIdUtils.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [user][User].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class UserData(
    @EncodeDefault override val id: String = randomNanoId(),
    override val type: UserType,

    @EncodeDefault override val email: String? = null,
    override val username: String,

    @EncodeDefault override val imageUri: String? = null,
    @EncodeDefault override val description: String? = null,

    @EncodeDefault override val datetimeCreate: String? = null,
    @EncodeDefault override val datetimeModify: String? = null,
) : User
