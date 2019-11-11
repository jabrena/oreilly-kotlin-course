package lecture01.basics

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


class ValvarKtTest {

    @Test
    fun `check number`() {
        assertEquals(42, number)
    }

    @Test
    fun `check list`() {
        assertEquals(listOf(1, 2, 3, 4), list)
    }

    @Test
    fun `check array`() {
        assertTrue(arrayOf(1, 2, 3, 4).contentEquals(array))
    }

    @Test
    fun `check variable modification`() {
        assertEquals("after", modifyVariable())
    }
}
