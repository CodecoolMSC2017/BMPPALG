package com.company;

public class Main {

    public static void main(String[] args) {
        int[] Testlist = new int[]{1,2,3,4};
        int target = 9;
	//Services services = new Services();
        try {
            for (int i: Services.returnIndices(Testlist,target)){

                System.out.println(i);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

     //   System.out.println(Services.returnIndices(Testlist,target));
    }
}
