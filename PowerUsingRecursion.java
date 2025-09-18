
import java.util.Scanner;

public class PowerUsingRecursion {
    static int power(int x, int y) {
        if (y == 0) {
            return 1;  
        }
        
        return x * power(x, y - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        int x = sc.nextInt(); 
        System.out.print("Enter power (y): ");
        int y = sc.nextInt();
        int result = power(x, y);
        System.out.println(x + " raised to the power " + y + " = " + result);

        sc.close();
    }
}

