import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 3 == 0) System.out.print("Fizz");
        if (n % 5 == 0) System.out.print("Buzz");
        if (n % 3 != 0 && n % 5 != 0) System.out.print(n);
        System.out.print("\n");
    }
}