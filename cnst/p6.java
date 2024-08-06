class Base{
    static int i=10;
    static{
        methodOne();
        System.out.println("first static block");
    }
    public static void methodOne(){
        System.out.println(j);
    }
    static int j=20;
    public static void main(String[] args){
        methodOne();
        System.out.println("main");
    }
} 