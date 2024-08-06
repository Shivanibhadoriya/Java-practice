class Sample{
     public static void main(String[] args){
        System.out.println("s1");
        try{
            System.out.println("s2");
            try{
               System.out.println("s3");
               args=null;   
               System.out.println(args[0]);
            }
            catch(ArithmeticException e){
               System.out.println("s5");
            }
               System.out.println("s6");
        }
        catch(ArithmeticException e){
            System.out.println("s7");
        }
        catch(NullPointerException e){
           System.out.println("s8");
        }
        System.out.println("s9");
     }
}