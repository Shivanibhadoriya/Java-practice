class Base{
    static{
    System.out.println("static base");
    }
    {
    System.out.println("non-static base");
    }
    Base(){
    System.out.println("constructor base");
    }
};
class Sub extends Base{
    static{
    System.out.println("static Sub");
    }
    {
    System.out.println("non-static sub");
    }
    Sub(){
    System.out.println("constructor sub");
    }
};

class Sample{
    public static void main(String[] args){
      new Sub();
    }
}