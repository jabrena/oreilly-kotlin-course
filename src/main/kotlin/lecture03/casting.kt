package lecture03

fun cast1(p: Any?): Int = p as Int

fun cast2(p: Any?): Int? = p as Int?

fun cast3(p: Any?): Int? = p as? Int
