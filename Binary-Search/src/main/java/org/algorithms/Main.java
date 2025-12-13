package org.algorithms;

import static org.algorithms.BinarySearch.search;

public class Main {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        int  result = search(arr,target);

        System.out.println("The target was found in index " + result);


    }
}

