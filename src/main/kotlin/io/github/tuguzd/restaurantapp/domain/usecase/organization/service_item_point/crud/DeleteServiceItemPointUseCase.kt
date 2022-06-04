package io.github.tuguzd.restaurantapp.domain.usecase.organization.service_item_point.crud

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPointData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.organization.ServiceItemPointDataRepositoryService
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.DeleteUseCase

public class DeleteServiceItemPointUseCase(serviceItemPointRepository: ServiceItemPointDataRepositoryService) :
    DeleteUseCase<NanoId, ServiceItemPointData>(serviceItemPointRepository)
