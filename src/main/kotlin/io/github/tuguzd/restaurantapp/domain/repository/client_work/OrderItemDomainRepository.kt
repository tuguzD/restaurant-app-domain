package io.github.tuguzd.restaurantapp.domain.repository.client_work

import io.github.tuguzd.restaurantapp.domain.model.client_work.order_item.OrderItem
import io.github.tuguzd.restaurantapp.domain.repository.util.RepositoryService

public interface OrderItemDomainRepository : RepositoryService<String, OrderItem>
