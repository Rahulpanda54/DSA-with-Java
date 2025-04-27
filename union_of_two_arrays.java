import java.util.*;
public class union_of_two_arrays {
    public static void union(int arr[],int arr2[]){
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        System.out.println(set);
    
    }
    public static void main(String[] args) {
        int arr[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,7};
        union(arr, arr2);

    }
    
}
