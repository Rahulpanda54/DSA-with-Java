class mythread implements Runnable{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("I am Happy: ");
            i++;
        }
    }

}
class mythread2 implements Runnable{
      public void run(){
        int i=0;
        while(i<50){
            System.out.println("I am Sad: ");
            i++;
        }
      }
}
public class threading2{
    public static void main(String[] args) {
        mythread t1 = new mythread();
        Thread obj = new Thread(t1);
        mythread2 t2 = new mythread2();
        Thread obj2 = new Thread(t2);
        obj.start();
        obj2.start();
    }
}