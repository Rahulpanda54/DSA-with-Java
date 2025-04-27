class A{
    public void show(){
        System.out.println("I AM CLASS A: ");
    }
}

public class annonymous {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("I am annonymous class which is overriding class A : ");
            }
        };
        obj.show();
    }
    
}
