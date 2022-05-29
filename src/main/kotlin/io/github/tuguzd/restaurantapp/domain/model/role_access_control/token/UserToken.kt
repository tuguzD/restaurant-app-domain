package io.github.tuguzd.restaurantapp.domain.model.role_access_control.token

/**
 * User access token which is required to access application server resources.
 */
public interface UserToken {
    public val accessToken: String
}
