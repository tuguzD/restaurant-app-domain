package io.github.tuguzd.restaurantapp.domain.repository.access_control

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.User
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.util.RepositoryService

public interface UserDomainRepository : RepositoryService<NanoId, User> {
    public suspend fun readByUsername(username: String): User?
}
