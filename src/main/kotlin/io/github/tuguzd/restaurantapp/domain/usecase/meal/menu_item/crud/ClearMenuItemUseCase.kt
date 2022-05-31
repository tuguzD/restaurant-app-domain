package io.github.tuguzd.restaurantapp.domain.usecase.meal.menu_item.crud

import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItem
import io.github.tuguzd.restaurantapp.domain.repository.meal.MenuItemDomainRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ClearUseCase

public class ClearMenuItemUseCase(menuItemRepository: MenuItemDomainRepository) :
    ClearUseCase<String, MenuItem>(menuItemRepository)
