package io.github.tuguzd.restaurantapp.domain.model.util

/**
 * Represent objects which * has
 * [creation][datetimeCreate] and [modification][datetimeModify] dates.
 */
public interface Datable {
    public val datetimeCreate: String? // TODO: Make not nullable, use datetime
    public val datetimeModify: String? // TODO: Use datetime
}
