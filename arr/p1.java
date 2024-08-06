import java.util.*;
class Test{
   public static void main(String[] args){
       Vector<String> a1 = new Vector<String>();
       a1.add("shivani");
       a1.add("nidhi");
       a1.add("vanshika");
       a1.add("nikita");
      //  System.out.println(a1);
      Enumeration<String> e = a1.elements();
       System.out.println(e.nextElement());
       System.out.println(e.nextElement());
   }
}