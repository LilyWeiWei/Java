package Person;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[100];
        Random random = new Random();

        for (int i = 0; i < people.length; i++) {
            String name = "user" + (i + 1);
            int age = random.nextInt(100) + 1;
            people[i] = new Person(name, age);
        }


        int[] ageCount = new int[101];

        for (Person person : people) {
            ageCount[person.age]++;
        }

        int mostFrequentAge = 0;
        int maxCount = 0;

        for (int i = 1; i < ageCount.length; i++) {
            if (ageCount[i] > maxCount) {
                mostFrequentAge = i;
                maxCount = ageCount[i];
            }
        }

        System.out.println("Возраст, который встречается чаще других: " + mostFrequentAge);
    }
}