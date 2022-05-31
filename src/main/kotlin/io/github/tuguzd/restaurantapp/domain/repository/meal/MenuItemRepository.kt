package io.github.tuguzd.restaurantapp.domain.repository.meal

import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItem
import io.github.tuguzd.restaurantapp.domain.repository.util.DomainRepository

public interface MenuItemRepository : DomainRepository<String, MenuItem>
