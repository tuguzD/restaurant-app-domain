package io.github.tuguzd.restaurantapp.domain.usecase.organization.service.crud

import io.github.tuguzd.restaurantapp.domain.model.organization.service.ServiceData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.organization.ServiceDataRepositoryService
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ReadAllUseCase

public class ReadAllServiceUseCase(serviceRepository: ServiceDataRepositoryService) :
    ReadAllUseCase<NanoId, ServiceData>(serviceRepository)
