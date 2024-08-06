class Sample{
   static String s1="ABC";
   static String s2="ABC";
   String s3="ABC";
   String s4="ABC";
 public static void main(String[] args){
     String s5="ABC";
     String s6="ABC";
     Sample s=new Sample();
     System.out.println(s5  == s6);
     System.out.println(s1  == s2);
     System.out.println(s.s3  == s.s4);
     System.out.println(s1  == s5);
     System.out.println(s1  == s.s3);
     System.out.println(s.s3  == s5);
  }
}