package io.github.tuguzd.restaurantapp.domain.util

import com.aventrix.jnanoid.jnanoid.NanoIdUtils
import io.github.tuguzd.restaurantapp.domain.model.util.NanoId
import kotlin.random.Random
import kotlin.random.asJavaRandom
import kotlin.random.asKotlinRandom

/**
 * Utility function for default NanoID generation.
 *
 * The string is generated using the given random number generator.
 *
 * @param random   The random number generator.
 * @param alphabet The symbols used in the NanoId String.
 * @param size     The number of symbols in the NanoId String.
 * @return A randomly generated NanoId String.
 */
public inline fun randomNanoId(
    size: Int = defaultSize,
    random: Random = defaultNumberGenerator,
    alphabet: CharArray = defaultAlphabet,
): NanoId = NanoId(NanoIdUtils.randomNanoId(random.asJavaRandom(), alphabet, size))

/**
 * The default size for NanoID used by this module.
 * Creates NanoId Strings with slightly more unique values than UUID v4.
 */
public inline val defaultSize: Int get() =
    NanoIdUtils.DEFAULT_SIZE

/**
 * The default random number generator for NanoID used by this module.
 * Creates cryptographically strong NanoId Strings.
 */
public inline val defaultNumberGenerator: Random get() =
    NanoIdUtils.DEFAULT_NUMBER_GENERATOR.asKotlinRandom()

/**
 * The default alphabet for NanoID used by this module.
 * Creates url-friendly NanoId Strings using 64 unique symbols.
 */
public inline val defaultAlphabet: CharArray get() =
    NanoIdUtils.DEFAULT_ALPHABET
