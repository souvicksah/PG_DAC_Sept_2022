import java.util.*;
class Ass9
{
  static int partition(int a[],int l,int u)
  {
      int beg=l,pos=l;
      int end=u;
      int f=0;
      while(f!=1)
      {
           while(pos!=end && a[pos]<a[end])
                   end--;
           if(pos==end)
                 f=1;
           if(a[pos]>a[end])
           {
              int temp=a[pos];
              a[pos]=a[end];
              a[end]=temp;
           }
           if(f!=1)
           {
                 while(pos!=beg && a[pos]>a[beg])
                       beg++;
                 if(pos==beg)
                     f=1;
                 if(a[pos]<a[beg])
                 {
                   int temp=a[beg];
                    a[beg]=a[pos];
                    a[pos]=temp;
                  }
           }
      }
      return pos;
  }
  static void quicksort(int a[],int l,int u)
  {
     if(l<u)
     {
        int pos=partition(a,l,u);
        quicksort(a,l,pos-1);
        quicksort(a,pos+1,u);
     }
  }
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
    
     System.out.println("Before Sorting");
     for(int i=0;i<n;i++)
          System.out.print(a[i]+" ");
     System.out.println("\nAfter Sorting");
      quicksort(a,0,n-1);
     for(int i=0;i<n;i++)
          System.out.print(a[i]+" ");
  }
}