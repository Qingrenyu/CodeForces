//https://codeforces.com/contest/1931/problem/D

/*
* 本题通过使用前缀哈希来记录中间值
* 本题所需要了解的知识-->同余原理，哈希，前缀
* 首先(a+b)%x=(a%x+b%x)%x
* 同时(a-b)%y=(a%y-b%y)%y
* 所以-->a%x=(x-a%x)%x
*    -->a%y=b%y;
* 因此我们需要将(a%x,a%y)作为前缀Key
* Key通过使用String来记录
*/

import java.io.*;
import java.util.*;

public class Main {
    //static long mod=(long)(1e9+7);
    public static void main(String[] args) {
        int T=Int();

        while(T-->0){
            int n=Int();
            long x=Lon(),y=Lon();
            long[] nums=new long[n+1];
            Map<String,Integer> map=new HashMap<>();
            long ans=0;
            for(int i=1;i<=n;i++){
                nums[i]=Lon();
                long a=nums[i]%x;
                long b=nums[i]%y;
                String k=(x-a)%x+","+b;
                ans+=map.getOrDefault(k,0);
                map.put(a+","+b, map.getOrDefault(a+","+b,0)+1);
            }
            pw.println(ans);
        }
        pw.flush();

    }
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
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