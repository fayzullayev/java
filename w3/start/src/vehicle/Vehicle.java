package vehicle;

public class Vehicle {
    human.Human who;
}


class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        System.out.println(vehicle.who);
    }
}