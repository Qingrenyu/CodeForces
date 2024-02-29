//https://codeforces.com/contest/1933/problem/A

/*
* 直接模拟即可
*/

import java.io.*;

public class Main {
    static long mod=(long)(1e9+7);
    public static void main(String[] args) {

        long T=Lon();
        while(T-->0){
            int n=Int();
            long[] nums=new long[n];
            long ans=0;
            for(int i=0;i<n;i++){
                nums[i]=Lon();
                if(nums[i]>0){
                    ans+=nums[i];
                }else{
                    ans-=nums[i];
                }
            }
            pw.println(ans);
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