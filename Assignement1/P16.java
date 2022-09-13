import java.util.*;    
class P16  
{  
public static void main(String args[])  
{  
int x, y;      
Scanner sc = new Scanner(System.in);    
System.out.print("Enter the first number: ");    
x = sc.nextInt();    
System.out.print("Enter the second number: ");   
y = sc.nextInt(); 
int lcm=1;
  while(x>0 && y>0 && x%2==0 && y%2==0)
  {
     lcm=lcm*2;
     x=x/2;
     y=y/2;
  }
  for(int i=3;i<=x && i<=y;i=i+2)
  {
      while(x>0 && y>0 && x%i==0 && y%i==0)
     {
     lcm=lcm*i;
     x=x/i;
     y=y/i;
     }
  }   
  if(x>1)  
     lcm=lcm*x;
  if(y>1)
      lcm=lcm*y;
  System.out.println("the LCM is "+lcm);
}
}