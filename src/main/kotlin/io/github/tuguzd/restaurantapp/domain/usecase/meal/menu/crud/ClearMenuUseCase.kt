package io.github.tuguzd.restaurantapp.domain.usecase.meal.menu.crud

import io.github.tuguzd.restaurantapp.domain.model.meal.menu.MenuData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.meal.MenuDataRepositoryService
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ClearUseCase

public class ClearMenuUseCase(menuRepository: MenuDataRepositoryService) :
    ClearUseCase<NanoId, MenuData>(menuRepository)
