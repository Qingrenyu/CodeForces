//https://codeforces.com/contest/1933/problem/C

/*
* 直接枚举+哈希去重
* 思路：首先 l =k*((a^x)*(b^y))
* 则有  确定 x 和 y 的取值范围
* 对于指数我们通过快速幂来解决
* 因为 l 的范围只有 1e6 所以 x 和 y 的 大小不会很大
* 因此 我们需要 枚举 x 和 y 即可，同时取不同的 k 只要通过 Set 去重即可
* 最终的答案就是 set 的大小
*/

import java.io.*;
import java.util.*;

public class Main {
    static long mod=(long)(1e9+7);
    public static void main(String[] args) {

        long T=Lon();
        while(T-->0){
            Set<Long> set=new HashSet<>();
            long a=Lon(),b=Lon(),l=Lon();
            long ta=a,tb=b,tla=l,tlb=l;
            int cnt_a=0,cnt_b=0;
            while(tla>0){
                tla/=a;
                cnt_a++;
            }
            while(tlb>0){
                tlb/=b;
                cnt_b++;
            }
            for(int i=0;i<=cnt_a;i++){
                long ax=power(a,i);
                for(int j=0;j<=cnt_b;j++){
                    long by=power(b,j);
                    long tmp=ax*by;
                    if(tmp>l) break;
                    if(l%tmp==0){
                        set.add(tmp);
                    }
                }
            }
            pw.println(set.size());
        }
        pw.flush();
    }
    public static long C(int x,int n){
        if(n==0) return 1;
        long a1=1,a2=1;
        for(int i=0;i<x;i++){
            a2=(a2*n)%mod;
            n--;
        }
        while(x>0){
            a1=(a1*x)%mod;
            x--;
        }
        return a2/a1;

    }
    public static long power(long a,int n){
        long ans=1;
        while(n>0){
            a%=mod;
            if((n&1)==1){
                ans=(ans*a)%mod;
            }
            a=((long)a*a)%mod;
            n>>=1;
        }
        return ans;
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