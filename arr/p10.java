class Sample{
  static int[] m1(){
    int[] a={10,20};
    return a;
  } 
  public static void main(String[] args){
     int[] x=m1();
     System.out.println(x[0]);
     x[0]=5;
     System.out.println(m1()[0]);
     System.out.println(x[0]);
  }
}