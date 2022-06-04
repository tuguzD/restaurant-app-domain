package io.github.tuguzd.restaurantapp.domain.usecase.meal.menu_item.crud

import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItemData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.meal.MenuItemDataRepositoryService
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ClearUseCase

public class ClearMenuItemUseCase(menuItemRepository: MenuItemDataRepositoryService) :
    ClearUseCase<NanoId, MenuItemData>(menuItemRepository)
