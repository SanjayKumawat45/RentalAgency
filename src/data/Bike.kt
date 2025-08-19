package data

class Bike(
    override val id: String,
    override val brand: String,
    override val model: String,
    override val rentalPricePerDay: Double,
    override var isAvailable: Boolean,
    var engineCapacity : Double,
): Vechile {
    override fun rent() {
        isAvailable = false
        println("$brand $model rented successfully!")
    }

    override fun retrunVechile() {
        isAvailable =  true
        println("$brand $model returned successfully!")
    }

}