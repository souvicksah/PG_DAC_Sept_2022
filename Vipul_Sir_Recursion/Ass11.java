import java.util.*;
class Ass11
{
  static void fun(String s,int index)
  {
     if(index==s.length())
          return;
     if(s.charAt(index)!='x')
     {
         System.out.print(s.charAt(index));
     }
    fun(s,index+1);
  }  
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     fun(s,0);
  }
}