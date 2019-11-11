package lecture01.basics

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WhenKtTest {

    @Test
    fun `check one digit`() {
        assertEquals("1 digit", countDigits("1"))
        assertEquals("1 digit", countDigitsSimplified("6"))
    }

    @Test
    fun `check two digits`() {
        assertEquals("2 digits", countDigits("12"))
        assertEquals("2 digits", countDigitsSimplified("56"))
    }

    @Test
    fun `check multiple digits`() {
        assertEquals("many digits", countDigits("15546345"))
        assertEquals("many digits", countDigitsSimplified("122233511"))
    }
}
