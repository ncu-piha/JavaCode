package com.company;

public class Main {
    //partitioning logic

      static int  Partition(int l,int h){
           int a[]={38,27,43,3,9,82,10};
           int pivot=a[l];
           int i=l;
           int j=h;

           while(i<j){
               while(a[i]<=pivot) {
                   i++;
               }
               while(a[j]>pivot){
                 j--;
               }
               if(i<j){
                   swap(a,i,j);
               }
               }
           swap(a,i,l);

           return j;
       }

        static void quickSort(int l,int h){
          if(l<h){
              int pivot=Partition(l,h);
              quickSort(l,pivot-1);
              quickSort(pivot+1,h);
          }
       }
       public static void swap(int pivot,int i,int j){
          pivot=i;
          i=j;
          j=pivot;

       }
    public static void main(String[] args) {
        int a[]={38,27,43,3,9,82,10};

    }
}
