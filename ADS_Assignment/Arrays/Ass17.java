import java.util.*;
class Ass17
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
      int a[]=new int[99];//have not tried running
      for(int i=0;i<99;i++)
           a[i]=sc.nextInt();
      int ele=a[0];
      for(int i=1;i<99;i++)
          ele=ele^a[i];
      System.out.println(ele);
  }
}