import java.util.*;
class P8
{
public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();  
  while(a!=0)
  {
     System.out.println(a%10);
     a=a/10;
  }
}
}