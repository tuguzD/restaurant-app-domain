package io.github.tuguzd.restaurantapp.domain.model.meal.menu

import com.aventrix.jnanoid.jnanoid.NanoIdUtils.randomNanoId
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

/**
 * Serializable data of some [menu][Menu].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class MenuData(
    @EncodeDefault override val id: String = randomNanoId(),
    override val type: MenuType,

    override val name: String,
    @EncodeDefault override val description: String? = null,

    @EncodeDefault override val imageUri: String? = null,

    @EncodeDefault override val datetimeCreate: String? = null,
    @EncodeDefault override val datetimeModify: String? = null,
) : Menu
