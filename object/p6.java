class Numeric{
    int value;
    public Numeric(int n){
        value =n;
    }
    public boolean equals(Object n){
        return value == ((Numeric)n).value;
    }
}
class Sample{
    public static void  main(String[] args){
        Numeric n1=new Numeric(10);
        Numeric n2=new Numeric(10);
        Numeric n3=new Numeric(20);
        System.out.println(n1 == n2);
        System.out.println(n1 == n3);
        System.out.println(n1.equals(n2));
        System.out.println(n1.equals(n3));
    }
}