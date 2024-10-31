package DivideAndConquer;

public class twoQues {
    public static void sastaPartition(int arr[] , int n ){
        int p = 0;
        for(int i = 0 ; i < n ; i ++){
            if(arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;

               
                p++;
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[ ] = {19 , -20 , 7 , -4 ,-13 , 11 , -5 , 3};
        int n = arr.length;
        sastaPartition(arr , n);
        for(int i = 0 ; i <n ; i++){
            System.out.println(arr[i]);
        }
    }
}
