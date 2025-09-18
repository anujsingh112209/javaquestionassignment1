public class NaturalNumbersRecursion {
    static void printNumbers(int n, int current) {
        if (current > n) {
            return; 
        }
        System.out.print(current + " ");
        printNumbers(n, current + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Natural numbers from 1 to " + n + ":");
        printNumbers(n, 1);
    }
}


