package io.github.tuguzd.restaurantapp.domain.model.meal.menu_item

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.UserData
import io.github.tuguzd.restaurantapp.domain.model.meal.menu.MenuData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.util.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import java.util.*

/**
 * Serializable data of some [menu item][MenuItem].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class MenuItemData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val menuItemType: MenuItemType,
    override val menu: MenuData,
    override val creator: UserData,

    override val name: String,

    @EncodeDefault override val imageUri: String? = null,
    @EncodeDefault override val description: String? = null,

    @EncodeDefault override val datetimeCreate: String = Date().toString(),
    @EncodeDefault override val datetimeModify: String? = null,
) : MenuItem
