class Parent{
   {
      System.out.println("hello1");
   }
   Parent(){
      System.out.println("constructor of Parent");
    }
   Parent(int x){
      System.out.println("argument constructor parent");
   }
}
class Child extends Parent{
    Child(){
      System.out.println("constructor of child");
    }
   {
      System.out.println("hello2");
   }
   Child(int x){
      super(2);
      System.out.println("argument constructor");
   }
}
class Sample{
   public static void main(String[] args){
      new Child(2);
   }
}