public class CarHQ {

    public static void main(String[] args) {
        CarHQ myFactory = new CarHQ();
    }

    public CarHQ(){
        Car myCar;
        myCar = new Car("red", 10, 4, 4,"volvo");

        //color, height, door #, wheel #, model

        myCar.printInfo();
    }


}
