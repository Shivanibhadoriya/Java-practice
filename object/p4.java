class A{
   
}
class B extends A{
    A m1(){
    return new B();
   }
}
class C extends A{
   A m1(){
    return new C();
   }
}
class D extends B{
    B m1(){
    return new D();
   }
}
class E extends B{
    B m1(){
    return new E();
   }
}
class G extends C{
    C m1(){
    return new G();
   }
}
class F extends E{
    A m1(){
    return new F();
   }
}
class Sample{
   public static void main(String[] args){
       
   }
}