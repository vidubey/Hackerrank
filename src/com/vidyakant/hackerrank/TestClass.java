package com.vidyakant.hackerrank;

import java.util.Scanner;
import java.util.Stack;

class TestClass {

    public static long findWater(long a[]){
        long sum =0;
        long max=0,ele=0;
        Stack<Long> stack = new Stack<Long>();
        for(int i=0;i<a.length;i++){
            if(a[i]>=max){
                while(!stack.isEmpty() && (ele=stack.pop())!=max){
                    sum=getSum(sum,max-ele);
                }
                max=a[i];
                stack.push(max);
            }
            else
                stack.push(a[i]);


        }
        return sum;
    }

    public static long getSum(long sum,long diff){
        long MOD = 1000000007;
        if(sum+diff>MOD)
            sum= (sum+diff)%MOD;
        else
            sum+=diff;
        return sum;
    }

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tCases = sc.nextInt();
        while(tCases > 0){
            int N = sc.nextInt();
            long[] arr = new long[N];
            for(int i=0;i<N;i++)
                arr[i] = sc.nextLong();
            System.out.println(findWater(arr));
            tCases--;
        }
    }
}
