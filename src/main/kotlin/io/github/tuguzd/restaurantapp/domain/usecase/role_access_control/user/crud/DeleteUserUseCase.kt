package io.github.tuguzd.restaurantapp.domain.usecase.role_access_control.user.crud

import io.github.tuguzd.restaurantapp.domain.model.role_access_control.user.User
import io.github.tuguzd.restaurantapp.domain.repository.role_access_control.UserDomainRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.DeleteUseCase

public class DeleteUserUseCase(userRepository: UserDomainRepository) :
    DeleteUseCase<String, User>(userRepository)
