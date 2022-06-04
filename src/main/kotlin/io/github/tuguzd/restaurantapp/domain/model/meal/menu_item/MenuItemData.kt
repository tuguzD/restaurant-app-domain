package io.github.tuguzd.restaurantapp.domain.model.meal.menu_item

import io.github.tuguzd.restaurantapp.domain.model.client_work.order_item.OrderItem
import io.github.tuguzd.restaurantapp.domain.model.meal.menu.Menu
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.util.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [menu item][MenuItem].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class MenuItemData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val type: MenuItemType,
    override val menu: Menu,

    @EncodeDefault override val imageUri: String? = null,
    @EncodeDefault override val description: String? = null,

    override val datetimeCreate: String,
    @EncodeDefault override val datetimeModify: String? = null,

    @EncodeDefault override val orderItems: Set<OrderItem> = setOf(),
) : MenuItem
