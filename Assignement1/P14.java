import java.util.*;
class P14
{
public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int p=a;
  int q=b;
  if(a<b)
  {
    int t=a;
    a=b;
    b=t;
   }
  while(a%b!=0)
  {  int t=a;
     a=b;
     b=t%b;
  }
 System.out.println(b);
}
}
