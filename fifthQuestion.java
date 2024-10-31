package DivideAndConquer;

public class fifthQuestion {
    static class Interval{
        int start ;
        int end;
        public Interval(int start , int end){
            this.start = start;
            this.end = end;

        }

        
    }

    public static boolean isIntersect(Interval arr[] , int n){
        int max = 0;
        for(int i = 0 ; i < n ; i ++){
            if(max<arr[i].end){
                max = arr[i].end;
            }
        }

        int aux[] = new int[max+1];
        for(int i = 0 ; i < n ; i++){
            int x = arr[i].start;
            int y = arr[i].end;
            aux[x]++;
            aux[y]--;
        }

        for(int i = 1 ;i <aux.length;i++){
            aux[i] += aux[i-1];
            if(aux[i] >1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Interval arr[] = {new Interval(1,3) , new Interval(7 , 9) , new Interval(4 , 6) , new Interval(10,13)};
        int n = arr.length;
        if(isIntersect(arr,n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
