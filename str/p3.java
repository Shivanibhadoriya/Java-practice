class Sample{
 public static void main(String[] args){
     String str=new String("ABC");
     String s=new String("abc");
     String s1=s.toUpperCase();
     System.out.println(str.hashCode() == s1.hashCode());
     System.out.println(str );
     System.out.println(s1); 
  }
}