import java.util.*;
class Ass6
{
   static int digit(int n,int count)
   {
      if(n==0)
          return count;
     return digit(n/10,count+1);
   }
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println("No of the digits present:"+digit(n,0));
   }
}