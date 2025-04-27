public class array_insert {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
       arr =   insert(arr, 110, 2);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"  ");
    }
}
public static int[]  insert(int arr[],int element,int position){
        int newarr[] = new int[arr.length+1];
        for(int i=0,j=0;i<newarr.length;i++){
            if(i == position){
                newarr[i] = element;
            }
            else{
                newarr[i] = arr[j];
                j++;
            }
        }
        return newarr;
    } 
}