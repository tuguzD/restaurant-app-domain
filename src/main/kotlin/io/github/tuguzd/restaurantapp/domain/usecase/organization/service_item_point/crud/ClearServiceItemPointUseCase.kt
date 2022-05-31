package io.github.tuguzd.restaurantapp.domain.usecase.organization.service_item_point.crud

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPoint
import io.github.tuguzd.restaurantapp.domain.repository.organization.ServiceItemPointDomainRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ClearUseCase

public class ClearServiceItemPointUseCase(serviceItemPointRepository: ServiceItemPointDomainRepository) :
    ClearUseCase<String, ServiceItemPoint>(serviceItemPointRepository)
