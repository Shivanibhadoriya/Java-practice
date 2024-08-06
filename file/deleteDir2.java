import java.io.File;
class Sample{
   // program for deleting directory or file
    public static void main(String[] args){
        File f=null;
        if(args.length != 0){
            f = new File(args[0]);
            if(f.exists())
               deleteFile(f);
        }  
        else
           System.out.println("invalid file name 'or' you didn't pass file name");
    }

    static void deleteFile(File f){
        System.out.println(f.getName());
        if(f.isDirectory()){
         File[] fList= f.listFiles();
          for(int i=0;i<fList.length ;i++){
               deleteFile(fList[i]);
          }
        }
        f.delete();
    }
}