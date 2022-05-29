package io.github.tuguzd.restaurantapp.domain.usecase.client_work.order_item.crud

import io.github.tuguzd.restaurantapp.domain.model.client_work.order_item.OrderItem
import io.github.tuguzd.restaurantapp.domain.repository.client_work.OrderItemRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.SaveUseCase

public class SaveOrderItemUseCase(orderItemRepository: OrderItemRepository) :
    SaveUseCase<String, OrderItem>(orderItemRepository)
