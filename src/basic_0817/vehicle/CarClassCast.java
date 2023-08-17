package basic_0817.vehicle;

public class CarClassCast {
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println(v.name);
        v.whoAmI();
        v.move();
        Vehicle v1 = new Vehicle();
        v1.whoAmI();

        System.out.println("----------");

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = v1;
        vehicles[1] = new Car();
        vehicles[2] = new SportsCar();

        for (Vehicle vehicle : vehicles) {
            vehicle.whoAmI();
        }
    }
}
