public class break_continue {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
            if(i == 2){
                System.out.println();
                System.out.println("ending the loops: ");
                break;
            }
        }
        System.out.println("this is for continue: ");

        for(int x = 0;x<10;x++){
            if(x == 2){
                System.out.println("end : ");
                continue;
            }
            System.out.print(x+" ");
        }
    }
}
