//https://codeforces.com/contest/1941/problem/A
/*
* 直接暴力模拟即可
*/
import java.io.*;

public class Main {
    static int cnt=0;
    static long mod=(long)(1e9+7);
    static int[][] dis={{-1,1},{1,0},{-1,-1}};
    public static void main(String[] args) {
        int T=Int();
        while(T-->0){
            int ans=0;
            int n=Int(),m=Int(),k=Int();
            int[] a=new int[n];
            int[] b=new int[m];
            for(int i=0;i<n;i++) a[i]=Int();
            for(int i=0;i<m;i++) b[i]=Int();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(a[i]+b[j]<=k) ans++;
                }
            }
            pw.println(ans);
        }
        pw.flush();
    }
    private static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StreamTokenizer st=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
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