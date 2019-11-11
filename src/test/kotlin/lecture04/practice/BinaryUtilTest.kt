package lecture04.practice

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

@Disabled
class BinaryUtilTest {

    @Test
    fun `simple convert`() {
        assertEquals("1000", "8".toBinary())
    }

    @Test
    fun `big number convert`() {
        assertEquals(
                "1111011010110111011000000100001000000110100100011001100111111",
                "2222222986345329471".toBinary()
        )
    }

    /*
    @Test(expected = IllegalArgumentException::class)
    fun `null convert`() {
        null.toBinary()
    }

    @Test(expected = NumberFormatException::class)
    fun `broken string convert`() {
        "404e1".toBinary()
    }

     */
}
