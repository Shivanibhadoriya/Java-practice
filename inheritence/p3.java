
class Test{
    void m1(Integer x){
        System.out.println("Test");
    }
}
class Best extends Test{
    void m1(int x){
        System.out.println("Best");
    }
}
class Sample{
    public static void main(String[] args){
       Best t=new Best();
       t.m1(10);
    }
}