interface Vehicle {
}

class Passengers {
    int passengers;

    Passengers() {
    }

    Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return 0;
    }

    void setPassengers(int passengers) {

    }
}

class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle() {
    }

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    void isSailing() {
    }
}

class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    void fly() {
    }

    ;

    void land() {
    }
}

class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle() {
    }

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    void drive() {
    }
}

class Liner extends WaterVehicle {
    int floors;

    public Liner() {
        super();
    }

    public Liner(int floors) {
        this.floors = floors;
    }

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    void isSailing() {
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public int getPassengers() {
        return super.getPassengers();
    }

    @Override
    void setPassengers(int passengers) {
        super.setPassengers(passengers);
    }
}

class Boat extends WaterVehicle {
    int volume;

    Boat() {
    }

    public Boat(int volume) {
        this.volume = volume;
    }

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
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

    @Override
    void isSailing() {
    }
}

class Plane extends FlyingVehicle {
    int maxDistance;

    Plane() {
    }

    public Plane(int passengers) {
        super(passengers);
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
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
    void fly() {
    }

    @Override
    void land() {
    }

    ;
}

class Helicopter extends FlyingVehicle {
    int weight;
    int maxHeight;

    Helicopter() {
    }

    public Helicopter(int passengers) {
        super(passengers);
    }

    @Override
    void fly() {
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
    void land() {
    }

    ;
}

class Bus extends GroundVehicle {
    String route;

    Bus() {
    }

    public Bus(int passengers) {
        super(passengers);
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
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
    void drive() {
    }
}

class Motorcycle extends GroundVehicle {
    int maxSpeed;

    Motorcycle() {
    }

    public Motorcycle(int passengers) {
        super(passengers);
    }

    @Override
    void drive() {
    }

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
}

class Car extends GroundVehicle {
    String model;

    Car() {
    }

    public Car(int passengers) {
        super(passengers);
    }

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

    @Override
    void drive() {
    }
}
