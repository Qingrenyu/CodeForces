
//https://codeforces.com/contest/1929/problem/C

import java.io.*;



/*
本题我们要保证能够赢钱
我们所赢得的钱要至少等于我们所押注的钱+1这样才能获利
由此可得关系式：y*(k-1)=x+1
y=(x+1)/(k-1)
*/


public class Main {
    public static void main(String[] args) {
        int t=Int();
        while(t-->0) {
            int k=Int(),x=Int();
            long a=Lon();
            int c=1;
            boolean tag=false;
            if(c>=a) tag=true;
            for(int i=1;i<=x-1;i++){
                int get=(c+1)/(k-1);
                if((c+1)%(k-1)!=0){
                    get++;
                }
                c+=get;
                if(c>=a){
                    tag=true;
                    break;
                }
            }
            if(k*(a-c)<=a){
                tag=true;
            }
            if(tag) pw.println("NO");
            else pw.println("YES");
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