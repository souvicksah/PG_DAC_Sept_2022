import java.util.*;
class MathOperation
{
   static int add(int x,int y)
  {
     return x+y;
  }
  static int subtract(int x,int y)
  {
     return x-y;
  }
  static int multiply(int x,int y)
  {
     return x*y;
  }
  static double power(int x,int y)
  {
     return Math.pow(x,y);
  }
}
class Ass7
{
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      System.out.println("add:"+MathOperation.add(x,y));
      System.out.println("subtract:"+MathOperation.subtract(x,y));
      System.out.println("multiply:"+MathOperation.multiply(x,y));
      System.out.println("Power:"+MathOperation.power(x,y));
   }
}