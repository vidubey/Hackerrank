package com.vidyakant.hackerrank;

import java.util.Scanner;

public class SherlockAndSquares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tCases  =sc.nextInt();
        int count = 0;
        while(tCases > 0){
            long a =  sc.nextLong();
            long b = sc.nextLong();
            count = (int)(Math.floor(Math.sqrt(b))-Math.floor(Math.sqrt(a)));
            if(Math.sqrt(a) == Math.floor(Math.sqrt(a)))
                count++;
            System.out.println(count);
            tCases--;
        }

    }
}
