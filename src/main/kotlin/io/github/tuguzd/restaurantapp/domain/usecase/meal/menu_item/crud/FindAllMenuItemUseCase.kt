package io.github.tuguzd.restaurantapp.domain.usecase.meal.menu_item.crud

import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItem
import io.github.tuguzd.restaurantapp.domain.repository.meal.MenuItemRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.FindAllUseCase

public class FindAllMenuItemUseCase(menuItemRepository: MenuItemRepository) :
    FindAllUseCase<String, MenuItem>(menuItemRepository)
