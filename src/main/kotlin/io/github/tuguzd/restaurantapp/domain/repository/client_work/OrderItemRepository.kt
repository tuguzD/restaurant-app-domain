package io.github.tuguzd.restaurantapp.domain.repository.client_work

import io.github.tuguzd.restaurantapp.domain.model.client_work.order_item.OrderItem
import io.github.tuguzd.restaurantapp.domain.repository.util.DomainRepository

public interface OrderItemRepository : DomainRepository<String, OrderItem>
