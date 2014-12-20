package com.vidyakant.hackerrank;

import java.util.Scanner;

public class FindingNemo {

    public static long countPaths(int[][] arr, int M, int N, int i, int j){
        long count =0;
        if(i==M-1 && j==N-1)
            return 1;
        else if(i==M || j==N)
            return 0;
        else if(arr[i][j] ==0)
            return 0;
        count=countPaths(arr,M,N,i+1,j)+countPaths(arr,M,N,i,j+1);
        return count;
   }

    public static long numberOfPaths(int[][] arr, int M ,int N){
        return countPaths(arr,M,N,0,0);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int _a_cnt = 0,_b_cnt = 0;
        int [][] _a = new int[1001][1001];
        try {
            _a_cnt = sc.nextInt();
            _b_cnt = sc.nextInt();
        }catch (Exception e) {
            System.out.println("Here: " + e.getMessage());
        }

        for(int i=0; i < _a_cnt; i++) {
            for( int j = 0;j < _b_cnt;j++ ){
                int _a_tmp = 0;
                try {
                    _a_tmp = sc.nextInt();
                }catch (Exception e) { }
                _a[i][j] = _a_tmp;
            }
        }
        System.out.println(numberOfPaths (_a ,_a_cnt,_b_cnt));

    }
}
