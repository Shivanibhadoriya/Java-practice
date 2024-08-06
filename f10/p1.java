class sample{
    static int y;
    int x;
   static {
    System.out.println("execution of static block");
   }
   {
    System.out.println("execution of non-static block");
   }
   public static void main(String[] args){
      sample obj=new sample();
      System.out.println(obj.x);
      System.out.println(y);
       y=2;
      sample obj1= new sample();
      System.out.println(obj1.x);
      System.out.println(y);
   }
}