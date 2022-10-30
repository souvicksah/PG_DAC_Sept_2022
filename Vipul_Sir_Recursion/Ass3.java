import java.util.*;
class Ass3
{
   static int find(int a[],int key,int index)
   {
       if(a.length==index)
            return -1;
       if(a[index]==key)
            return index;
       return find(a,key,index+1);
   }
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int []a=new int[n];
      for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
      System.out.println("Enter the key needs to be found");
     int key=sc.nextInt();
     System.out.println("Ans:"+find(a,key,0));
   }
}