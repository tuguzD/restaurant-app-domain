package io.github.tuguzd.restaurantapp.domain.model.role_access_control.credential

import kotlinx.serialization.Serializable

/**
 * Serializable data of some [user credentials][UserCredentials].
 */
@Serializable
public data class UserCredentialsData(
    override val username: String,
    override val password: String,
) : UserCredentials
