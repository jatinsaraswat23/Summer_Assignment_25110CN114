import java.util.Scanner;

public class CountDigitInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        System.out.println("Number of digits in " + n + " are: ");
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
