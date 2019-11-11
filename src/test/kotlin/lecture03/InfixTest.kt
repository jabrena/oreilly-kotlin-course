package lecture03

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InfixTest {

    @Test
    fun `old multiply`() {
        assertEquals(8, 2.multiply(2).multiply(2))
    }

    @Test
    fun `infix multiply`() {
        assertEquals(8, 2 multiply 2 multiply 2)
    }
}
