package serachCompanents;

public class BinarySearch {


    /**
     * Binariy searchni sikl bilan aniqlash
     * @param arres
     * @param x
     * @return
     */
    public int binaryFunc(int arres[], int x) {

        int first_index = 0;
        int last_index = arres.length - 1;

        while (first_index <= last_index) {

            int middle = first_index + (last_index - first_index) / 2;

            if (arres[middle] == x)
                return middle;

            if (arres[middle] < x)
                first_index = middle + 1;

            else
                last_index = middle - 1;

        }

        return -1;

    }

    /**
     *
     * Binary searchda recursiya bilan topish
     *
     * @param arres
     * @param search
     * @param first_index
     * @param last_index
     * @return
     */
    public int recurtionBinary(int arres[], int search, int first_index, int last_index) {

        if (first_index <= last_index) {

            int middle = (last_index - first_index) / 2;

            if (arres[middle] == search)
                return middle;

            if (arres[middle] < search)
                return recurtionBinary(arres, search, middle + 1, last_index);

            else
                return recurtionBinary(arres, search, first_index, middle - 1);

        }

        return -1;

    }

}
