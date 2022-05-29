package io.github.tuguzd.restaurantapp.domain.usecase.organization.service_item.crud

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item.ServiceItem
import io.github.tuguzd.restaurantapp.domain.repository.organization.ServiceItemRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.FindAllUseCase

public class FindAllServiceItemUseCase(serviceItemRepository: ServiceItemRepository) :
    FindAllUseCase<String, ServiceItem>(serviceItemRepository)
