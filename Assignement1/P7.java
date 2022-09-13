import java.util.*;
class P7
{
public static void main(String []args)
{
  //Scanner sc=new Scanner(System.in);
  //int a=sc.nextInt();  
  print(10);
  }
static void print(int a)
{ 
    if(a==0)
       return;
 print(a-1);
System.out.println(a+" ");
}
}
