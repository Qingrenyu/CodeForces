//https://codeforces.com/contest/1933/problem/B

import java.io.*;

/*
* 整个数组要被3整除有四种情况
* 1-->不通过删除或增加多次1来实现，说明本身就能sum能被整除
* 2-->如果无法被3整除则会出现sum%3=1  sum%3=2 的两种情况，如果sum%3=2那么我们只要对数组进行一次 +1 操作
* 如果sum%3=1 那就会出现两种情况  1、nums[i]%3 的个数为0 我们只能通过 +2 的方式实现。 2、如果nums[i]%3 的个数不为0 我们只要通过删除该nums[i]即可实现
 */

public class Main {
    public static void main(String[] args) {
        int T=Int();
        while(T-->0){
            int n=Int();
            long[] nums=new long[n];
            long one=0,two=0,sum=0,ans=0;
            for(int i=0;i<n;i++){
                nums[i]=Lon();
                sum+=nums[i];
                if(nums[i]%3==1){
                    one++;
                }
            }
            if(sum%3==0) pw.println(0);
            if(sum%3==1&&one>0) pw.println(1);
            if(sum%3==1&&one==0) pw.println(2);
            if(sum%3==2) pw.println(1);
        }
        pw.flush();
    }
    private static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    private static StreamTokenizer st=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    public static int Int(){
        try{
            st.nextToken();
        }catch(IOException e){
            e.printStackTrace();
        }
        return (int)st.nval;
    }
    public static long Lon(){
        try{
            st.nextToken();
        }catch(IOException e){
            e.printStackTrace();
        }
        return (long)st.nval;
    }
    public static double Dou(){
        try{
            st.nextToken();
        }catch(IOException e){
            e.printStackTrace();
        }
        return (double)st.nval;
    }
    public static String Str(){
        String p="";
        try{
            p= bf.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        return p;
    }
}