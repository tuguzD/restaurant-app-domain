package io.github.tuguzd.restaurantapp.domain.model.util.feature

/**
 * Represent objects which * has
 * [creation][datetimeCreate] and [modification][datetimeModify] dates.
 */
public interface Datable {
    public val datetimeCreate: String // TODO: Use datetime
    public val datetimeModify: String? // TODO: Use datetime
}
