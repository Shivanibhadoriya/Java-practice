class Sample{
    public static void main(String[] args){
      StringBuffer s1 = new StringBuffer("ABC");
      String s2 = new String(s1);
        System.out.println(s1.getClass().getName());
        System.out.println(s2.getClass().getName() );
        System.out.println(s1 + " , " + s2);
    }
}