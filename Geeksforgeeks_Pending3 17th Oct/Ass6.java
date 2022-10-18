import java.io.*;
import java.util.*;

public class Ass6{

    static Set<String> set;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        set=new HashSet<>();
        char []ch=new char[n*2];
        int i;
        for(i=0;i<n;i++)
            ch[i]='(';
        for(;i<2*n;i++)
            ch[i]=')';
        String str=String.valueOf(ch);
        permutation(str,0,str.length()-1);
    }
    static void permutation(String str,int l,int r)
    {
        if(l==r)
        {
            //System.out.println(str);
           int f=validate(str);
           if(f==1 && set.add(str))
               System.out.println(str);
        }
            //validate(str);
        else
        {
            for(int i=l;i<=r;i++)
            {
                str=swap(str,i,l);
                permutation(str,l+1,r);
                str=swap(str,i,l);
            }
                
        }
    }
    static String swap(String str,int i,int j)
    {
        char ch[]=str.toCharArray();
        char c=ch[i];
        ch[i]=ch[j];
        ch[j]=c;
        return String.valueOf(ch);
    }
    static int validate(String str)
    {
        if(str.charAt(0)==')' || str.charAt(str.length()-1)=='(')
            return 0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
             if(str.charAt(i)=='(')
                   stack.push('(');
             if(str.charAt(i)==')')
             {
                 if(stack.isEmpty())
                    return 0;
                 else
                    stack.pop();
             }
        }
        if(stack.size()>0)
             return 0;
        return 1;
    }
}