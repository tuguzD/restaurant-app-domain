package io.github.tuguzd.restaurantapp.domain.usecase.client_work.order_item.crud

import io.github.tuguzd.restaurantapp.domain.model.client_work.order_item.OrderItem
import io.github.tuguzd.restaurantapp.domain.repository.client_work.OrderItemRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ReadByIdUseCase

public class ReadByIdOrderItemUseCase(orderItemRepository: OrderItemRepository) :
    ReadByIdUseCase<String, OrderItem>(orderItemRepository)
