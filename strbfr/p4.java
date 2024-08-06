class Sample{
    public static void main(String[] args){
      StringBuilder s1 = new StringBuilder("ABC");
      String s2 = new String(s1);
        System.out.println(s1.getClass().getName());
        System.out.println(s2.getClass().getName() );
        System.out.println(s1 + " , " + s2);
    }
}