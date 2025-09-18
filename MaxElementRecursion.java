public class MaxElementRecursion {
    static int findMax(int arr[], int n) {
        if(n==1){
            return arr[0];
        }
        int maxRest = findMax(arr,n -1);
        return Math.max(arr[n - 1], maxRest);
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 11, 1, 6, 9};
        int n = arr.length;

        int max = findMax(arr, n);
        System.out.println("Maximum element in array: " + max);
    }
}

