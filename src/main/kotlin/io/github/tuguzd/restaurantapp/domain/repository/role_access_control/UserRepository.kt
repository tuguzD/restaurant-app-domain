package io.github.tuguzd.restaurantapp.domain.repository.role_access_control

import io.github.tuguzd.restaurantapp.domain.model.role_access_control.user.User
import io.github.tuguzd.restaurantapp.domain.repository.util.Repository

public interface UserRepository : Repository<String, User>
