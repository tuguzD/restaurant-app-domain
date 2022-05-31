package io.github.tuguzd.restaurantapp.domain.repository.organization

import io.github.tuguzd.restaurantapp.domain.model.organization.service.Service
import io.github.tuguzd.restaurantapp.domain.repository.util.DomainRepository

public interface ServiceRepository : DomainRepository<String, Service>
