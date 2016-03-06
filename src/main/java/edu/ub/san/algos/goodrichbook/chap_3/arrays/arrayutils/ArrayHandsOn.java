package edu.ub.san.algos.goodrichbook.chap_3.arrays.arrayutils;

import java.util.Arrays;

/**
 * Created by san on 3/2/16 for algos.
 */
public class ArrayHandsOn {

    public static void checkArrayEquals(){
        String [] a = {"one","two","three"};
        String [] b = {"one","two","three"};
        boolean isEquals = a.equals(b);
        System.out.println("a.equals(b) => " + isEquals);
        if(isEquals)
            throw new RuntimeException("a.equals(b) should be false");
    }

    public static void checkArraysEquals() {
        String [] a = {"one","two","three"};
        String [] b = {new String("one"),"two","three"};
        boolean isEquals = Arrays.equals(a,b);
        System.out.println("Arrays.equals(a,b) => " + isEquals);
        if(!isEquals)
            throw new RuntimeException("Arrays.equals(a,b) should be true");
    }

    public static void checkArraysDeepEquals() {
        String [][] a = {{"one","two","three"}, {"bob","Harry","Nick"}};
        String [][] b = {{"one","two","three"}, {"bob","Harry","Nick"}};
        if(!Arrays.equals(a,b) && Arrays.deepEquals(a,b)) {
            System.out.println("Arrays.equals(a,b) => " + Arrays.equals(a,b));
            System.out.println("Arrays.deepEquals(a,b) => " + Arrays.deepEquals(a,b));
        } else
            throw new RuntimeException("Arrays.equals(a,b) should be false && " +
                                               "Arrays.deepEquals(a,b) should be true");
    }

    public static void checkArrayFill(){
        String [] a = new String[10];
        Arrays.fill(a, "Hello");
        System.out.println(Arrays.toString(a));
    }

    public static void checkArrayCopyOf(){
        String [] a = new String[5];
        Arrays.fill(a, "Hello");
        String [] b = Arrays.copyOf(a, 10);
        System.out.println(Arrays.toString(b));
    }

    public static void checkArraySort() {
        String [] a = {"also", "aa", "zebra", "no"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void checkBinarySearch() {
        String [] a = {"also", "aa", "zebra", "no"};
        Arrays.sort(a);
        System.out.println("Sorted Array => " + Arrays.toString(a));
        System.out.println("value = no is at index => " + Arrays.binarySearch(a, "no"));
    }

    public static void main(String[] args) {
//        checkArrayEquals();
//        checkArraysEquals();
        checkArraysDeepEquals();
        //checkArrayFill();
        //checkArrayCopyOf();
        //checkArraySort();
//        checkBinarySearch();
    }
}
