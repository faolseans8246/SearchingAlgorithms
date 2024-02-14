package serachCompanents;

public class InterpolotionSearch {

    public static int interpolationSearch(int arr[], int lost, int high, int x)
    {
        int position;

        if (lost <= high && x >= arr[lost] && x <= arr[high]) {

            position = lost + (((high - lost) / (arr[high] - arr[lost])) * (x - arr[lost]));

            if (arr[position] == x)
                return position;

            if (arr[position] < x)
                return interpolationSearch(arr, position + 1, high, x);

            if (arr[position] > x)
                return interpolationSearch(arr, lost, position - 1, x);
        }
        return -1;
    }

}
