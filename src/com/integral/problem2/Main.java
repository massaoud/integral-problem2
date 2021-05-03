package com.integral.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array1 = {1, 3, 5, 7, 8};    // first array
        int[] array2 = {2, 4, 6, 9, 10};  //second array

        // call merge methode
        int[] array3 = merge(array1, array2);
        System.out.println("Merged array after merging our two array: " + Arrays.toString(array3));
    }

     static int[] merge(int[] arr1, int[] arr2) {
        List<Integer> array3 = new ArrayList<>();
        Integer[] ar1 = Arrays.stream(arr1) .boxed() .toArray(Integer[]::new);
        Integer[] ar2 = Arrays.stream(arr2) .boxed() .toArray(Integer[]::new);
        Stream.of(ar1, ar2).flatMap(Stream::of).sorted().forEach(array3::add);
        return array3.stream().mapToInt(Integer::intValue).toArray();
    }


}
