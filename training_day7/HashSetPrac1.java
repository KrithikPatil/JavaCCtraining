import java.util.*;

public class HashSetPrac1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");

        Iterator<String> itr = hs.iterator();

        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }

        System.out.println(hs);
    }
}
