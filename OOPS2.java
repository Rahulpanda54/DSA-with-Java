class pen{
    String color;
    int tip;
    public void settip(int tp ){
        this.tip = tp;
    }
    public void setcolor(String col){
        this.color = col;
    }
}
// Encapsulation.....
class bankaccount{
     String username;
     private String password;

     public void setpassword(String pass){
        password = pass;
     }
     public String getpassword(){
        return password;
     }
}
// constructor...
class student{
    String name ;
    int age;
    student(){
        System.out.println("I am a default constructor..");
    }
    student(int age,String name){
        this.age = age;
        this.name = name;
    }
        student(student s2){
            this.age = s2.age;
            this.name = s2.name;
        }
    }
    // Inheritance....
    class parent{
      public void show(){
        System.out.println("I am parent class: ");
}
    } 
    class child extends parent{
        public void print(){
            System.out.println("I am child class : ");
        }
    }
    class childson extends child{
        public void showing(){
            System.out.println("I am childson class: ");
        }
    }
    // hierarchial inheritance...
    class Animal{
        public void breath(){
            System.out.println("animal breathing");
        }
    }
    class dog extends Animal{
        public void bark(){
            System.out.println("Dog barking: ");

        }
    }
    class cat extends Animal{
        public void eat(){
            System.out.println("cat eating: ");
        }
    }
    // function overloading(polymorphism)...
    class calculator{
        public void sum(int a,int b){
            System.out.println(a+b);
        }
        public void sum(int a,int b,int c,int d){
            System.out.println(a+b+c+d);
        }
    }
    // function overriding...
    // function overriding cannot achieve without inheritance...
    // inheritance is must to achieve funtn. overriding.. 
    class vehicle{
        public void engine(){
            System.out.println("this is a vehicle class: ");
        }
    }
    class bike extends vehicle{
        public void engine(){
            System.out.println("this is a bike class : ");
        }
    }

    // abstraction....

    abstract class Animals{
        abstract void walk();
    } 
    class horse extends Animals{
         void  walk(){
            System.out.println("walks on 4 legs: ");
         }
    }
    class chicken extends Animals{
        void walk() {
          System.out.println("walks on 2 legs: ");
        }   
    }


    // interfaces ...
interface chessplayer{
    void moves();

}
class queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,right,left,Diagonally in all 4 direction...");
    }
}
class horses implements chessplayer{
    public void moves(){
        System.out.println("move 2 and a half step.. ");
    }
}  
// multiple inheritance...

 interface herbivore   {
   public void walk();
}
interface carnivorus{
    public void eat();
}
class Bear implements herbivore,carnivorus{
    public void walk(){
        System.out.println("Bear walking");
    }
    public void eat(){
        System.out.println("Bear eats ");
    }
}
// "super" keyword..
class upper{
    int a = 10;
}
class lower extends upper{
    int a = 20;
    public void shows(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class OOPS2 {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.setcolor("blue");
        pen1.settip(2);
        System.out.println(pen1.color);
        System.out.println(pen1.tip);
        //  encapsulation..
        bankaccount obj = new bankaccount();
        obj.username = "rahul panda";
        obj.setpassword("College@123#");
        System.out.println(obj.username);
        System.out.println(obj.getpassword());

        // constructor..
        student s1 = new student();
        s1.name = "rahul sharma";
        s1.age = 20;
        System.out.println(s1.name);
        System.out.println(s1.age);

        student s2 = new student(19,"nitish");
        System.out.println(s2.name);
        System.out.println(s2.age);

        student s3 = new student(s2);
        System.out.println(s3.name);
        System.out.println(s3.age);

        //  inheritance...
        childson ob = new childson();
        ob.showing();
        ob.print();
        ob.show();
        cat cat1 = new cat();
        cat1.eat();
        cat1.breath();
        dog dog1 = new dog();
        dog1.bark();
        dog1.breath();
        // polymorphism......
        calculator cal = new calculator();
        cal.sum(10, 10);
        cal.sum(10, 10, 10, 10);
        // function overriding...
        bike object = new bike();
        object.engine();

        // abstraction...
        chicken ch = new chicken();
        ch.walk();
        horse h1 = new horse();
        h1.walk();

        // interfaces..
        queen q = new queen();
        q.moves();
        horses h = new horses();
        h.moves();
        // multiple inheritance..
        Bear b = new Bear();
        b.walk();
        b.eat();

        //  super keyword.....
        lower l = new lower();
         l.shows();



    }  
}
