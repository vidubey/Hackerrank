package com.vidyakant.hackerrank;

import java.util.*;

/**
 * Created by vidyakant.dubey on 19/12/14.
 */
public class SherlockAndTheBeast {

    static boolean foundSequence = false;

    public static void findSequence(int num,int[] a,Map<Integer,int[]> map){
        if(foundSequence || num <0)
            return ;
        if(num==0)
            foundSequence = true;
        else{
            if(map.containsKey(num)){
                a[0]=map.get(num)[0];
                a[1]=map.get(num)[1];
            }
            else {
                map.put(num,new int[2]);
                findSequence(num - 3, a, map);
                if (foundSequence) {
                    a[1] += 3;
                    map.get(num)[1]=a[1];
                    return;
                }
                findSequence(num - 5, a,map);
                if (foundSequence) {
                    a[0] += 5;
                    map.get(num)[0]=a[0];
                    return;
                }
            }
        }


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        int tCases = sc.nextInt();
        while(tCases > 0){
            foundSequence =false;
            int num = sc.nextInt();
            Map<Integer,int[]> map = new HashMap<Integer,int[]>();
            findSequence(num, a,map);
            for(int i=0;i<a[1];i++)
                System.out.print("5");
            for(int i=0;i<a[0];i++)
                System.out.print("3");
            if(a[0]==0 && a[1]==0)
                System.out.print("-1");
            System.out.println();
            tCases --;
            a[0]=0;a[1]=0;
        }
    }
}
