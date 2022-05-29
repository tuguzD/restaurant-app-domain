package io.github.tuguzd.restaurantapp.domain.model.role_access_control.token

import kotlinx.serialization.Serializable

/**
 * Serializable data of [user token][UserToken].
 */
@Serializable
public data class UserTokenData(override val accessToken: String) : UserToken
