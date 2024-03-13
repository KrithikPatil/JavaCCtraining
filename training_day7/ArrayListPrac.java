import java.util.ArrayList;

public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("Krithik");
        al.add("Savinay");
        al.add(null);
        al.add(30);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        al.add(2, "Ayush");
        System.out.println(al);
        al.removeAll(al);
        System.out.println(al);
    }
}
