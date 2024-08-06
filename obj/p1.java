class Emp{
    private int id;
    private String name ;
    private double salary;
    public Emp(int id,String name , double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public boolean equals(Object obj){
        if(obj instanceof Emp){
            Emp e =(Emp)obj;
            return (id==e.id) && name.equals(e.name) && salary==e.salary;
        }
        return false;
    }
}
class Sample{
    public static void main(String[] args){
       String ename =new String("RAJU");
       Emp e1 =new Emp(10,"RAJU",1000.0);
       Emp e2 =new Emp(10,ename,1000.0);
       Emp e3 =new Emp(10,"RAJU",2000.0);
       System.out.println(e1.equals(e2));
       System.out.println(e1.equals(e3));
    }
}