package io.github.tuguzd.restaurantapp.domain.usecase.organization.service_item_point.crud

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPoint
import io.github.tuguzd.restaurantapp.domain.repository.organization.ServiceItemPointDomainRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.SaveUseCase

public class SaveServiceItemPointUseCase(serviceItemPointRepository: ServiceItemPointDomainRepository) :
    SaveUseCase<String, ServiceItemPoint>(serviceItemPointRepository)
