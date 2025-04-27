abstract class A{
    abstract void display();
}
class B extends A{
    public void display(){
        System.out.println("display");
    }
}
class C extends A{
    @Override
    public void display() {
        System.out.println("walking");
    }
}
public class abstaction {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        C obj2 = new C();
        obj2.display();
    }
}
