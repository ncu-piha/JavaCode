package com.company;

public class Main {

    public static void main(String[] args) {
	    int arr[]={22,67,13,18,256};

        insertionSort obj= new insertionSort();
        obj.sort(arr);
       for(int i=0; i<=arr.length;i++){
           System.out.println(arr[i]);
       }
        System.out.println("piha");
    }

    public static class insertionSort{
        void sort(int arr[]){
            int n=arr.length;
            for(int i=1;i<n;++i){
                int key=arr[i];
                int j=i-1;

                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j=j-1;
                }
                arr[j+1]=key;
            }
        }
    }
}
