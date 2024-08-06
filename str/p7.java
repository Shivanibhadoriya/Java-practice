class Sample{
   final void m1(int x){
     System.out.println("parent");
   }
   void m2(int x){
     System.out.println("parent");
   }
}
class Demo extends Sample{
     
     void m2(int x){
     System.out.println("child");
   }
   public static void main(String[] args){
       Demo d=new Demo();
       d.m1(7);
       d.m2(5);
   }
}
   
   