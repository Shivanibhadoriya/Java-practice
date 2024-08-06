import java.io.File;
class Sample{
   // program for deleting directory or file
    public static void main(String[] args){
        // File f=new File("p3.java");
        // File f1 = new File("deleteDir.java");
        // f.renameTo(f1);
        File f=null;
        if(args.length != 0){
            f = new File(args[0]);
            if(f.exists())
               deleteFile(f);
        }  
    }

    static void deleteFile(File f){
        if(f.isDirectory()){
          String[] s= f.list();
          for(int i=0;i<s.length ;i++){
               File file= new File(f+"/"+s[i]);
               deleteFile(file);
          }
        }
        f.delete();
    }
}