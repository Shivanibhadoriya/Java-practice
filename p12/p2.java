class sample{
   {
     System.out.println(y);
     y=5;
     System.out.println(this.y);
   }
  int y=20;
  public static void main(String[] args){
    sample s=new sample();
    System.out.println(s.y);
  }
}