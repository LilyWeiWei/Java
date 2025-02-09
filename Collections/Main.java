package Collections;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<>();

        strings.add("Hello");
        strings.add("World");
        strings.add("!");

        System.out.println(strings);
    }
}