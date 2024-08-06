class sample{
   static int x= 10;
   int y=20;
   public static void main(String[] args){
      System.out.println(x);
      System.out.println(sample.x);
      sample s=new sample();
      System.out.println(s.y);
   }
   {
   System.out.println(this.y); 
   System.out.println("wahh yrr");
   }
}