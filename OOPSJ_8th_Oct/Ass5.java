import java.util.*;
class Student
{
   String name;
   List<Integer> subject_nums;
   Student()
   {
      name="Default";
      subject_nums=new ArrayList<>();
      subject_nums.add(0);
      subject_nums.add(0);
      subject_nums.add(0);
   }
   Student(String name,int f,int s,int t)
   {
      this.name=name;
      subject_nums=new ArrayList<>();
      subject_nums.add(f);
      subject_nums.add(s);
      subject_nums.add(t);
   }
   void compute_avg()
   { 
      double sum=subject_nums.get(0)+subject_nums.get(1)+subject_nums.get(2);
      sum=sum/3;
      System.out.println("name:"+this.name+" average:"+sum);
   }
   void display()
   {
      int sum=subject_nums.get(0)+subject_nums.get(1)+subject_nums.get(2);
      System.out.println("name:"+this.name+" Total: "+sum);
   }
   
}
class Ass5
{
   public static void main(String []args)
   {
        Scanner sc=new Scanner(System.in);
        List<Student> list=new ArrayList<>();
        String name;
        int f,s,t;
        System.out.println("enter the Student name");
        name=sc.nextLine();
        System.out.println("enter the Student marks");
        f=sc.nextInt();
        s=sc.nextInt();
        t=sc.nextInt();
        list.add(new Student(name,f,s,t));
        list.get(0).display();
        list.get(0).compute_avg();
        
   }
}