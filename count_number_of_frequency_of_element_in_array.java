public class count_number_of_frequency_of_element_in_array{
    static int count(int arr[],int x){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            if(x == arr[i]){
                temp++;
            }
        }
        return temp;
    }
    public static void main(String[]args){
        int arr[] = {1,2,2,2,2,3,4,4,5};
        int x = 2;
        System.out.println(count(arr,x));
    }
}