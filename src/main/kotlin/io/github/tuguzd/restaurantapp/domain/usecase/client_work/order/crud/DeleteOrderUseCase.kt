package io.github.tuguzd.restaurantapp.domain.usecase.client_work.order.crud

import io.github.tuguzd.restaurantapp.domain.model.client_work.order.OrderData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.client_work.OrderDataRepositoryService
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.DeleteUseCase

public class DeleteOrderUseCase(orderRepository: OrderDataRepositoryService) :
    DeleteUseCase<NanoId, OrderData>(orderRepository)
