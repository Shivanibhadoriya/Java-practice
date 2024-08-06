class Sample{
    Object m1(Object x){
        return 10;
    }
}
class Demo{
    public static void  main(String[] args){
        Sample s=new Sample();
        System.out.println(s.m1(10));
    }
}