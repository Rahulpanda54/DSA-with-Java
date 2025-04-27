public class secondlargestelement {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8};
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]>array[i]){
                   int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(array[1]);
    }
}
