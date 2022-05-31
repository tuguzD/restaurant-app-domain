package io.github.tuguzd.restaurantapp.domain.usecase.client_work.order.crud

import io.github.tuguzd.restaurantapp.domain.model.client_work.order.Order
import io.github.tuguzd.restaurantapp.domain.repository.client_work.OrderDomainRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.DeleteUseCase

public class DeleteOrderUseCase(orderRepository: OrderDomainRepository) :
    DeleteUseCase<String, Order>(orderRepository)
