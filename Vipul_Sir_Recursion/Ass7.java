import java.util.*;
class Ass7
{
    static int sum(int []a,int sum,int index)
    {
         if(index==a.length)
              return sum;
         return sum(a,sum+a[index],index+1);
    }
    public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
       System.out.println("the Sum is:"+sum(a,0,0));
      
    }
}