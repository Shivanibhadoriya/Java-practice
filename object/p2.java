class Test{
    int x;
    final void m1(){
        System.out.println(" parent m1");
    }
    void m2(){
        System.out.println(" parent m2");
    }
}

class TestImpl extends Test{
    int z;
    void m1(){
        System.out.println("child m1");
    }
     void m2(){
        System.out.println(" parent m2");
    }
}
// class Sample{
//     public static void main(String[] args){
//         TestImpl t=new TestImplx();
//         System.out.println(t);
//         System.out.println(t.y);
//         t.m1();
//         t.m2();
//         System.out.println(t.z);
//         t.m3();
//     }
// }