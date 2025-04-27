public class subset_equal_to_given_sum { 
    // to check wheather any  subset equal to given sum or not...
public static boolean issubset(int set[],int n,int sum){
    if(sum == 0) return true;
    if(n == 0) return false;
    if(set[n-1] > sum){
        return issubset(set,n-1,sum);
    }
    else return issubset(set,n-1, sum) || issubset(set,n-1, sum-set[n-1]);
}
    public static void main(String[] args) {
        int set[] = {3,2,1,7};
        int sum = 6;
        System.out.println(issubset(set,set.length, sum));
    }
}