import kotlin.math.PI
import kotlin.math.sqrt
fun main() {
	val squareCabin = SquareCabin(6,50.0)
    val roundHut = RoundHut(3, 10.0)
    val roundTower = RoundTower(6,15.5)
    
    with(squareCabin) {
        println("\nSquare Cabin\n===========")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
        getRoom()
    }
    
    with(roundHut) {
        println("\nRound Hut\n=========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
        getRoom()
        println("Carpet Length: ${calculateMaxCarpetLength()}")
	}
    
    with(roundTower) {
        println("\nRound Tower\n==========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
		println("Floor area: ${floorArea()}")
        getRoom()
        println("Carpet Length: ${calculateMaxCarpetLength()}")
    }
}

abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int
    
    abstract fun floorArea(): Double
    fun hasRoom(): Boolean {
        return residents<capacity
    }
    
    fun getRoom() {
        if(hasRoom()) {
            residents++
            println("You got a room!")
        }
        else
        	println("Sorry, at capacity and no rooms left.")
    }
}

class SquareCabin(resident: Int, val length: Double): Dwelling(resident) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
    
    override fun floorArea(): Double {
        return length*length
    }
}

open class RoundHut(
    resident: Int, 
    val radius: Double): Dwelling(resident) {
    override val buildingMaterial = "Straw"
    override val capacity = 5	
    
    override fun floorArea(): Double {
        return PI * radius * radius
    }
    
    fun calculateMaxCarpetLength(): Double {
        return sqrt(2.0) * radius
    }

}

class RoundTower(
    resident: Int, 
    radius: Double,
    val floors: Int = 2): RoundHut(resident,radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
    
    override fun floorArea(): Double {
    	return super.floorArea() * floors
	}

}
