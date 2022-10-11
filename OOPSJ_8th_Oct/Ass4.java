import java.util.*;
class Room
{
   int height;
   int width;
   int breadth;
   Room()
   {
      height=0;
      width=0;
      breadth=0;
   }
   Room(int height,int width,int breadth)
   {
      this.height=height;
      this.width=width;
      this.breadth=breadth;
   }
   void volume()
   {
      System.out.println("the volume is:"+height*width*breadth);
   }
}
class RoomDemo
{
    List<Room> r;
    RoomDemo()
    {
       r=new ArrayList<>();
    }
    void create()
    {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int b=sc.nextInt();
        Room new_room=new Room(h,w,b);
        r.add(new_room);
    }
    void display()
    {
        for(int i=0;i<r.size();i++)
        {
           Room temp=r.get(i);
           System.out.println("height:"+temp.height+" width:"+temp.width+" breadth:"+temp.breadth);
           temp.volume();
        }
    }
}
class Ass4
{
  public static void main(String []args)
  {
     RoomDemo r=new RoomDemo();
    System.out.println("enter the details for the Room");
     r.create();
   System.out.println("enter the details for the Room");
     r.create();
    System.out.println("enter the details for the Room");
     r.create();
     r.display();
  }
}