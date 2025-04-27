public class trapping_rain_water{
    public static int maxwater(int arr[],int n){
        int res = 0;
        for(int i=1;i<n-1;i++){
            int left = arr[i];
            for(int j =0;j<i;j++){
                left = Math.max(left,arr[j]);
            }
            int right = arr[i];
            for(int j=i+1;j<n;j++){
                right = Math.max(right,arr[j]);
            }
            res = res + Math.min(left,right) - arr[i] ;
        }
        return res;
    }
    public static void main(String[]args){
        int arr[] = {5,0,6,2,3};
        System.out.println(maxwater(arr,arr.length));
    }
}
