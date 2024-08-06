import java.io.*;
class Sample{
    public static void main(String[] args){
        try{
            FileInputStream fin= new FileInputStream(args[0]);
            int n=Integer.parseInt(args[1]);
            int part = fin.available()/n;
            String s= "new";
            int i=1;
            byte[] b = new byte[part];
            while(i <= n){
                FileOutputStream fout = new FileOutputStream(s+i+".txt");
                fin.read(b);
                fout.write(b);
                i++;
                fout.close();
            }
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("successfully divided");
        
    }
}