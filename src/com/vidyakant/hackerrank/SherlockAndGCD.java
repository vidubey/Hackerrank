package com.vidyakant.hackerrank;

import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 18/12/14.
 */
public class SherlockAndGCD {

    public static String canFindPrimes(int[] a){
        if(a.length<2)
        for(int i=0;i<a.length;i++){

        }

        return "NO";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tCases = sc.nextInt();
        int N;
        int arr[];
        while(tCases > 0){
            N = sc.nextInt();
            arr = new int[N];
            for(int i=0;i<N;i++)
                arr[i] = sc.nextInt();
            System.out.println(canFindPrimes(arr));
            tCases--;
        }

    }
}
