package io.github.tuguzd.restaurantapp.domain.repository.organization

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPoint
import io.github.tuguzd.restaurantapp.domain.repository.util.RepositoryService

public interface ServiceItemPointDomainRepository : RepositoryService<String, ServiceItemPoint>
