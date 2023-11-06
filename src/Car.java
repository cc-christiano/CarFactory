public class Car {
    public String color;
    public int height;
    public int numDoors;
    public int numWheels;
    public String model;

    public void printInfo(){
        System.out.println("The car's color: " + color);
        System.out.println("The height of the car in feet is: " + height);
        System.out.println("The number of doors is: " + numDoors);
        System.out.println("The number of wheels is: " + numWheels);
        System.out.println("The model of the car is: " + model);

        // orange has orange, circle, one, yes, 200

    }


    public Car(String paramColor, int paramHeight, int paramNumDoors, int paramNumWheels, String paramModel) {
        color = paramColor;
        height = paramHeight;
        numDoors = paramNumDoors;
        numWheels = paramNumWheels;
        model = paramModel;

    }

}
