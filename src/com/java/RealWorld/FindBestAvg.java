package com.java.RealWorld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindBestAvg {

//    Problem Statement: I have a 2D array of strings containing student names and respective marks as below

//    String[][] scores = {{"Bob","85"},{"Mark","100"},{"Charles","63"},{"Mark","34"}};

    public static void main(String[] args) {

        String[][] scores = {{"Bob","10"},{"Bob","85"},{"Mark","100"},{"Charles","63"},{"Mark","34"}};

        //convert input to hm
        HashMap<String,List<Integer>> hm = new HashMap();
        System.out.println(scores);
        for (String[] score: scores) {
            Integer currentScore=Integer.parseInt(score[1]);
            String name=score[0];

            if (hm.containsKey(name)) {
                List<Integer> allScores=hm.get(name);
                allScores.add(currentScore);

                hm.put(name, allScores);
            } else
            {
                List<Integer> allScores = new ArrayList<>();
                allScores.add(currentScore);
                hm.put(name,allScores);
            }

        }
        System.out.println(hm);

        //find best avg from hashmap
        int maxAvg=0;
        for(List<Integer> value:hm.values()){
            int size=value.size();
            int sum=0;
            for(int v: value){
                sum+=v;
            }
            int avg=sum/size;
            maxAvg=Math.max(maxAvg,avg);
        }
        System.out.println(maxAvg);


    }

}
