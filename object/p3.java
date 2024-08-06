class Test{
}

class TestImpl extends Test{
    
}
class Demo{

}
class Sample{
    public static void main(String[] args){
       Test t1=new Test();
       Test t2=new TestImpl();
    //    Test t3=new Demo(); // errror
       Demo d1=new Demo();
    //    Demo d2=new TestImpl(); // error 
    //    Demo d3=new Test();   // error
    //    TestImpl c1=new Test();    //error
    //    TestImpl c2=new TestImpl(); //error
    //    TestImpl c3=new Demo();    // error
    }
}