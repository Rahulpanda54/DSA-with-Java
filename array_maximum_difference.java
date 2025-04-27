 public class array_maximum_difference {
    public static void main(String[] args) {
      int arr[] = {2,3,10,6,4,8,1};
        System.out.println(maxdiff(arr, arr.length));
 }
    static int maxdiff(int arr[],int n){
        int res = arr[1] - arr[0];
        int min_val = arr[0];
        for(int j=1;j<n;j++){
            res = Math.max(res, arr[j]-min_val);
            min_val = Math.min(min_val, arr[j]);
         }
         return res;
        }
     }