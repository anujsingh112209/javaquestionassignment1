public class AscendingOrder {
    static void printAscending(int n) {
        if (n == 0) {
            return;  
        }
        
        printAscending(n - 1);
        
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        printAscending(n);
    }
}