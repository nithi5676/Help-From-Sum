package helpFromSum;

import java.util.Scanner;

public class HelpFromSam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(mod(number));
    }

    public static int mod(int number) {
        int count = 0;
        while (number > 0) {
            if (number % 2 != 0) {
                count++;
            }
            number /= 2;
        }
        return count;
    }
}
