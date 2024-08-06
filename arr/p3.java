class point{
   public point(){
      System.out.println("point-CB");
   }
}
class sample{
   public static void main(String[] args){
      point[] p=new point[2];
      System.out.println(p[0]);
       System.out.println(p[1]);
   }
}