import java.util.*;
class Ass7
{  
   static List<List<Integer>> res;
   static Set<List<Integer>> set;
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int nums[]=new int[n]; 
     res=new ArrayList<>();
     set=new HashSet<>();
     for(int i=0;i<n;i++)
     {
          nums[i]=sc.nextInt();
     }
     permutation(nums,0,nums.length-1);
     System.out.println(res);
   }
   static void permutation(int nums[],int l,int r)
   {
        if(l==r)
        {
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
                  list.add(nums[i]);
            if(set.add(list))
                 res.add(list);
        }
        else
        {
             for(int i=l;i<=r;i++)
             {
                   nums=swap(nums,l,i);
                   permutation(nums,l+1,r);
                   nums=swap(nums,l,i);
             }
        }
   }
   static int[] swap(int nums[],int l,int r)
   {
         int j=nums[l];
         nums[l]=nums[r];
         nums[r]=j;
         return nums;
   }
}