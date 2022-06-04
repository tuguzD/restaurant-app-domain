package io.github.tuguzd.restaurantapp.domain.repository.organization

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item.ServiceItemData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.util.CrudRepositoryService

public interface ServiceItemDataRepositoryService :
    CrudRepositoryService<NanoId, ServiceItemData>
