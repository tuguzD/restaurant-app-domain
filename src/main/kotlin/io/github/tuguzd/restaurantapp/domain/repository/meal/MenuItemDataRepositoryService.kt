package io.github.tuguzd.restaurantapp.domain.repository.meal

import io.github.tuguzd.restaurantapp.domain.model.meal.menu_item.MenuItemData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.util.CrudRepositoryService

public interface MenuItemDataRepositoryService :
    CrudRepositoryService<NanoId, MenuItemData>
