package io.github.tuguzd.restaurantapp.domain.usecase.organization.service.crud

import io.github.tuguzd.restaurantapp.domain.model.organization.service.Service
import io.github.tuguzd.restaurantapp.domain.repository.organization.ServiceRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.FindAllUseCase

public class FindAllServiceUseCase(serviceRepository: ServiceRepository) :
    FindAllUseCase<String, Service>(serviceRepository)
