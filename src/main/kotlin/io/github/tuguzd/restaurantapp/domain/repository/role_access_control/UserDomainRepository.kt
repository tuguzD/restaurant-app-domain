package io.github.tuguzd.restaurantapp.domain.repository.role_access_control

import io.github.tuguzd.restaurantapp.domain.model.role_access_control.user.User
import io.github.tuguzd.restaurantapp.domain.repository.util.RepositoryService

public interface UserDomainRepository : RepositoryService<String, User>
