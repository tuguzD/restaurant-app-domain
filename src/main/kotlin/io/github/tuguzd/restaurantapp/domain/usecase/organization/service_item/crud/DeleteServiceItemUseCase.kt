package io.github.tuguzd.restaurantapp.domain.usecase.organization.service_item.crud

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item.ServiceItem
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.organization.ServiceItemDomainRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.DeleteUseCase

public class DeleteServiceItemUseCase(serviceItemRepository: ServiceItemDomainRepository) :
    DeleteUseCase<NanoId, ServiceItem>(serviceItemRepository)
