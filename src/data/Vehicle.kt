package data

interface Vehicle {
    val id: String
    val brand: String
    val model: String
    val rentalPricePerDay: Double
    var isAvailable: Boolean

    fun rent()
    fun returnVechile()
}