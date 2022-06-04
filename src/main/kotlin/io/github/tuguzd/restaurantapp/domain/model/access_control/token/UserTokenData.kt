package io.github.tuguzd.restaurantapp.domain.model.access_control.token

import kotlinx.serialization.Serializable

/**
 * Serializable data of [user token][UserToken].
 */
@Serializable
public data class UserTokenData(override val token: String) : UserToken
