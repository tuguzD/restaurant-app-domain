package io.github.tuguzd.restaurantapp.domain.repository.organization

import io.github.tuguzd.restaurantapp.domain.model.organization.service.Service
import io.github.tuguzd.restaurantapp.domain.repository.util.RepositoryService

public interface ServiceDomainRepository : RepositoryService<String, Service>
