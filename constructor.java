class student{
    int x;
    int y;
    // this is a default constructor... 
    student(){
       System.out.println("this is a defult constructor"); 
    }
    student(int l,int h){
    x=l;
    y=h;
}
}
class constructor {
    public static void main(String[]args){
        student obj = new student(); // calling default constructor...
student s1 = new student(5,5) ;
System.out.println(s1.x);
System.out.println(s1.y);

    }
    
}
