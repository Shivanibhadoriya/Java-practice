class Sample{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("abdjklfi");
        // char[] ch={'a','b','c','d'};
        // System.out.println(sb.capacity());
        // sb.trimToSize();
        // sb.replace(1,4,"efg");
        // System.out.println(sb.capacity());
        //  sb.delete(0,2);
        //  sb.deleteCharAt(2);
        // System.out.println(sb.codePointAt(7));
         sb.setLength(3);
         System.out.println(sb);
        //  System.out.println(sb.subSequence(2,5));
    }
}