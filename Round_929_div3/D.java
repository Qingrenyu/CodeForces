//https://codeforces.com/contest/1933/problem/D

import java.io.*;
import java.util.*;

/*
* 本题是一道构造题
* 首先我们要保证 a1 a2 a3 ... an 的一种顺序使得它们之间的模 !=0 
* 由于模运算的性质我们直到如果一个最小值只有一个的话 那么我们按照 小 % 大 的顺序可以保证不为0
* 如果有多个的话 那么我们就要通过模运算得到一个最小值
* 因此我们可以通过 大 % 小 得到一个比 小 还小的数
* 因此我们只需要得到一个不为0最小的数 将数组的数与该数进行模运算即可得到 一个最小数
*/

public class Main {
    public static void main(String[] args) {
       int T=Int();
       while(T-->0){
           int n=Int();
           Map<Long,Integer> map=new HashMap<>();
           long[] nums=new long[n];
           long min=Long.MAX_VALUE;
           for(int i=0;i<n;i++){
               nums[i]=Lon();
               min=Math.min(min,nums[i]);
               map.put(nums[i],map.getOrDefault(nums[i],0)+1);
           }

           if(map.get(min)==1){
               pw.println("YES");
           }else{
               boolean tag=false;
               for(int i=0;i<n;i++){
                   if(nums[i]%min!=0){
                       tag=true;
                       break;
                   }
               }
               if(tag) pw.println("YES");
               else pw.println("NO");
           }
       }

       pw.flush();
    }

    public int check(int[] pre,int target,int n){
        int ll=1,rr=n;
        while(ll<=rr){
            int mid=ll+(rr-ll)/2;
            if(pre[mid]>target){
                rr=mid-1;
            }else{
                ll=mid+1;
            }
        }
        return ll;
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