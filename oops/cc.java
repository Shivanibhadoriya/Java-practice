package pack1;
class c2 extends c1{
    void m1(){
        c1 c=new c1();
         c.p=0;
        c.s=0;
        c.q=0;
        c.r=0;
    }
    static{
    System.out.println("c2 completely loaded");
    }
    public static void main(String[] args){
        
    }
}