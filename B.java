//https://codeforces.com/contest/1929/problem/B

import java.io.*;
/*
通过画图分析我们可以找到其中的规律
我们之要通过填充最上面一层和最下面一层就可以覆盖到所有的对角线
而每一个格子都覆盖两条对角线
从而得出当k==4*n-2时我们只要填充2*n个格子即可
而小于4*n-2时只要是偶数就÷2否则就÷2再+1
*/

public class Main {
    public static void main(String[] args) {
        int t=Int();
        while(t-->0) {
            int n = Int(),k = Int();
            pw.println(k==4*n-2?n*2:k%2==0?k/2:k/2+1);
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