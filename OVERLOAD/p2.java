class Sample{
    static void m1(byte n){
        System.out.println("1");
    }
    // static void m1(String n){
    //     System.out.println("1");
    // }
   
    // static void m1(char b){
    //     System.out.println("3");
    // }
    static void m1(Long b){
        System.out.println("2");
    }
    public static void main(String[] s){
    //   m1("");
    //   m1(null);
    //   m1('a');
      m1(10);
    }
}