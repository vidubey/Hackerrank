package com.vidyakant.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 20/12/14.
 */
public class KDifference {

    public static void main(String[] args){
        Map<Long,Boolean> map = new HashMap<Long,Boolean>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        for(int i=0;i<N;i++)
            map.put(sc.nextLong(),true);
        int count=0;
        for(Long key: map.keySet()){
            if(map.containsKey(K+key))
                count++;
        }
        System.out.println(count);

    }

}
