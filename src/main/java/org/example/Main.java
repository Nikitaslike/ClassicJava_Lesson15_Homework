package org.example;

public class Main {
    public static void main(String[] args) {
        int[] ar = {9, 16, -28, 9, 0, 27, 29, 9, 34, 1};
        System.out.println("Hello world!");
        printArray(ar);
//        bubbleSort(ar);
//        selectSort(ar);
        insertionSort(ar);
        printArray(ar);

    }
    public static void printArray(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
    }
    public static void bubbleSort(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length-1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];//1
                    ar[j] = ar[j + 1];//2
                    ar[j + 1] = temp;//3
                }
            }
        }

    }
    public static void selectSort(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    int temp = ar[i];//1
                    ar[i] = ar[j];//2
                    ar[j] = temp;//3
                }
            }
        }
    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j] > curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }
}