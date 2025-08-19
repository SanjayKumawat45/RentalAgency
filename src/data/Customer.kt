package data

class Customer(
    val id: String,
    val name: String,
    var rentedVehicles: MutableList<Vehicle> = mutableListOf()
)  {



}