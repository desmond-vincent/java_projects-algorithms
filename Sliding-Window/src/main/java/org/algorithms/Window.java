package org.algorithms;

public record Window(int[] arr, int k) {

    public static int n;

    public Window(int[] arr, int k) {
        this.arr = arr;
        this.k = k;

        IO.println(windowSlider(arr, k));

    }

    private int windowSlider(int[] arr, int k) {
        n = arr.length;

        if (k >= n) {
            IO.println("Array is not big enough");
            return -1;
        }

        int maxSum = 0;

        //Creates the window
        for (int i = 0; i < k; i++) maxSum += arr[i];

        for (int i = k; i < n; i++) maxSum = Math.max(maxSum, (maxSum + arr[i]) - arr[i - k]);

        return maxSum;
    }
}

