package io.github.tuguzd.restaurantapp.domain.usecase.meal.menu.crud

import io.github.tuguzd.restaurantapp.domain.model.meal.menu.Menu
import io.github.tuguzd.restaurantapp.domain.repository.meal.MenuDomainRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ReadAllUseCase

public class ReadAllMenuUseCase(menuRepository: MenuDomainRepository) :
    ReadAllUseCase<String, Menu>(menuRepository)
