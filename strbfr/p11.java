class Sample{
   public static void main(String[] a){
      StringBuffer sb = new 
      StringBuffer(5); 
      sb.append("ABC"); 
      System.out.println(
      sb.capacity());
      sb.append("XYZ");
      System.out.println(
      sb.capacity());
      }
   }
