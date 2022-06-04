package io.github.tuguzd.restaurantapp.domain.usecase.client_work.order_item.crud

import io.github.tuguzd.restaurantapp.domain.model.client_work.order_item.OrderItem
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.client_work.OrderItemDomainRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ClearUseCase

public class ClearOrderItemUseCase(orderItemRepository: OrderItemDomainRepository) :
    ClearUseCase<NanoId, OrderItem>(orderItemRepository)
