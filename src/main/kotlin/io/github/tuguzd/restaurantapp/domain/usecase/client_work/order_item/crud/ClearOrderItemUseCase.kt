package io.github.tuguzd.restaurantapp.domain.usecase.client_work.order_item.crud

import io.github.tuguzd.restaurantapp.domain.model.client_work.order_item.OrderItemData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.client_work.OrderItemDataRepositoryService
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ClearUseCase

public class ClearOrderItemUseCase(orderItemRepository: OrderItemDataRepositoryService) :
    ClearUseCase<NanoId, OrderItemData>(orderItemRepository)
