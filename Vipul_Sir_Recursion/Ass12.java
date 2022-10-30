import java.util.*;
class Ass12
{
  static void toh(int n,char s,char d,char a)
  {
       if(n==1)
          System.out.println(s+"->"+d);
       else
       {
           toh(n-1,s,a,d);
           toh(1,s,d,a);
           toh(n-1,a,d,s);
       }
  }
  public static void main(String []args)
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      toh(n,'S','D','A');
  }
}