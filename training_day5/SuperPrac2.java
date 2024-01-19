public class SuperPrac2 {
    public static void main(String[] args) {
        Student s = new Student();

        s.display();
    }
}

class Person {
    public void message() {
        System.out.println("I am inperson class");
    }
}

class Student extends Person {
    public void message() {
        System.out.println("I am in student class");
    }

    public void display() {
        message();
        super.message();
    }
}
