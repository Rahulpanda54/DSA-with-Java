public class array_practise{
   public static boolean issubset(int arr1[],int arr2[]){
      boolean result = false;
      for(int i=0;i<arr2.length;i++){
         for(int j=0;j<arr1.length;j++){
            if(arr1[j] == arr2[i]){
               result = true;
               break;
            }
         }
         if(result == true){
            return true;
         }
      }
      return false;
   }
   public static void main(String[] args) {
   //    int arr[] = {1,2,3,4,5};
   //   for(int i=0;i<arr.length/2;i++){
   //    int temp = arr[i];
   //    arr[i] = arr[arr.length-i-1];
   //    arr[arr.length-i-1] = temp;
   //   }
   //   for(int i=0;i<arr.length;i++){
   //    System.out.print(arr[i]+" ");
   //   }
   int arr1[] = {1,2,3,4,5};
   int arr2[] = {2,3,4,9};
   System.out.println(issubset(arr1, arr2));
   }
}