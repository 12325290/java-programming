class class_obj {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelLiters;
    int noOfSeats;


    public void drive(){
        System.out.println("car is driving");
        currentFuelLiters--;

    }

    public void addFuel(float fuel){
        currentFuelLiters+= fuel;
    }

    public float  getCurrentFuelLevel(){
        return currentFuelLiters;
    }
}

public class driver{
    public static void main(String[] args) {
        class_obj obj = new class_obj();
        obj.drive();
    }
}

