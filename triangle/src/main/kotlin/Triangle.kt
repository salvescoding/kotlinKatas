import java.lang.IllegalArgumentException

class Triangle(sideOne : Number,sideTwo: Number, sideThree: Number){

    private val sidesTriangle =  listOf(sideOne.toDouble(), sideTwo.toDouble(), sideThree.toDouble())

    init {
        require(sidesTriangle.all { it > 0 }
                && sidesTriangle.all { it < (sidesTriangle - it).sum()})
        { "Sides Violate Triangle Inequality" }
    }

    val isEquilateral: Boolean = sidesTriangle.toSet().size == 1

    val isIsosceles: Boolean = sidesTriangle.toSet().size == 2 || isEquilateral

    val isScalene: Boolean = sidesTriangle.toSet().size == 3

}

