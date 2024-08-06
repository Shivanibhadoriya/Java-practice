import java.io.*;
class Sample{
    public static void main(String[] args)throws IOException{
        String fname="C:/Users/bhadoriya/OneDrive/Documents/sfd.txt";
        FileInputStream fin = new FileInputStream(fname);
        // byte[] b = new byte[(int)new File(fname).length()];
        // fin.read(b); 
        // System.out.write(b);  
        System.out.println(fin.available());
        System.out.println(new File(fname).length());

    }
}