// class Parent{
//     static{
//     System.out.println("static Parent");
//     }
//     {
//     System.out.println("non-static Parent");
//     }
//     Parent(){
//     System.out.println("constructor Parent");
//     }
// };
// class Child extends Parent{
//     static{
//     System.out.println("static Child");
//     }
//     {
//     System.out.println("non-static Child");
//     }
//     Child(){
//     System.out.println("constructor Child");
//     }
// };

class Person {}
class Emp extends Person{}
class Manager extends Emp{}

class Sample{
    public static void main(String[] args){
      Person p = new Emp();
      Emp e=p;
    }
}