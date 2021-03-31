fun main() {
    val pointOne = Point(1, 2)
    val pointTwo = Point(2, 2)
    println(pointOne == pointTwo)
    pointOne.rotateX()
    print(pointOne)
}

data class Point(var x: Int, var y: Int) {

    override fun toString() = "x = $x y = $y"

    override fun equals(other: Any?) = if (other is Point) {
        this.x == other.x && this.y == other.y
    } else false

    fun rotateX() {
        y = -y
    }
}