class Sample{
   public static void main(String[] args){
       StringBuffer sb=new StringBuffer("abc");
       System.out.println(sb.length());
       System.out.println(sb.capacity());
       sb.append("hi");
       System.out.println(sb.length());
       System.out.println(sb.capacity());
       sb.append("welcome to jit college");
       System.out.println(sb.length());
       System.out.println(sb.capacity());
      }
   }
