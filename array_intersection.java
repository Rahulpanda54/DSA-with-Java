import java.util.*;
public class array_intersection{
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        int arr[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,5,6,7,8};
        for(int val: arr){
            set.add(val);
        }
        for(int val: arr2){
            if(set.contains(val)){
                System.out.print(val+"      ");
            }
        }
    }
}