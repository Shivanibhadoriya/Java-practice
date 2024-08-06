class test{
   static{
      System.out.println(1);
   }
   test(){
      System.out.println(2);
   }
   { 
      System.out.println(3);
   }
}
class Sample{
   public static void main(String[] args)
      throws Exception{
         Class.forName("test");
      }
}