package io.github.tuguzd.restaurantapp.domain.model.role_access_control.credential

/**
 * User credentials such as username and password.
 */
public interface UserCredentials {
    public val username: String
    public val password: String
}
