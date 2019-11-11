package lecture02.extension

import lecture02.point.Point

fun Point.isZero(): Boolean = (x == 0) and (y == 0)

fun Point.symmetrical(): Point = copy(x = -x, y = -y)
