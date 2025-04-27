public class ceiling_in_sortedArray {
    /* ceiling is the just greater elements than x and floor is the just smaller elements than x */
    // ceil of the any number which is presented in the array is the number itself but
    // any number which is not present in the array its ceil is just higher than the number value...
    public static int ceilsearch(int arr[],int low,int high,int x){
    if(x <= arr[low]){
        return low;
      }
            for(int i=low;i<high;i++){
                if(arr[i] == x){
                    return i;
                }
                 if(arr[i]<x && arr[i+1]>=x){
                    return i+1;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int arr[] = {1,2,8,10,12};
            int x = 9;
            int y = 10;
            int index = ceilsearch(arr, 0, arr.length-1, x);
            int index2 = ceilsearch(arr,0,arr.length-1,y);
            System.out.println("the ceiling of 9 is: " + arr[index]);
             System.out.println("the ceiling of 10 is: " + arr[index2]);
           
        }
    }
    