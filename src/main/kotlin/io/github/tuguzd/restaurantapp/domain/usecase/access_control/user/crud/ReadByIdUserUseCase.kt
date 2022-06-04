package io.github.tuguzd.restaurantapp.domain.usecase.access_control.user.crud

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.User
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.access_control.UserDomainRepository
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ReadByIdUseCase

public class ReadByIdUserUseCase(userRepository: UserDomainRepository) :
    ReadByIdUseCase<NanoId, User>(userRepository)
