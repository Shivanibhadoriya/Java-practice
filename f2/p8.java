class test{
   int x;
   int y;
}

class sample{
   int z;
   public static void main(String argv[]){
     // System.out.println(x);
      //System.out.println(y);
     // System.out.println(z);
      test t=new test();
      sample s= new sample();
      System.out.println(t.x);
      System.out.println(t.y);
      System.out.println(s.z);
   }
}