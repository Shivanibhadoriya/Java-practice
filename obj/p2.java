class Numeric {
   private int value;
   public Numeric(int value){
    this.value=value;
   }
   public int hashCode(){
    return value;
   }
}
class Sample{
    public static void main(String[] args){
       Numeric n1=new Numeric(10);
       Numeric n2=new Numeric(10);
       System.out.println();
       System.out.println(System.identityHashCode(n2));
        }
}