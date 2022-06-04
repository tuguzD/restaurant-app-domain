package io.github.tuguzd.restaurantapp.domain.usecase.organization.service_item.crud

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item.ServiceItemData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.organization.ServiceItemDataRepositoryService
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ReadByIdUseCase

public class ReadByIdServiceItemUseCase(serviceItemRepository: ServiceItemDataRepositoryService) :
    ReadByIdUseCase<NanoId, ServiceItemData>(serviceItemRepository)
