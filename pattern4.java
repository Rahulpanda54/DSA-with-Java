public class pattern4 {
    public static void main(String[] args) {
        for(int line=1;line<=8;line++){
            for(int star=1;star<=8-line+1;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}