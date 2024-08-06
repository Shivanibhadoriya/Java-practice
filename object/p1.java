class Test{
    int x;
    void m1(){
        System.out.println("m1");
    }
}
class demo{
    int y;
    void m2(){
        System.out.println("m2");
    }
}
class TestImpl extends Test{
    int z;
    void m3(){
        System.out.println("m3");
    }
}
class Sample{
    public static void main(String[] args){
        Test t=new Test();
    }
}