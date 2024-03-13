import java.util.ArrayList;

public class ArrayListPrac2 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>(4);

        colours.add("White");
        colours.add("Red");
        colours.add("Orange");
        colours.add("Green");

        System.out.println("****** Colour List ******");
        for (int i = 0; i < 4; i++) {
            System.out.println(colours.get(i).toString());
        }

        ArrayList<String> sample = new ArrayList<>(3);
        sample.add("Pink");
        sample.add("Neon");
        sample.add("Blue");

        System.out.println("****** Sample List ******");
        for (int i = 0; i < sample.size(); i++) {
            System.out.println(sample.get(i).toString());
        }

        colours.addAll(sample);
        System.out.println("Size of colours array list: " + colours.size());
        System.out.println("****** Colour List ******");
        for (int i = 0; i < colours.size(); i++) {
            System.out.println(colours.get(i).toString());
        }
    }
}
