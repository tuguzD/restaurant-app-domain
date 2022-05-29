package io.github.tuguzd.restaurantapp.domain.usecase.client_work.order.crud

import io.github.tuguzd.restaurantapp.domain.model.client_work.order.Order
import io.github.tuguzd.restaurantapp.domain.repository.client_work.OrderRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.SaveUseCase

public class SaveOrderUseCase(orderRepository: OrderRepository) :
    SaveUseCase<String, Order>(orderRepository)