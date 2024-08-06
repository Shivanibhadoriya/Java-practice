class Parent{
    static void m1(){
        System.out.println("P-m1");
    }
}
class Child extends Parent{
    static void m1(){
        System.out.println("C-m1");
    }
}
class Sample{
    public static void main(String[] a){
        Parent p=new Child();
        p.m1();
        ((Parent)p).m1();
        ((Child)p).m1();
    }
}