package io.github.tuguzd.restaurantapp.domain.repository.meal

import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItem
import io.github.tuguzd.restaurantapp.domain.repository.util.RepositoryService

public interface MenuItemDomainRepository : RepositoryService<String, MenuItem>
