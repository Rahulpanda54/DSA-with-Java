public class segregation {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,0,1,0,1};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                arr[j++] = arr[i];
            }
        }
        while (j<arr.length) {
            arr[j++] = 1;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    
}
