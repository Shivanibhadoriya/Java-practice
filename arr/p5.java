class sample{
  public static void main(String[] args){
     int a[]=new int[3];
     int i=0;
     a[++i]=++i;
     System.out.println(a[0]);
     System.out.println(a[1]);
     System.out.println(a[2]);
  }
}