package com.codecool.dynamicArrayDojo;

import java.util.Arrays;

// put your code here!
public class DynamicIntArray {

    private int[] arr;


    public DynamicIntArray(int length) {
        this.arr = new int[length];
    }

    public DynamicIntArray() {
        this.arr = new int[0];
    }

    public void add(int insertedValue) {
        this.arr = Arrays.copyOf(arr, arr.length+1);
        this.arr[arr.length-1] = insertedValue;
    }

    public void remove(int removableValue) {
        int[] tempArr = new int[this.arr.length-1];
        for(int i=0, j=0; i<this.arr.length; i++) {
            if(this.arr[i] == removableValue) {
                continue;
            }
            tempArr[j] = this.arr[i];
            j++;
        }

        this.arr = tempArr;
    }



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int value : this.arr) {
            builder.append(" ");
            builder.append(value);
        }

        String text = builder.toString();

        return text;
    }

}
