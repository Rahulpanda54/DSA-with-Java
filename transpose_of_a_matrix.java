public class transpose_of_a_matrix{
  public static int[][] transpose(int[][] matrix) {
    int n = matrix.length;    int m = matrix[0].length;

    int mat[][] = new int[m][n];

       for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
      mat[j][i] = matrix[i][j];
    }
  }
      return mat;
    }
    public static void main(String[] args) {
        int arr[][] = {{2,3,4},
                       {5,6,7}};


        int transposed[][] = transpose(arr);

      for(int i=0;i<transposed.length;i++){
        for(int j=0;j<transposed[i].length;j++){
           System.out.print(transposed[i][j]+" ");
        }
        System.out.println();
      }
    }
}