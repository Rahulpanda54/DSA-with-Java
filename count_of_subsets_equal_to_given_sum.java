public class count_of_subsets_equal_to_given_sum {
    static int count_subset(int arr[],int k){
        int dp[][] = new int[arr.length+1][k+1];
        for(int i=0;i<=arr.length;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<=arr.length;i++){
            for(int j=0;j<=k;j++){
                dp[i][j] = dp[i-1][j];
                if(j>=arr[i-1]){
                    dp[i][j] += dp[i-1][j-arr[i-1]];
                }
            }
        }
        return dp[arr.length][k];
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,8,10};
        int target = 10;
        int count = count_subset(arr, target);
        System.out.print(target+"  "+count);
    }
}