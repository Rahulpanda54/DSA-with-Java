public class subarrays_of_array {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        // SUBARRAY :- subarray is the continuous part of this array.
        for(int Start=0; Start<arr.length; Start++){
        for(int end = Start; end <arr.length; end++){
            for(int i=Start;i<= end;i++){
                System.out.print(arr[i]+"  ");
            }
            System.out.println();
           }
        }
    } // time complexcity = O(n^3)....
}
/* 1,2,3,4,5,12,123,1234,12345,23,234,2345,34,345,45 */