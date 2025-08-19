package data

class RentalAgency {
    private val vehicles = mutableListOf<Vehicle>()
    private val customers = mutableListOf<Customer>()

    fun registerVehicle(vehicle: Vehicle) {
        vehicles.add(vehicle)
        println("${vehicle.brand} ${vehicle.model} registered successfully!")
    }

    fun registerCustomer(customer: Customer) {
        customers.add(customer)
        println("customer ${customer.name} registered successfully!")
    }

    fun showAvailableVehicles(){
        println("Available vehicles: ${vehicles.size}")
        vehicles.filter { it.isAvailable }.forEach {
            println("- ${it.brand} ${it.model} (ID: ${it.id}, Price/Day: ${it.rentalPricePerDay})")
        }
    }

    fun rentVehicle(customerId: String, vehicleId: String) {
        val customer = customers.find { it.id == customerId }
        val vehicle = vehicles.find { it.id == vehicleId }
        if (vehicle != null && customer != null && vehicle.isAvailable) {
            vehicle.rent()
            customer.rentedVehicles.add(vehicle)
        }
        else{
            println("Either vehicle is not available or customer/vehicle not found.")
        }
    }

    fun returnVehicle(customerId: String, vehicleId: String) {
        val customer = customers.find { it.id == customerId }
        val vehicle = customer?.rentedVehicles?.find { it.id == vehicleId }
        if (vehicle != null && customer != null) {
            vehicle.returnVechile()
            customer.rentedVehicles.remove(vehicle)
        }
        else{
            println("No record found for this customer/vehicle.")
        }
    }


}