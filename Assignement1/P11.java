import java.util.*;
class P11
{
public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt(); 
  int c=sc.nextInt(); 
  if(b>a && c>a)
     System.out.println(a);
  else if(a>b && c>b)
     System.out.println(b);
  else if(a>c && b>c)
     System.out.println(c);
}
}
