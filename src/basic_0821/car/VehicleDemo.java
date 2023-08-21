package basic_0821.car;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new FireTruck(), new Ambulance(), new NomalCar()};

        for (Vehicle vehicle : vehicles) {
            vehicle.forward();
            vehicle.backward();
            action(vehicle);
            System.out.println("-------------------------");
        }
    }
    static void action(Vehicle vehicle) {
        if(vehicle instanceof FireTruck) {
            ((FireTruck) vehicle).water();
        } else if(vehicle instanceof Ambulance) {
            ((Ambulance) vehicle).siren();
        } else if(vehicle instanceof NomalCar) {
            vehicle.forward();
        }
    }
}

interface Vehicle {
    void forward();
    void backward();
}
class NomalCar implements Vehicle {

    @Override
    public void forward() {
        System.out.println("앞으로 간다.");
    }

    @Override
    public void backward() {
        System.out.println("뒤로 간다.");
    }
}

class FireTruck extends NomalCar {
    public void water() {
        System.out.println("물을 뿜는다.");
    }
}

class Ambulance extends NomalCar {
    public void siren() {
        System.out.println("싸이렌을 울린다.");
    }
}
