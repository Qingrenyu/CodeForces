//https://codeforces.com/contest/1931/problem/A
import java.io.*;
 //最快解法：直接三重循环暴力枚举
/*
优化到O(n^2)开头要么是a要么不是a
如果开头是a又分两种情况 :
1-->第二个字母是a
2-->第二个字母不是a
*/
public class Main {
    static long mod=(long)(1e9+7);
    public static void main(String[] args) {
        int T=Int();
        char[] map=new char[27];//建立哈希数组
        map[1]='a';
        for(int i=2;i<27;i++){
            map[i]=(char)('a'+i-1);
        }
//本题分三种情况分析
        while(T-->0){
            int n=Int();
            StringBuilder ans=new StringBuilder();
            if(n<=28){
                ans.append(map[1]).append(map[1]).append(map[n-2]);
                pw.println(ans);
            }
            if(n>=53){
                ans.append(map[n-52]).append(map[26]).append(map[26]);
                pw.println(ans);
            }else if(n>28&&n<53){
                ans.append('a');
                boolean tag=false;
                n-=1;
                for(int i=1;i<=26;i++){
                    for(int j=1;j<=26;j++){
                        if(i+j==n){
                            ans.append(map[i]).append(map[j]);
                            tag=true;
                            break;
                        }
                    }
                    if(tag) break;
                }
                pw.println(ans);
            }
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