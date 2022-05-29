package io.github.tuguzd.restaurantapp.domain.model.organization.service

import io.github.tuguzd.restaurantapp.domain.model.util.Datable
import io.github.tuguzd.restaurantapp.domain.model.util.Describable
import io.github.tuguzd.restaurantapp.domain.model.util.Identifiable
import io.github.tuguzd.restaurantapp.domain.model.util.Presentable

/**
 * Basic interface for food service data representation.
 */
public interface Service : Identifiable<String>, Datable, Presentable, Describable {
    public val name: String
}
