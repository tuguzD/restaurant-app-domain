package io.github.tuguzd.restaurantapp.domain.model.organization.service_item

import com.aventrix.jnanoid.jnanoid.NanoIdUtils.randomNanoId
import io.github.tuguzd.restaurantapp.domain.model.organization.service.Service
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [food service item][ServiceItem].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class ServiceItemData(
    @EncodeDefault override val id: String = randomNanoId(),
    override val type: ServiceItemType,
    @EncodeDefault override val service: Service? = null,

    override val name: String,
    @EncodeDefault override val description: String? = null,

    @EncodeDefault override val address: String? = null,

    @EncodeDefault override val imageUri: String? = null,

    @EncodeDefault override val datetimeCreate: String? = null,
    @EncodeDefault override val datetimeModify: String? = null,
) : ServiceItem
