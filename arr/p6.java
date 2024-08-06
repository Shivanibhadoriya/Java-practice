class test{
  int x;
  static int y;
   test(){
    x=++y;
   }
  public String toString(){
     return x+"";
  }
}
class sample{
  public static void main(String[] args){
    test[] t=new test[]{new test(),null};
    t[1]=new test();
     System.out.println(t[0]);
     System.out.println(t[1]);
  }
}
    
    