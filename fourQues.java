package DivideAndConquer;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class fourQues {
    public static boolean ifPermute(int a[] , Integer[] b , int k , int n){
     // sort a in ascending order
     Arrays.sort(a);
     //sort b in descending order
     Arrays.sort(b , Collections.reverseOrder());

     for(int i = 0 ; i < n ; i ++){
        if(a[i] + b[i] <= k){
            return false;
        }
     }
     return true;

    }
    public static void main(String[] args) {
        int a[] = { 2, 1, 3};
        Integer b[] = { 7 , 8, 9};
        int k = 9;
        int n = a.length;
        ifPermute(a , b , k, n);
        if(ifPermute(a, b, k, n)){
            System.out.println("YES");

        }
        else{
            System.out.println("NO");
        }

    }
    
}