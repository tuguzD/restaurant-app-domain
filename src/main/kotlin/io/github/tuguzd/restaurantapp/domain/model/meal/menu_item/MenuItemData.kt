package io.github.tuguzd.restaurantapp.domain.model.meal.menu_item

import com.aventrix.jnanoid.jnanoid.NanoIdUtils.randomNanoId
import io.github.tuguzd.restaurantapp.domain.model.meal.menu.Menu
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [menu item][MenuItem].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class MenuItemData(
    @EncodeDefault override val id: String = randomNanoId(),
    override val type: MenuItemType,
    @EncodeDefault override val menu: Menu? = null,

    @EncodeDefault override val description: String? = null,

    @EncodeDefault override val imageUri: String? = null,

    @EncodeDefault override val datetimeCreate: String? = null,
    @EncodeDefault override val datetimeModify: String? = null,
) : MenuItem
