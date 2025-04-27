public class countsort {
    public static void main(String[] args) {
        int arr[] = {4,3,1,5,3,1,3,5};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int count[] = new int[max+1];
            for(int i=0;i<arr.length;i++){
                count[arr[i]] ++;
            }
            int k=0;
            for(int i=0;i<count.length;i++){
                for(int j=0;j<count[i];j++){
                    arr[k++] = i;
                }
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
       }
    }
}