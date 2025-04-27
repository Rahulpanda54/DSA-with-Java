public class sliding_window_maximum {
    public static void max_slide(int arr[],int n,int k){
        for(int i=0;i<=n-k;i++){
           int max = arr[i];
           for(int j=1;j<k;j++){
            if(arr[i+j]>max){
                max = arr[i+j];
            }
        }
          System.out.print(max+" ");
           }
        }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k=3;
          max_slide(arr, arr.length, k);
    }
    
}
