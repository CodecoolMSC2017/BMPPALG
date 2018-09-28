package com.company;

public class Services {

    public static int [] returnIndices(int [] iArray, int target){
        int start ;
        int [] resultArray = new int[2];
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j <iArray.length ; j++) {
                if(iArray[i]+iArray[j]==target){
                    resultArray[0] = j;
                    resultArray[1] = i;
                }
            }
            }
            return resultArray;
        }

       // return resultArray;




    }

