public class subarray_maximum_sum {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int curr_sum = 0;
            for(int j=i;j<arr.length;j++){
                curr_sum = curr_sum + arr[j];
                max_sum = Math.max(curr_sum,max_sum);
            }
        }
        System.out.println(max_sum);
        // Time comlexity is -> O(n^2)...
    }    
}