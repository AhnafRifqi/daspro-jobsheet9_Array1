import java.util.Scanner;

public class Array1Assignment02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int numberElements = sc.nextInt();
        int[] numbers = new int[numberElements];
        double total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        
        for (int i = 0; i < numberElements; i++) {
            System.out.print("Enter value for element " + i + ": ");
            numbers[i] = sc.nextInt();
            total += numbers[i];

            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        double average = total / numberElements;

        System.out.println("Highest value: " + highest);
        System.out.println("Lowest value: " + lowest);
        System.out.println("Average value: " + average);
    }
}
