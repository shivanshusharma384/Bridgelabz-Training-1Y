package com.gla.arrays;

public class GreatestElement {
    public static void main(String [] args){

        int[] ar = {3,4,5,6,7,8};
        int max=0;
        for(int i = 0; i < ar.length; i++){
            if (max<ar[i]){
                max=ar[i];
            }
        }
        System.out.println("Greatest element "+max);
    }
}
