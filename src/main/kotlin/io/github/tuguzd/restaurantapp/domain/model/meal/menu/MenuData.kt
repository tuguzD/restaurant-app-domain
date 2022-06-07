package io.github.tuguzd.restaurantapp.domain.model.meal.menu

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.User
import io.github.tuguzd.restaurantapp.domain.model.organization.service_item.ServiceItem
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.util.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [menu][Menu].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class MenuData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val menuType: MenuType,
    override val creator: User,
    override val serviceItem: ServiceItem,

    override val name: String,

    @EncodeDefault override val imageUri: String? = null,
    @EncodeDefault override val description: String? = null,

    override val datetimeCreate: String,
    @EncodeDefault override val datetimeModify: String? = null,
) : Menu
