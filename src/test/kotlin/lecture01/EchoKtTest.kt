package lecture01

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class EchoKtTest {

    @Test
    fun `test echo`() {
        assertEquals("hello", echo("hello"))
    }
}