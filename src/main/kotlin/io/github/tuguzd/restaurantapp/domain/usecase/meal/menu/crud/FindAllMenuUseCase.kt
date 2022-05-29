package io.github.tuguzd.restaurantapp.domain.usecase.meal.menu.crud

import io.github.tuguzd.restaurantapp.domain.model.meal.menu.Menu
import io.github.tuguzd.restaurantapp.domain.repository.meal.MenuRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.FindAllUseCase

public class FindAllMenuUseCase(menuRepository: MenuRepository) :
    FindAllUseCase<String, Menu>(menuRepository)
