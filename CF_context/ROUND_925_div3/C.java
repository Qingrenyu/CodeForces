//https://codeforces.com/contest/1931/problem/C
import java.io.*;

public class Main {
    static long mod=(long)(1e9+7);
    public static void main(String[] args) {
        int T=Int();
        while(T-->0){
            int n=Int();
            int[] nums=new int[n+1];
            for(int i=1;i<=n;i++){
                nums[i]=Int();
            }
            int s1=0,s2=0,s3=0;
            for(int i=1;i<=n;i++){
                if(nums[i]!=nums[1]){
                    break;
                }else{
                    s1++;
                }
            }
            for(int i=n;i>=0;i--){
                if(nums[i]!=nums[n]){
                    break;
                }else{
                    s2++;
                }
            }
            if(nums[1]==nums[n]){
                s3=Math.min(n,s1+s2);
            }
            int ans=0;
            ans=n-Math.max(s1,Math.max(s2,s3));
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