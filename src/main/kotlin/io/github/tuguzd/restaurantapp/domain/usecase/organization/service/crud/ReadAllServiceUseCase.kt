package io.github.tuguzd.restaurantapp.domain.usecase.organization.service.crud

import io.github.tuguzd.restaurantapp.domain.model.organization.service.Service
import io.github.tuguzd.restaurantapp.domain.repository.organization.ServiceDomainRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ReadAllUseCase

public class ReadAllServiceUseCase(serviceRepository: ServiceDomainRepository) :
    ReadAllUseCase<String, Service>(serviceRepository)
