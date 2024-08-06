class Outer{
    int x;
    static int y;
   static class Inner{
        void m1(){
            // System.out.println(x);
            System.out.println(y);
        }
    }
}
class Sample{
    public static void main(String[] args){
        Outer.Inner i=new Outer.Inner();
    }
}