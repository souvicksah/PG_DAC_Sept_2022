import java.util.*;
class Ass4
{
   static int find(int a[],int key,int curr,int index)
   {
        if(curr==a.length-1)
               return index;
        if(a[curr]==key)
        {
           index=curr;
        }
       return find(a,key,curr+1,index);     
   }
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
      System.out.println("Enter the key needs to be found");
      int key=sc.nextInt();
      System.out.println("ans:"+find(a,key,0,-1));
   }
}