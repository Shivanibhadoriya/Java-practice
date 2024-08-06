class Sample{
    public static void main(String[] args){
    //     String s = new String("ABC");
    //     System.out.println(s);
    //    String s1= s.concat("123");
    //     System.out.println(s + " , " + s1);
      StringBuffer s = new StringBuffer("ABC");
        System.out.println(s);
       StringBuffer s1=s.append("123");
        System.out.println(s );
        System.out.println(s1);
    }
}