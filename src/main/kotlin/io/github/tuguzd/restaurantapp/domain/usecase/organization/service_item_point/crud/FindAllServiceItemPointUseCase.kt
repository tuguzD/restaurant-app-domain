package io.github.tuguzd.restaurantapp.domain.usecase.organization.service_item_point.crud

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPoint
import io.github.tuguzd.restaurantapp.domain.repository.organization.ServiceItemPointRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.FindAllUseCase

public class FindAllServiceItemPointUseCase(serviceItemPointRepository: ServiceItemPointRepository) :
    FindAllUseCase<String, ServiceItemPoint>(serviceItemPointRepository)
