
class Sample{
     static void m1(Integer x){
        System.out.println("Test");
    }
    static void m1(Long x){
        System.out.println("Best");
    }
    public static void main(String[] args){
        m1(null);
    }
}