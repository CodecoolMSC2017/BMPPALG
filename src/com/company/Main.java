package com.company;

public class Main {

    public static void main(String[] args) {
        int[] Testlist = new int[]{1,2,3,4};
        int target = 4;
	//Services services = new Services();
        for (int i: Services.returnIndices(Testlist,target)){
            System.out.println(i);
        }
     //   System.out.println(Services.returnIndices(Testlist,target));
    }
}
