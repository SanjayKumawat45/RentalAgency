import data.Bike
import data.Car
import data.Customer
import data.RentalAgency
import data.Truck

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val agency = RentalAgency()

    val car1 = Car("C1", "Tesla", "Model S", 2000.0, true, 5)
    val bike1 = Bike("B1", "Yamaha", "R15", 500.0, true, 155.0)
    val truck1 = Truck("Truck", "Turkey", "R15", 500.0, true, 1.0)


    agency.registerVehicle(car1)
    agency.registerVehicle(bike1)
    agency.registerVehicle(truck1)

    val customer1 = Customer("CU1", "Sanjay")
    agency.registerCustomer(customer1)

    agency.showAvailableVehicles()
    agency.rentVehicle("CU1", "C1")
    agency.showAvailableVehicles()
    agency.returnVehicle("CU1", "C1")
    agency.showAvailableVehicles()




}

