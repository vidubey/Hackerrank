package com.vidyakant.hackerrank;

import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 19/12/14.
 */
public class SherlockAndBeastMemoized {

    public static void findSequence(int n){
        int[][] map = new int[n+1][2];

        for(int i=0;i<=n;i++){
            map[i][0]=0;
            map[i][1]=0;
        }
        map[3][0] = 5;
        map[5][1] = 3;
        for(int i=3;i<=n;i++){
            //map[i][0] = max(map[i-3][0])
        }


    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        int tCases = sc.nextInt();
        while(tCases > 0){

            findSequence(sc.nextInt());
            tCases--;
        }

    }
}
