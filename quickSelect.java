package DivideAndConquer;
import java.util.*;
public class quickSelect {

    public static int findlargest(int arr[] , int k){
        int n = arr.length;
        return quickSelect(arr , 0 , n-1 , n-k);
    }

    private static int quickSelect(int []arr , int left , int right , int k){
        //base case condition
        if(left == right){
            return arr[left];
        }
        //use the last element as pivot

        int pivotIndex = partition(arr , left , right);

        //check if we found the kth smallest element
        if(k == pivotIndex){
            return arr[k];

        }
        else if(k<pivotIndex){
            //aplly recursion for the left part
            return quickSelect(arr, left, pivotIndex-1, k);

        }
        else{
            return quickSelect(arr, pivotIndex+1, right, k);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];  // Choosing the last element as the pivot
        int i = left;            // Pointer for the greater element

        // Traverse through all elements, rearrange the array
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                // Swap arr[i] and arr[j]
                swap(arr, i, j);
                i++;
            }
        }

        // Finally, swap the pivot with the element at i
        swap(arr, i, right);
        return i;  // Return the position of the pivot
    } 

    private static void swap(int arr[] , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i <n ; i ++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of n :");
        int k = sc.nextInt();

        System.out.println("The kth largest element is :" + findlargest(arr,k));
        sc.close();
    }
}
