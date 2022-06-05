package io.github.tuguzd.restaurantapp.domain.model.organization.service

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.User
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.util.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [food service][Service].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class ServiceData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val creator: User,

    override val name: String,

    @EncodeDefault override val imageUri: String? = null,
    @EncodeDefault override val description: String? = null,

    override val datetimeCreate: String,
    @EncodeDefault override val datetimeModify: String? = null,
) : Service
