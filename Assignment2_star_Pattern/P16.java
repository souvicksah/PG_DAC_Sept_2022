class P16
{
   public static void main(String []args)
   {   
       int n=5;
       for(int i=1;i<=n;i++)
       {   
           for(int j=1;j<=n-i;j++)
               System.out.print(" ");
           if(i==1 || i==n){
             for(int j=1;j<=i;j++)
                System.out.print("*");
             }
            else
            {
                System.out.print("*");
                for(int j=1;j<=i-2;j++)
                   System.out.print(" ");
                System.out.print("*");
            }
           System.out.println();
       }
   }
}