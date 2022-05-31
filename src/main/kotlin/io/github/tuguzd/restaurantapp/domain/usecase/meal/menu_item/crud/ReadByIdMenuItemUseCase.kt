package io.github.tuguzd.restaurantapp.domain.usecase.meal.menu_item.crud

import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItem
import io.github.tuguzd.restaurantapp.domain.repository.meal.MenuItemRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ReadByIdUseCase

public class ReadByIdMenuItemUseCase(menuItemRepository: MenuItemRepository) :
    ReadByIdUseCase<String, MenuItem>(menuItemRepository)