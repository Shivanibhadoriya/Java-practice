class Outer{
    void m1(){

    }
}
class Sample{
    public static void main(String[] args){
        Outer i=new Outer(){};
        System.out.println(i);
    }
}