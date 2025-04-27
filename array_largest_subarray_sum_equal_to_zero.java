public class array_largest_subarray_sum_equal_to_zero {
    public static int maxlen(int arr[]){
        int max_len = 0;
        for(int i=0;i<arr.length;i++){
            int curr_sum = 0;
            for(int j=i;j<arr.length;j++){
                curr_sum = curr_sum + arr[j];
                if(curr_sum == 0){
                    max_len = Math.max(max_len, j-i+1);
                }
            }
        }
        return max_len;
    }
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10,23};
        System.out.println(maxlen(arr));
    }
}