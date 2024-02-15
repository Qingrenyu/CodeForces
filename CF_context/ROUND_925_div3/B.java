//https://codeforces.com/contest/1931/problem/B
import java.io.*;
public class Main {
    static long mod=(long)(1e9+7);
    public static void main(String[] args) {
        int T=Int();
        while(T-->0){
            int n=Int();
            long sum=0;//先计算出水的总量
            long[] w=new long[n+1];
            for(int i=1;i<=n;i++){
                w[i]=Lon();
                sum+=w[i];
            }
            long avg=sum/n;//得到平均值
            long x=0;//多出来的水量
            boolean tag=true;
            for (int i = 1; i <=n ; i++) {
                if(w[i]+x>=avg){//判断补充水量后能否到达avg
                    x=w[i]+x-avg;//获得新的剩余水量
                }else{
                    tag=false;
                    break;
                }
            }
            if(!tag) pw.println("NO");
            else pw.println("YES");
        }
        pw.flush();

    }
    public static int Index(int[] nums,int target){
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)>>1;
            if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid-1;
            }
        }
        return l;
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