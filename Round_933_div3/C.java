//https://codeforces.com/contest/1941/problem/C

import java.io.*;

/*
* 对于要是字符串没有map和pie我们只要将中间的字符去掉即可
* 同时本题还有一个特殊案例mapie
* 该案例我们只要去掉p即可
* 因此我们要找出所有的map，pie，mapie
* 将cnt(map)+cnt(pie)-cnt(mapie)便为所需的答案
*/

public class Main {
    static int cnt=0;
    static long mod=(long)(1e9+7);
    static int[][] dis={{-1,1},{1,0},{-1,-1}};
    public static void main(String[] args) {
       int T=Integer.valueOf(Str());
        while(T-->0){
            int ans=0;
            int cnt=0;
            int n=Integer.valueOf(Str());
            String s=Str();
            for(int i=0;i<n;i++){
                if(i+3<=n){
                    String x=s.substring(i,i+3);
                    if(x.equals("map")||x.equals("pie")){
                        ans++;
                    }
                }
                if(i+5<=n){
                    String y=s.substring(i,i+5);
                    if(y.equals("mapie")) cnt++;
                }
            }
            ans-=cnt;
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