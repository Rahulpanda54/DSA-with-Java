import java.util.*;
public class array_most_frequent_element {
    public static void main(String[] args) {
        HashMap<Integer,Integer>freq = new HashMap<>();
        int arr[] = {1,4,2,5,1,4,4,6,4,4};
        for(int val:arr){
            if(!freq.containsKey(val)){
                freq.put(val, 1);
            }
            else{
                freq.put(val, freq.get(val) + 1);
            }
        }
        System.out.println(freq.entrySet());
        int max_freq = 0;        int  anskey = -1;
        for(int key:freq.keySet()){
            if(freq.get(key) > max_freq){
                max_freq = freq.get(key);
                anskey = key;
            }
        }
        System.out.println("the most frequent element is: "+ anskey + " which comes total " + max_freq + " times ");
    }
}