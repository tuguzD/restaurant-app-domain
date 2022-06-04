package io.github.tuguzd.restaurantapp.domain.model.access_control.user

import kotlinx.serialization.Serializable

/**
 * Type of [user][User] in the application.
 */
@Serializable
public enum class UserType {
    Chef,
    Waiter,
    Client,
    Manager,
    LineCook,
    Moderator,
    Administrator,
}
