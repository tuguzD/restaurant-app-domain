package io.github.tuguzd.restaurantapp.domain.usecase.client_work.order.crud

import io.github.tuguzd.restaurantapp.domain.model.client_work.order.Order
import io.github.tuguzd.restaurantapp.domain.repository.client_work.OrderDomainRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ReadByIdUseCase

public class ReadByIdOrderUseCase(orderRepository: OrderDomainRepository) :
    ReadByIdUseCase<String, Order>(orderRepository)
