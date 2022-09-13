class P9
{
   public static void main(String []args)
   {
       for(int i=1;i<=5;i++)
       {
          for(int j=1;j<=5-i;j++)
              System.out.print(" ");
          for(int j=1;j<=i;j++)
              System.out.print((char)(65+j-1)+" ");
          System.out.println();
       }
   }
}