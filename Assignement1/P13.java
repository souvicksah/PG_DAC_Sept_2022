import java.util.*;
class P13
{	
public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int p=0; 
  while(a!=0)
  {
     p=p*10+(a%10);
     a=a/10;
  }
 System.out.println(p);
}
}
