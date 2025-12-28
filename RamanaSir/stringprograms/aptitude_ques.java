package stringprograms;

import java.util.Arrays;
import java.util.ArrayList;

public class aptitude_ques
{
    public static void main(String[] args)
    {
        String s="h0eg0fegh0eghfe0";
        //String s="a00ca0b00b00";
        System.out.println(s);
        int[] l1=factor(s.length());
        //System.out.println(Arrays.toString(l1));
        for(int i=0;i<l1.length;i++)
        {
            if(l1[i]!=0)
            {
                int c=0;
                String[] group=new String[s.length()/l1[i]];
                for(int k=0;k<s.length()/l1[i];k++)
                {
                    group[k]=s.substring(c,c+l1[i]);
                    c+=l1[i];
                }
                if (checkGroup(group))
                {
                //    System.out.println(Arrays.toString(group));
                    placeNum(group);
                    break; 
                }
            }
            
        }
    }
    public static void placeNum(String[] group)
    {
       int m=group.length;
        int n=group[0].length();
      //  char[][] s1=new char[group.length][group[0].length()];
        char[] valid=new char[group[0].length()];
        ArrayList<Character> result= new ArrayList<Character>();
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
                char ch=group[i].charAt(j);
                if(ch !='0')
                {
                    valid[j]=ch;
                    break;
                }
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(group[i].charAt(j)=='0')
                {
                    result.add(valid[j]);
                }
            }
        }
        System.out.println("Valid array"+result);
    }     
    public static boolean checkGroup(String[] group)
    {
        int i;
        int len=group[0].length();
        for(i=0;i<group.length-1;i++)
        {
            for(int j=0;j<len;j++)
            {
                char c1=group[i].charAt(j);
                char c2=group[i+1].charAt(j); 
                if (c1 != c2 && c1 != '0' && c2 != '0')
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static int[] factor(int l)
    {
        int[] temp = new int[l];
        int k = 0;

        for (int i = 2; i * i <= l; i++) {
            if (l % i == 0) {
                temp[k++] = i;
                if (i != l / i)
                    temp[k++] = l / i;
            }
        }

        Arrays.sort(temp, 0, k);
        return Arrays.copyOf(temp, k);
    }
}