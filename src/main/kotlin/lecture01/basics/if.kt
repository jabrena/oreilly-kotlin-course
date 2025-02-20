package lecture01.basics

val condition = false

fun ifUsage() {
    if (condition) println(42)
    else println(-42)
}

fun `if usage with return type`() {
    val result: Int = if (condition) 42 else -42
    println(result)
}

fun `simplified if usage with return type`() {
    println(if (condition) 42 else -42)
}
