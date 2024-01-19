public class SuperPrac3 {
    public static void main(String[] args) {
        Krithik k = new Krithik();
    }
}

class Mom {
    public Mom() {
        System.out.println("I am the mom");
    }
}

class Krithik extends Mom {
    public Krithik() {
        super();
        System.out.println("I am Krithik");
    }
}
