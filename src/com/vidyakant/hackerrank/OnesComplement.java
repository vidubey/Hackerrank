package com.vidyakant.hackerrank;

import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 20/12/14.
 */
public class OnesComplement {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int digitCount = (int)(Math.log(N)/Math.log(2))+1;
        System.out.println((int)((Math.pow(2,digitCount)-1)-N));
    }
}
