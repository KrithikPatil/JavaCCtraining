public class SuperPrac1 {
    public static void main(String[] args) {
        Car s = new Car();
        s.display();
    }
}

class Vehicle {
    int speed = 170;
}

class Car extends Vehicle {

    int speed = 130;
    public void display() {
        System.out.println(super.speed);
    }
}
