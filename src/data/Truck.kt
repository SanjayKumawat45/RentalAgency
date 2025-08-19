package data

class Truck(
    override val id: String,
    override val brand: String, override val model: String,
    override val rentalPricePerDay: Double,
    override var isAvailable: Boolean = true,
    val loadCapacity : Double,
): Vehicle {
    override fun rent() {
        isAvailable = false
        println("$brand $model rented successfully!")
    }

    override fun returnVechile() {
        isAvailable = true
        println("$brand $model returned successfully!")
    }
}