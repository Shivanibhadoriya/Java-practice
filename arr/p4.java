class point{
   int x,y;
   public point(int x, int y){
      this.x=x;
      this.y=y;
   }
}
class sample{
   public static void main(String[] args){
      point p=new point(1,2);
      point[] a=new point[]{p,null,new point(10,20)};
      a[1] = new point(5,6);
      for(int i=0;i<a.length ;i++)
        System.out.println(a[i].x + " , "+a[i].y);
   }
}