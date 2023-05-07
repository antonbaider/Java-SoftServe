class Passengers {
    int passengers;
    Passengers() {
    }

   Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers(){
    return 0;
}
  void setPassengers(int passengers) {

}
}
interface Vehicle {
}
class WaterVehicle extends Passengers implements Vehicle{
    public WaterVehicle() {
    }

    void isSailing() {
    }

    public WaterVehicle(int passengers) {
        super(passengers);
    }
}
class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle() {}

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    void fly(){};
    void land(){}
}
class GroundVehicle extends Passengers implements Vehicle{
    public GroundVehicle(){}

    public GroundVehicle(int passengers) {
        super(passengers);
    }
    void drive() {}
}
class Liner extends WaterVehicle {
    int floors;
@Override
void isSailing() {}
    public int getFloors() {
        return floors;
    }

    @Override
    public int getPassengers() {
        return super.getPassengers();
    }

    @Override
    void setPassengers(int passengers) {
        super.setPassengers(passengers);
    }

    public Liner() {
        super();
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public Liner(int floors) {
        this.floors = floors;
    }

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }
}
class Boat extends WaterVehicle {
    int volume;
Boat() {}
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Boat(int volume) {
        this.volume = volume;
    }

    @Override
    public int getPassengers() {
        return super.getPassengers();
    }

    @Override
    void setPassengers(int passengers) {
        super.setPassengers(passengers);
    }

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }
    @Override
    void isSailing() {}
}
class Plane extends FlyingVehicle{
    int maxDistance;
Plane () {}
    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public int getPassengers() {
        return super.getPassengers();
    }

    @Override
    void setPassengers(int passengers) {
        super.setPassengers(passengers);
    }

    public Plane(int passengers) {
        super(passengers);
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
    @Override
    void fly(){}
    @Override
    void land(){};
}
class Helicopter extends FlyingVehicle{
    int weight;
    int maxHeight;
    Helicopter(){}
    @Override
    void fly(){}

    @Override
    public int getPassengers() {
        return super.getPassengers();
    }

    @Override
    void setPassengers(int passengers) {
        super.setPassengers(passengers);
    }

    public Helicopter(int passengers) {
        super(passengers);
    }

    @Override
    void land(){};
}
class Bus extends GroundVehicle {
    String route;
Bus() {}
    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Bus(int passengers) {
        super(passengers);
    }

    @Override
    public int getPassengers() {
        return super.getPassengers();
    }

    @Override
    void setPassengers(int passengers) {
        super.setPassengers(passengers);
    }

    @Override
    void drive() {}
}
class Motorcycle extends GroundVehicle {
    int maxSpeed;
Motorcycle() {}
    @Override
    void drive(){}
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getPassengers() {
        return super.getPassengers();
    }

    @Override
    void setPassengers(int passengers) {
        super.setPassengers(passengers);
    }

    public Motorcycle(int passengers) {
        super(passengers);
    }
}
class Car extends GroundVehicle {
    String model;
    Car (){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getPassengers() {
        return super.getPassengers();
    }

    @Override
    void setPassengers(int passengers) {
        super.setPassengers(passengers);
    }

    public Car(int passengers) {
        super(passengers);
    }

    @Override
    void drive(){}
}
