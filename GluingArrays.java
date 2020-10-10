package com.company;

// Написать метод, который принимает два массива и “склеивает” их
public class GluingArrays {

    public static int[] gluingArrays(int[] arr1, int[] arr2){
        int[] result = new int[(arr1.length + arr2.length)];

        for (int i = 0; i < arr1.length; i++){
            result[i]=arr1[i];
        }
        for (int i = arr1.length; i < result.length; i++){
            result[i]=arr2[i- arr1.length];
        }
        for (int i = 0; i < result.length; i++){
            System.out.printf("%2d", result[i]);
        }
        return result;
    }
    public static void main(String[] args) {
	int[] arr1 = {1, 3, 5, 7};
	int[] arr2 = {1, 2, 4, 6};
	int[] arr12 = gluingArrays(arr1, arr2);
    }
}
