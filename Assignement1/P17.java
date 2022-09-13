import java.util.*;
class P17
{	
public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int t=a;
  int p=0; 
  while(a!=0)
  {
     p=p*10+(a%10);
     a=a/10;
  } 
  if(p==t)
     System.out.println("Palindrome");
  else
    System.out.println("Not a Palindrome");
}
}
