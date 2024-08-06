class Except{
    public static void main(String[] args){
            // Integer.parseInt(args[0]);
            // throw  new NullPointerException("garmi ne pagal kar diya "); 
            try{
               int x= Integer.parseInt(args[0]);
               int y= Integer.parseInt(args[1]);
               int z= x/y;
             System.out.println("arrey wahh bhai tu to bahut samajhar nikla koi error nhi");
            }
            catch(Exception e){
                System.out.println("number soch samajh kar le 2 number ka divide ho rha hai naa yaad rakh");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("bhai jra string  bhi deni hoti hai yaad to rakha kar");
            }finally{
                System.out.println(" mehnat karte rho BEST OF LUCK");
            }
       
    }
}