package io.github.tuguzd.restaurantapp.domain.repository.organization

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item.ServiceItem
import io.github.tuguzd.restaurantapp.domain.repository.util.DomainRepository

public interface ServiceItemRepository : DomainRepository<String, ServiceItem>
