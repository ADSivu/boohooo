public class SumChecker {

    public static void fn(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
               java.util.Arrays.sort(arr);
        
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            
            if (currentSum == target) {
                System.out.println(arr[left] + " " + arr[right] + " are the solutions");
                return;            }
            
            if (currentSum < target) {
                left++; 
            } else {
                right--; 
            }
        }
        
        System.out.println("No pair found that sums to the target value.");
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 35, 50, 75, 80};
        int target = 85;
        fn(arr, target);
    }
}
```
