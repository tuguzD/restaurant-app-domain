package io.github.tuguzd.restaurantapp.domain.usecase.meal.menu.crud

import io.github.tuguzd.restaurantapp.domain.model.meal.menu.MenuData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.meal.MenuDataRepositoryService
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.DeleteUseCase

public class DeleteMenuUseCase(menuRepository: MenuDataRepositoryService) :
    DeleteUseCase<NanoId, MenuData>(menuRepository)
