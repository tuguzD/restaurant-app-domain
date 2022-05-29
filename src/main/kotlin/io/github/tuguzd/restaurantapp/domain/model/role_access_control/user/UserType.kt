package io.github.tuguzd.restaurantapp.domain.model.role_access_control.user

import kotlinx.serialization.Serializable

/**
 * Type of [user][User] in the application.
 */
@Serializable
public enum class UserType {
    Chef,
    Waiter,
    Manager,
    LineCook,
    Moderator,
    Administrator,
}
