package io.github.tuguzd.restaurantapp.domain.usecase.access_control.user.crud

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.UserData
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import io.github.tuguzd.restaurantapp.domain.repository.access_control.UserDataRepositoryService
import io.github.tuguzd.restaurantapp.domain.usecase.util.crud.ClearUseCase

public class ClearUserUseCase(userRepository: UserDataRepositoryService) :
    ClearUseCase<NanoId, UserData>(userRepository)
