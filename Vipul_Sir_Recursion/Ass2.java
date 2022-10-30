import java.util.*;
class Ass2
{
   static boolean find(int a[],int key,int index)
   {
        if(index<0)
           return false;
        if(a[index]==key)
              return true;
        return find(a,key,index-1);
   }
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
       System.out.println("Enter the value you want to find");
       int key=sc.nextInt();
       System.out.println(find(a,key,a.length-1));
   }
}