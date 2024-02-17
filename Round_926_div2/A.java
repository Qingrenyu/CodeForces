//https://codeforces.com/contest/1929/problem/A
import java.io.*;
import java.util.Arrays;
/*
本题只要直接排好序后将相邻数只差全部求和就能得到最大的数
时间O(nlogn)
*/

public class Main {
    public static void main(String[] args) {
        int t=Int();
        while(t-->0) {
            int n = Int();
            long[] nums=new long[n];
            for(int i=0;i<n;i++){
                nums[i]=Lon();
            }
            Arrays.sort(nums);
            long ans=0;
            for(int i=1;i<n;i++){
                ans+=(nums[i]-nums[i-1]);
            }
            pw.println(ans);
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