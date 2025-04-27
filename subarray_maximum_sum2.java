public class subarray_maximum_sum2 {
    public static void main(String[] args) {
        int arr[] = {1,2,-10,3,4};
        int max_sum = Integer.MIN_VALUE;  int curr_sum = 0;

        for(int i=0;i<arr.length;i++){
            curr_sum = curr_sum + arr[i];

            max_sum = Math.max(curr_sum,max_sum);

            if(curr_sum < 0){
                curr_sum = 0;
            }
        }
        System.out.println(curr_sum);   // O(n)
    }
}