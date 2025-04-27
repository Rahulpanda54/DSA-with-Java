class A{
    public void show(){
        System.out.println("I am show finction: ");
    }
}
public class Anonymous_innerclass {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show(){
                System.out.println("I am overriding the function of A class: ");
            }

        };
        obj.show();
    }  
}
