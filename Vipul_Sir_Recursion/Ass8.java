import java.util.*;
class Ass8
{
   static void merge(int a[],int l,int m,int u)
   {
       int i=l,j=m+1,k=0;
       int temp[]=new int[u-l+1];
       while(i<=m && j<=u)
       {
            if(a[i]<a[j])
            {
                temp[k++]=a[i];
                i++;
            } 
            else
            {
                temp[k++]=a[j];
                j++;
            }    
       }
       if(i<=m)
       {
              while(i<=m)
                  temp[k++]=a[i++];
       }
       else if(j<=u)
       {
              while(j<=u)
                  temp[k++]=a[j++];
       }
       k=0;
       for(i=l;i<=u;i++)
            a[i]=temp[k++];
   }
   static void mergesort(int a[],int l,int u)
   {
        if(l<u)
        {
            int mid=l+(u-l)/2;
            mergesort(a,l,mid);
            mergesort(a,mid+1,u);
            merge(a,l,mid,u);
        }
   }
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
      for(int i=0;i<n;i++)
           System.out.print(a[i]+" ");
      mergesort(a,0,n-1);
      System.out.println("\nAfter Sorting");
      for(int i=0;i<n;i++)
           System.out.print(a[i]+" ");
   }
}