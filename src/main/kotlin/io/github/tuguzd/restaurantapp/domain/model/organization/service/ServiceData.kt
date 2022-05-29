package io.github.tuguzd.restaurantapp.domain.model.organization.service

import com.aventrix.jnanoid.jnanoid.NanoIdUtils.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [food service][Service].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class ServiceData(
    @EncodeDefault override val id: String = randomNanoId(),

    override val name: String,
    @EncodeDefault override val description: String? = null,

    @EncodeDefault override val imageUri: String? = null,

    @EncodeDefault override val datetimeCreate: String? = null,
    @EncodeDefault override val datetimeModify: String? = null,
) : Service
