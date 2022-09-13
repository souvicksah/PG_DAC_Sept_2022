import java.util.*;
class P3
{
public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int res=fact(a,1);
  System.out.println(res);
}
static int fact(int a,int fact)
{
   if(a==0)
      return fact;
   return fact(a-1,a*fact);
}
}