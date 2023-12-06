package nl.pindab0ter.aoc2018.day09

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MarbleManiaKtTest {

    private val values = listOf(
        listOf(9, 25, 32),
        listOf(10, 1618, 8317),
        listOf(13, 7999, 146373),
        listOf(17, 1104, 2764),
        listOf(21, 6111, 54718),
        listOf(30, 5807, 37305)
    )

    @Test
    fun highScore() = values.forEach { (players, lastMarble, expected) ->
        val actual = MarbleMania(players, lastMarble).play()
        Assertions.assertEquals(expected.toLong(), actual)
    }
}