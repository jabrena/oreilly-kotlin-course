package lecture02.practice

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

@Disabled
class BasicsTest {

    @Test
    fun `min # two positive params`() {
        assertEquals(1, min(1, 2))
    }

    @Test
    fun `min # two negative params`() {
        assertEquals(-1000, min(-16, -1000))
    }

    @Test
    fun `min # same prarameters`() {
        assertEquals(-1, min(-1, -1))
    }

    @Test
    fun `concat # small strings with blank separator`() {
        assertEquals("abcd", concat(listOf("a", "b", "c", "d"), ""))
    }

    @Test
    fun `concat # small strings with non-empty separator`() {
        assertEquals("1 + 2 + 3 + 4", concat(listOf("1", "2", "3", "4"), " + "))
    }

    @Test
    fun `concat # regular strings with non-empty separator`() {
        assertEquals("hello world", concat(listOf("hello", "world"), " "))
    }
}