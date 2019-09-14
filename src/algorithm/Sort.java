package algorithm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;

        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j < array.length-i-1; j++)
                if (array[j] > array[j+1]) {

                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        return list;
    }

    public int [] mergeSort(int [] array, int n){

        if (n < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] l = new int[mid];
        int[] r = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l, mid);
        mergeSort(r, array.length - mid);

        merge(array, l, r, mid, array.length - mid);
        return array;
    }
    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public int [] quickSort(int [] array) {
        int start = 0;
        int end = 0;
        int partition = partition(array, start, end);

        return array;
    }

    private int partition(int[] array, int start, int end) {
        return start;
    }

    void quickSort(int[] array, int start, int i) {
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array, int noOfBucket){
        List [] buckets = new List[noOfBucket];
        for (int i = 0; i < noOfBucket; i++) {
            buckets[i] = new LinkedList();
        }
        for(int num : array){

            buckets[hash(num)].add(num);
        }
        // sort buckets
        for(List bucket : buckets){
            Collections.sort(bucket);
        }
        int i = 0;
        // Merge buckets to get sorted array
        for(List bucket : buckets){
            for(Object num : bucket){
                array[i++] = (int) num;
            }
        }
        return array;
    }

    public static int hash(int num){
        return num/10;
    }

        



    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int key = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for (int value : array) {
            System.out.println(value);
        }
    }
}
