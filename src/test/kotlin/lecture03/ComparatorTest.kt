package lecture03

import org.junit.jupiter.api.Test

class ComparatorTest {

    @Test
    fun `case insensitive comparator`() {
        listOf("A", "b", "X", "C", "c", "d", "abc")
            .sortedWith(CaseInsensitiveComparator)
            .also {
                println(it)
            }
    }
}