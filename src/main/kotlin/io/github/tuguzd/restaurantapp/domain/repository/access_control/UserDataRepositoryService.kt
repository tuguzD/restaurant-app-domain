package io.github.tuguzd.restaurantapp.domain.repository.access_control

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.UserData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.util.CrudRepositoryService

public interface UserDataRepositoryService :
    CrudRepositoryService<NanoId, UserData> {

    public suspend fun readByUsername(username: String): UserData?
}
