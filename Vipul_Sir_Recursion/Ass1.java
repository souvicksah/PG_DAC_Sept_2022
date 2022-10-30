import java.util.*;
class Ass1
{
    static Long power(Long n,Long x)
    {
         if(x==0 && n==0){
             return 0;
          }
         if(x==0 && n!=0){
             return 1;
         }
        return n*power(n,x-1);           
    }
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      Long n=sc.nextLong();
      Long x=sc.nextLong();
      System.out.println(power(n,x));
   }
}