package io.rybalkinsd.kotlinbootcamp.practice

import lecture02.practice.makeList
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

@Disabled
class ProducerTest {

    @Test
    fun `make a simple list`() {
        assertEquals(listOf(1, 2, 3, 4), makeList(1, 4))
    }

    @Test
    fun `make list with single element`() {
        assertEquals(listOf(1), makeList(1, 1))
    }

    @Test
    fun `make list with broken bounds`() {
        assertEquals(emptyList<Int>(), makeList(1, 0))
    }
}
