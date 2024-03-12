//https://codeforces.com/contest/1941/problem/B
/*
* 从下标为1的位置开始进行改变数组
* 如果数组在最后第n-1的位置不为0则无法全部变为0
*/
import java.io.*;

public class Main {
    static int cnt=0;
    static long mod=(long)(1e9+7);
    static int[][] dis={{-1,1},{1,0},{-1,-1}};
    public static void main(String[] args) {
        int T=Int();
        while(T-->0){
            int n=Int();
            int[] nums=new int[n];
            for(int i=0;i<n;i++) nums[i]=Int();
            boolean tag=true;
            for(int i=1;i<n-1;i++){
                nums[i]-=2*nums[i-1];
                nums[i+1]-=nums[i-1];
                if(nums[i]<0){
                    tag=false;
                    break;
                }
            }
            if(nums[n-2]!=0||nums[n-1]!=0){
                tag=false;
            }
            if(tag){
                pw.println("YES");
            }else{
                pw.println("NO");
            }
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