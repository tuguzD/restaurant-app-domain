package io.github.tuguzd.restaurantapp.domain.repository.client_work

import io.github.tuguzd.restaurantapp.domain.model.client_work.order.Order
import io.github.tuguzd.restaurantapp.domain.repository.util.DomainRepository

public interface OrderRepository : DomainRepository<String, Order>
