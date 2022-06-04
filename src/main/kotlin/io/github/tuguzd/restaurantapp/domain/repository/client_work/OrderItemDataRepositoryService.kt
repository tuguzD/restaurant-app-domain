package io.github.tuguzd.restaurantapp.domain.repository.client_work

import io.github.tuguzd.restaurantapp.domain.model.client_work.order_item.OrderItemData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.util.CrudRepositoryService

public interface OrderItemDataRepositoryService :
    CrudRepositoryService<NanoId, OrderItemData>
