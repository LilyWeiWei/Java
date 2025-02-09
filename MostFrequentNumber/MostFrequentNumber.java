package MostFrequentNumber;

import java.util.Scanner;


public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] frequency = new int[201];
        int maxFrequency = 0;
        int mostFrequentNumber = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }


            int index = number + 100;
            frequency[index]++;


            if (frequency[index] > maxFrequency) {
                maxFrequency = frequency[index];
                mostFrequentNumber = number;
            }
        }

        System.out.println("The most frequent number is " + mostFrequentNumber);
    }
}