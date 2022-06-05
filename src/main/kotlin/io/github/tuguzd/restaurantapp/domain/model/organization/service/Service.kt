package io.github.tuguzd.restaurantapp.domain.model.organization.service

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.User
import io.github.tuguzd.restaurantapp.domain.model.util.*
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Datable
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Describable
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Identifiable
import io.github.tuguzd.restaurantapp.domain.model.util.feature.Presentable

/**
 * Basic interface for food service data representation.
 */
public interface Service : Identifiable<NanoId>, Datable, Presentable, Describable {
    public val creator: User

    public val name: String
}
