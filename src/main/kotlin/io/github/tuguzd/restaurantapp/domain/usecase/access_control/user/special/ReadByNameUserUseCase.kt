package io.github.tuguzd.restaurantapp.domain.usecase.access_control.user.special

import io.github.tuguzd.restaurantapp.domain.model.access_control.user.User
import io.github.tuguzd.restaurantapp.domain.repository.access_control.UserDataRepositoryService

public class ReadByNameUserUseCase(
    private val userRepository: UserDataRepositoryService
) : suspend (String) -> User? {
    public override suspend operator fun invoke(id: String): User? =
        userRepository.readByUsername(id)
}
