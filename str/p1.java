class Sample{
   public static void main(String[] args){
     String s1="abc";
     s1=new String("xyz");
     System.out.println(s1 == s2.intern());
   }
}