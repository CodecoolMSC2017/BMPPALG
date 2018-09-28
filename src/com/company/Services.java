package com.company;

public class Services {

    public static int [] returnIndices(int [] iArray, int target)throws Exception{
        int [] resultArray = new int[2];
        int tmpTarget ;
        if(iArray.equals(null)||iArray.length==0){
            return resultArray;

        }


        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j <iArray.length ; j++) {
                if(iArray[i]+iArray[j]==target){
                    resultArray[0] = j;
                    resultArray[1] = i;
                    break;
                }

            }
            }
            if(resultArray[0]+resultArray[1]==0||target==0){
            throw new Exception("The target cant be achived from the array");
            }

            return resultArray;
        }




    }

