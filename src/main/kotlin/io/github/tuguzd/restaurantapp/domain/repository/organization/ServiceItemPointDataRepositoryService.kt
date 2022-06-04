package io.github.tuguzd.restaurantapp.domain.repository.organization

import io.github.tuguzd.restaurantapp.domain.model.organization.service_item_point.ServiceItemPointData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.util.CrudRepositoryService

public interface ServiceItemPointDataRepositoryService :
    CrudRepositoryService<NanoId, ServiceItemPointData>
