package serachCompanents;

import java.util.ArrayList;
import java.util.Arrays;

public class ExponentialSearch {


    /**
     *
     * Berilgan qidiruv algoritmining birinchi ishlash usuli
     *
     * @param arr
     * @param n
     * @param x
     * @return
     */
    static int exponentialSearch(int arr[], int n, int x)
    {
        if (arr[0] == x)
            return 0;

        int i = 1;
        while (i < n && arr[i] <= x)
            i = i*2;

        return Arrays.binarySearch(arr, i/2, Math.min(i, n-1), x);
    }


    /**
     *
     * Qidiruv tizimining ikkinchi ko'rinishi bilan ishash
     *
     * @param arr
     * @param x
     * @return
     */
    public static int exponential_search(ArrayList<Integer> arr, int x) {
        int n = arr.size();

        if (n == 0)
            return -1;

        int i = 1;
        while (i < n && arr.get(i) < x)
            i *= 2;

        // Perform binary search on the range [i/2, min(i, n-1)]
        int left = i / 2;
        int right = Math.min(i, n - 1);

        while (left <= right) {
            int mid = (left + right) / 2;  // finding mid

            if (arr.get(mid) == x)
                return mid;
            else if (arr.get(mid) < x)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

}
