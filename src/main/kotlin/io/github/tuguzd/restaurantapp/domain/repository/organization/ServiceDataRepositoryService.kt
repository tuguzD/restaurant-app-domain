package io.github.tuguzd.restaurantapp.domain.repository.organization

import io.github.tuguzd.restaurantapp.domain.model.organization.service.ServiceData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.util.CrudRepositoryService

public interface ServiceDataRepositoryService :
    CrudRepositoryService<NanoId, ServiceData>
