package com.vidyakant.hackerrank;

import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 19/12/14.
 */
public class SherlockAndBeastMemoized {

    public static int[][] findSequence(int n){
        int[][] map = new int[n+1][2];
        for(int i=0;i<=n;i++){
            map[i][0]=0;
            map[i][1]=0;
        }
        if(n>=3)
            map[3][1] = 3;
        if(n>=5)
            map[5][0] = 5;
        for(int i=6;i<=n;i++){
            if(map[i-3][1]>0 && (map[i-3][1]+map[3][1] >= map[i-5][1]+map[5][1]))
                map[i][1] = map[i-3][1]+map[3][1];
            else if(map[i-5][1]>0)
                map[i][1] = map[i-5][1]+map[5][1];
            if(map[i][1]<i) {
                if (map[i - 3][0] > 0 && (map[i - 3][0] + map[3][0] >= map[i - 5][0] + map[5][0]))
                    map[i][0] = map[i - 3][0] + map[3][0];
                else if (map[i - 5][0] > 0)
                    map[i][0] = map[i - 5][0] + map[5][0];
            }


        }
        return map;
    }

    public static void getSequence(int n, int [][] map){
        for(int i=0;i<map[n][1];i++)
            System.out.print("5");
        for(int i=0;i<map[n][0];i++)
            System.out.print("3");
        if(map[n][0]==0 && map[n][1]==0)
            System.out.print("-1");
        System.out.println();
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        int tCases = sc.nextInt();
        int map[][]= findSequence(100000);
        while(tCases > 0){
            getSequence(sc.nextInt(),map);
            tCases--;
        }

    }
}
