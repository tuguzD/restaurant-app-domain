package io.github.tuguzd.restaurantapp.domain.usecase.meal.menu.crud

import io.github.tuguzd.restaurantapp.domain.model.meal.menu.Menu
import io.github.tuguzd.restaurantapp.domain.repository.meal.MenuDomainRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ReadByIdUseCase

public class ReadByIdMenuUseCase(menuRepository: MenuDomainRepository) :
    ReadByIdUseCase<String, Menu>(menuRepository)
