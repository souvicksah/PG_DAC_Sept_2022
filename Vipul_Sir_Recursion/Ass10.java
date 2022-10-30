import java.util.*;
class Ass10
{
   static void fun(String s,char prev,int index)
   {
       if(index==s.length())
             return;
       if(s.charAt(index)!=prev)
       {
          System.out.print(s.charAt(index));
          prev=s.charAt(index);
       }
       fun(s,prev,index+1);
   }
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       System.out.print(s.charAt(0));
       fun(s,s.charAt(0),0);
   }
}