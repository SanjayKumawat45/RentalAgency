package data

interface Vechile {
    val id: String
    val brand: String
    val model: String
    val rentalPricePerDay: Double
    val isAvailable: Boolean

    fun rent()
    fun retrunVechile()
}