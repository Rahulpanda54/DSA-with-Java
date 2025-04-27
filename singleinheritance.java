class rectangle{
        int length;
        int breadth;
      public void area(){
        System.out.println(length*breadth);

    }
}

class cuboid extends rectangle{
    int heigth;
    public void volume(){
        System.out.println(length*breadth*heigth);
    }
}
 class singleinheritance {
    public static void main(String[] args) {
       cuboid obj = new cuboid();
       obj.length=10;
       obj.breadth=10;
       obj.heigth=10;
       obj.area();
       obj.volume();
    }
    
}
