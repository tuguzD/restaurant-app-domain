package io.github.tuguzd.restaurantapp.domain.model.role_access_control.user

import io.github.tuguzd.restaurantapp.domain.model.util.Datable
import io.github.tuguzd.restaurantapp.domain.model.util.Describable
import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable
import io.github.tuguzd.restaurantapp.domain.model.util.Presentable

/**
 * Basic interface for user data representation.
 */
public interface User : Identifiable<String>, Datable, Presentable, Describable {
    public val type: UserType

    public val email: String?
    public val username: String
}
