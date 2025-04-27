public class Array_get_cumulative_sum {
        static int getCumulativeSum (int[] arr) {
         int sum = 0;
         for(int i=0;i<arr.length;i++){
             sum = sum + arr[i];
             System.out.print(sum +" ");
         }
           return sum ;
     }
     public static void main(String[]args){
         int[] arr = {1,2,3,4};
         getCumulativeSum(arr);
         
     }
 }