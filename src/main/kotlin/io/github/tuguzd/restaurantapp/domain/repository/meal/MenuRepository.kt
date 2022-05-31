package io.github.tuguzd.restaurantapp.domain.repository.meal

import io.github.tuguzd.restaurantapp.domain.model.meal.menu.Menu
import io.github.tuguzd.restaurantapp.domain.repository.util.DomainRepository

public interface MenuRepository : DomainRepository<String, Menu>
