import java.util.*;
class Book
{
   String title;
   String []author_name;
   int no_pages;
   float price;
   String publisher;
   Book()
   {
   }
   Book(String t,String []a,int n,float p,String pub)
   {
      title=t;
      author_name=a;
      no_pages=n;
      price=p;
      publisher=pub;
   }
   void print()
   {
     System.out.println("title:="+title+" Publisher:"+publisher);
   }
}
class Library
{
   List<Book> b;
   Scanner sc;
   Library()
   {
     sc=new Scanner(System.in);
     b=new ArrayList<>();
   }
   void addBook()
   {
       System.out.println("enter the Title name");
       String title=sc.nextLine();
       System.out.println("enter the no. of authors for this book");
       int n=sc.nextInt();
       String []a=new String[n+1];
       System.out.println("enter the name of the Authors");
       for(int i=0;i<n+1;i++){
            a[i]=sc.nextLine();
       }
       System.out.println("enter the no. of the pages");
       int no_pages=sc.nextInt();
       System.out.println("enter the price");
       float price=sc.nextFloat();
       sc.nextLine();
       System.out.println("enter the publisher name");
       String publisher=sc.nextLine();
      
       Book book=new Book(title,a,no_pages,price,publisher);
       b.add(book);
   }
   Book remove(String title)
   {
      for(int i=0;i<b.size();i++)
     {
         Book temp=b.get(i);
         if((temp.title).equals(title)){
              b.remove(temp);
              return temp;
          }
      }
      return null;
   }
   void print()
   {
       for(int i=0;i<b.size();i++)
             b.get(i).print();
   }
}
class Ass1
{
   public static void main(String []args)
   {
      Library lib=new Library();
      Scanner sc=new Scanner(System.in);
      outer:while(true)
      {
          System.out.println("1.add Books");
          System.out.println("2.remove Books");
          System.out.println("3.print the Books"); 
          System.out.println("4.exit");
          int n=sc.nextInt();
          sc.nextLine();
          switch(n)
          {
              case 1:
                     lib.addBook();
                     break;
              case 2:
                     String title=sc.nextLine();
                     Book book=lib.remove(title);
                     if(book==null)
                          System.out.println("not present");
                     lib.print();
                     break;
              case 3:
                    lib.print();
                    break;
              case 4:
                    break outer;
           }
      } 
   }
}