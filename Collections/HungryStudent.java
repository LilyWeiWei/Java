package Collections;
import java.util.ArrayList;

public class HungryStudent {
    public static void main(String[] args) {
        ArrayList<String> sweets = new ArrayList<>();

        sweets.add("candy");
        sweets.add("chocolate");
        sweets.add("cookie");
        sweets.add("jelly");
        sweets.add("lollipop");

        System.out.println(sweets);
        System.out.println(sweets.size());
        System.out.println(sweets.isEmpty());
        System.out.println(sweets.contains("lollipop"));
        System.out.println(sweets.get(2));

        sweets.remove(2);
        System.out.println(sweets);

        sweets.set(2, "bun");
        System.out.println(sweets);

//        sweets.clear();
//        System.out.println(sweets);

        sweets.add(0, "lollipop");
        System.out.println(sweets);


    }
}