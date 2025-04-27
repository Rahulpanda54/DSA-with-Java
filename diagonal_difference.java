public class diagonal_difference {
    public static void main(String[] args) {
        int arr[][] = {{7,5,2},{1,8,6},{4,6,8}};
        int a = 0;
        int b = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
          if(i == j){
                    a = a + arr[i][j];
                }
             if((i+j) == (arr.length-1)){
                    b = b + arr[i][j];
                }
            }
        }
        System.out.println("the diagonal difference of the matrix is: "+(a - b));
    }
    
}
