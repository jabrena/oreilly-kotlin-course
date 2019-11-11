package lecture04

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

@Disabled
class VectorTest {

    @Test
    fun `abs comparison`() {
        assertTrue(Vector(100, 10) > Vector(50, 2))
        assertTrue(Vector(50, 2) < Vector(100, 10))
    }

    @Test
    fun `equals comparison`() {
        assertTrue(Vector(100, 10) == Vector(50, 2))
    }
}
