class student{
    int x;
    int y;
    student(){
        System.out.println("this is default constructror");
    }
student(int l,int h){
    x=l;
    y=h;
}
student(student s2){
    x=s2.x;
    y=s2.y;
}
}
class copyconstructor {
    public static void main(String[]args){
        student obj = new student();
student s1 = new student(5,5) ;
student s2=new student(s1);
System.out.println(s2.x);
System.out.println(s2.y);
System.out.println(s1.x);
System.out.println(s1.y);
    }   
}
