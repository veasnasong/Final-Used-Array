import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxElements =100;
        int[] numbers = new int[maxElements];
        int count = 0;

        System.out.println("Enter numbers (enter a negative number to quit):");

        while (true) {
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            numbers[count] = num;

            count++;
            if (count == maxElements) {
                System.out.println("Exiting input.");
                break;
            }
        }
        System.out.println("Entered numbers:");

        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
