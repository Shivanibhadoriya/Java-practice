class point{
   static int x;
   static {
   System.out.println("point loading");
   }
}
class sample {
   public static void main(String[] args){
      System.out.println("hello shivani");
      Class.forName("point");
   }
}