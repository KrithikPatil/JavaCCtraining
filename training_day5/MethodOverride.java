public class MethodOverride {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.properties();
        obj.bike();
    }
}

class Parent {
    public void properties() {
        System.out.println("These are the properties");
    }

    public void bike() {
        System.out.println("Harley Davidson");
    }
}

class Child extends Parent {
    public void bike() {
        System.out.println("BMW bike");
    }
}
