import java.util.*;
class shivani{
   public static void main(String[] args){
      Map <Character,Integer> mp = new HashMap<>();
      String str="abaa";
      for(int i=0;i<str.length();i++){
         char ch=str.charAt(i);
         mp.put(ch,mp.getOrDefault(ch,0)+1);
      }
      for(char ch:mp.keySet()){
         System.out.print(ch + " ");
         System.out.println(mp.get(ch));
      }
    }
}
      