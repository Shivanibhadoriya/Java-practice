class Sample{
    static int x=m1(); //1 10
    static{
        System.out.println("test-sb");  // 4
    }
    static int y=m2();  // 5 20
    public static void main(String[] args){
        System.out.println("main"); //7
    }
    static int m2(){
        System.out.println("m2");  //5
         return 20;   //6
    }
    static int m1(){
        System.out.println("m1"); //2
        return 10; // 3
    }
}