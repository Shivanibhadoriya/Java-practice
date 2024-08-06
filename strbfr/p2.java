class Sample{
    public static void main(String[] args){
      StringBuffer s1 = new StringBuffer("ABC");
      StringBuffer s2 = new StringBuffer("ABC");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() );
        System.out.println(s2.hashCode());
    }
}