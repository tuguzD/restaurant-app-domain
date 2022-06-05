package io.github.tuguzd.restaurantapp.domain.repository.util

import io.github.tuguzd.restaurantapp.domain.model.util.feature.Identifiable
import io.github.tuguzd.restaurantapp.domain.repository.util.crud.*

/**
 * Base interface for all CRUD repositories which contains data of type [T].
 */
public interface CrudRepositoryService<I, T : Identifiable<I>> :
    ReadAllRepositoryService<I, T>,
    ReadByIdRepositoryService<I, T>,
    SaveRepositoryService<I, T>,
    DeleteRepositoryService<I>,
    ClearRepositoryService
