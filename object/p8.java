class Emp{
    int id;
    String name;
    double sal;
    public Emp(int id , String name , double sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    public static void main(String[] args){
        Emp e1=new Emp(101,"RAJESH",1000);
        Emp e2=new Emp(101,"RAJESH",1000);
        Emp e3=new Emp(101,"MUKESH",3000);
        System.out.println(e1.equals(e2));
        System.out.println(e1.id == e2.id && e1.name.equals(e2.name) &&  e1.sal == e2.sal);
    }
}