import java.util.Scanner;
class Complex
{
   int real;
   int imaginary;
   Complex()
   {
      real=0;
      imaginary=0;
   }
   Complex(int real)
   {
      this.real=real;
      imaginary=0;
   }
   Complex(int real,int imaginary)
   {
        this.real=real;
        this.imaginary=imaginary;
   }
   void print()
   {
      System.out.println(this.real+"+"+this.imaginary+"i");
   }
   Complex sum(Complex num)
   {
       int new_real=this.real+num.real;
       int new_imaginary=this.imaginary+num.imaginary;
       return new Complex(new_real,new_imaginary);
   }
  Complex multiply(Complex num)
  {
      int new_real=this.real*num.real-this.imaginary*num.imaginary;
      int new_imaginary=this.real*num.imaginary+this.imaginary*num.real;
      return new Complex(new_real,new_imaginary);
  }
}
class Ass3
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int real,imaginary;
       System.out.println("enter the first no. details");
       real=sc.nextInt();
       imaginary=sc.nextInt();
       Complex c1=new Complex(real,imaginary);
       System.out.println("enter the Second no. details");
       real=sc.nextInt();
       imaginary=sc.nextInt();
       Complex c2=new Complex(real,imaginary); 
       c1.print();
       c2.print();
       c1.sum(c2).print();
       c1.multiply(c2).print();
   }
}