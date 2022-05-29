package io.github.tuguzd.restaurantapp.domain.usecase.meal.menu_item.crud

import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItem
import io.github.tuguzd.restaurantapp.domain.repository.meal.MenuItemRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.FindByIdUseCase

public class FindByIdMenuItemUseCase(menuItemRepository: MenuItemRepository) :
    FindByIdUseCase<String, MenuItem>(menuItemRepository)
