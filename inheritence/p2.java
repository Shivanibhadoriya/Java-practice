class Base{
     void m1(){
         
      }
}
class Sub extends Base{
      final void m1(){

      }
}
class Sample{
     public static void main(String[] args){
       Base  s= new Sub();
     }
}