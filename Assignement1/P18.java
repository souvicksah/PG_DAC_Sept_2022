import java.util.*;
class P18
{	
public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  primeFactors(a);
}
public static void primeFactors(int n)
    {
        
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2)
            System.out.print(n);
    }
}
