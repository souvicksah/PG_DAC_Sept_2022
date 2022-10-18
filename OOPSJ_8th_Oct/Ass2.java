import java.util.*;
class DateDemo
{
   int day;
   int month;
   int year;
   int m[];
   DateDemo()
   {
      day=1;
      month=1;
      year=1970; 
      monthassign(year);
   }
   DateDemo(int day)
   {
      this.day=day;
      month=01;
      year=1970;
      monthassign(year);
   }
  DateDemo(int day,int month)
  {
     this.day=day;
     this.month=month;
     year=1970;
     monthassign(year);
  }
  DateDemo(int day,int month,int year)
  {
      this.day=day;
      this.month=month;
      this.year=year;
      monthassign(year);
  }
   void monthassign(int year)
   {
       int f=0;
       if(year%400==0 || year%100!=0 && year%4==0)
              f=1;
       m=new int[13];
       for(int i=1;i<13;i++)
       {
            switch(i)
            {
                 case 1:
                 case 3:
                 case 5:
                 case 7:
                 case 8:
                 case 10:
                 case 12:
                        m[i]=31;
                        break;
                 case 4:
                 case 6:
                 case 9:
                 case 11:
                       m[i]=30;
                       break;
                 case 2:
                        if(f==0)
                           m[i]=28;
                        else
                           m[i]=29;
                        break;
            }
       }
    }
    void previousday()
    {
            int d=this.day-1;
             System.out.print("Previous Day: ");
            if(d==0)
            {
                int current_month=this.month-1;
                if(current_month==0)
                {
                    int current_year=this.year-1;
                    System.out.println("31/12/"+current_year);
                }
                else
                {
                   System.out.println(m[current_month]+"/"+current_month+"/"+this.year);
                }
            }
            else
            {
                System.out.println(d+"/"+this.month+"/"+this.year);
            }
     }
     void nextday()
    {      
            System.out.print("Next Day: ");
            int d=this.day+1;
            if(d>m[month])
            {
                 int current_month=month+1;
                 if(current_month>12)
                 {
                    System.out.println("1/1/"+(this.year+1));
                 }
                 else
                 {
                     System.out.println("1/"+current_month+"/"+year);
                 }
            }
            else
            {
               System.out.println(d+"/"+this.month+"/"+this.year);
            }
     }
     int validate()
     {
          if(day<=0 || month<=0 || month>12)
               return 0;
          if(day>m[month])
               return 0;
          else
               return 1;
     }
}
class Ass2
{
   public static void main(String []args)
   {
        Scanner sc=new Scanner(System.in);
        int day,month,year;
        System.out.println("Enter the Day");
        day=sc.nextInt();
        System.out.println("Enter the Month");
        month=sc.nextInt();
        System.out.println("Enter the Year");
        year=sc.nextInt();
        DateDemo d=new DateDemo(day,month,year);
        int c=d.validate();
        if(c==0)
            System.out.println("Not a Valid Date");
        else{
            System.out.println("Valid Date");
        d.previousday();
        d.nextday();
        }
   }
}