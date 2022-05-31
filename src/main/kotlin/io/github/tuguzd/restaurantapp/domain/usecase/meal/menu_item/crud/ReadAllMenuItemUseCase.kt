package io.github.tuguzd.restaurantapp.domain.usecase.meal.menu_item.crud

import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItem
import io.github.tuguzd.restaurantapp.domain.repository.meal.MenuItemDomainRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ReadAllUseCase

public class ReadAllMenuItemUseCase(menuItemRepository: MenuItemDomainRepository) :
    ReadAllUseCase<String, MenuItem>(menuItemRepository)
