package serachCompanents;

public class LinearSearch {


    /**
     * linear searchni sikl bilan aniqlash
     * @param arr
     * @param find
     * @return
     */
    public int linearFunc(int arr[], int find) {

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == find) {
                return i;
            }
        }

        return -1;
    }

}
