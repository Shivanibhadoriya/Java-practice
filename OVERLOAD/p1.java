class Sample{
    static void m1(int ... l){
        System.out.println("1");
    }
    // static void m1(int a,Object o){
    //     System.out.println("2");
    // }
    // static void m1(int a,int ... b){
    //     System.out.println("2");
    // }
    static void m1(Integer... ref){
        System.out.println("3");
    }
    public static void main(String[] s){
       m1(new Integer(10),new Integer(20));
       m1(10,20);
    }
}