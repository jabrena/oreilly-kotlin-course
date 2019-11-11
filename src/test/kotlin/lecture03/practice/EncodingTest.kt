package lecture03.practice

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test


@Disabled
class EncodingTest {

    @Test
    fun `encode # abc`() {
        assertEquals("AlfaBravoCharlie", "abc".encode())
    }

    @Test
    fun `encode # kotlin`() {
        assertEquals("KiloOscarTangoLimaIndiaNovember", "kotlin".encode())
    }

    @Test
    fun `encode # ab 123c`() {
        assertEquals("AlfaBravo 123Charlie", "ab 123c".encode())
    }

    @Test
    fun `reverse association`() {
        assertTrue(reversedAssociation.containsKey("Alfa"))
        assertTrue(reversedAssociation.containsKey("Bravo"))
        assertTrue(reversedAssociation.containsKey("Charlie"))
    }

    @Test
    fun `decode # abc`() {
        assertEquals("abc", "AlfaBravoCharlie".decode())
    }

    @Test
    fun `decode # Abc`() {
        assertEquals("Abc", "AlfaBravoCharlie".decode())
    }

    @Test
    fun `decode # AlfaBravo 123Charlie`() {
        assertEquals("ab 123c", "AlfaBravo 123Charlie".decode())
    }

    @Test
    fun `decode # Charliee`() {
        assertNull("Charliee".decode())
    }

    @Test
    fun `decode # Charli 1`() {
        assertNull("Charli 1".decode())
    }
}
