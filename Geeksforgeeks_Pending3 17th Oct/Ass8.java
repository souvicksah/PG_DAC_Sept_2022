import java.util.*;
class Ass8
{
    public static void main(String []args)
   {
        Scanner sc=new Scanner(System.in); 
        List<Integer> list=new ArrayList<>();
        int i=sc.nextInt();
        while(i>0)
        {
            list.add(i);
            i=sc.nextInt();
        }
        for(i=0;i<list.size();i++)
        {
             if(i%2==1)
                System.out.println(list.get(i));
        }
   }
}