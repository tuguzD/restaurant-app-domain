package io.github.tuguzd.restaurantapp.domain.model.organization.service_item

import io.github.tuguzd.restaurantapp.domain.model.organization.service.Service
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.util.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [food service item][ServiceItem].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class ServiceItemData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val serviceItemType: ServiceItemType,
    override val service: Service,

    override val name: String,
    override val address: String,

    @EncodeDefault override val imageUri: String? = null,
    @EncodeDefault override val description: String? = null,

    override val datetimeCreate: String,
    @EncodeDefault override val datetimeModify: String? = null,
) : ServiceItem
