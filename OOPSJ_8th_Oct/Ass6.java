class Box
{
    int height;
    int width;
    int breadth;
    Box()
    {
        height=0;
        width=0;
        breadth=0;
    }
    Box(int h,int w,int b)
    {
        height=h;
        width=w;
        breadth=b;
    }
    void Area()
    {
        System.out.println("Surface Area:"+(2*(height*width)+2*(width*breadth)+2*(height*breadth)));
    }
    void volume()
    {
       System.out.println("Volume:"+(height*breadth*width));
    }
}
class Ass6
{
    public static void main(String []args)
   {
       Box b1=new Box(2,3,4);
       Box b2=new Box(5,6,7);
       b1.Area();
       b2.Area();
       b1.volume();
       b2.volume();
   }
}