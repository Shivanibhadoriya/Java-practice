class Sample{
    static int method(Object obj){
        if(obj instanceof String)
          return ((String)obj).length();
        return 0;
    }
    public static  void main(String args[]){
        Sample s=new Sample();
      System.out.println(method(s));
     }
    
}