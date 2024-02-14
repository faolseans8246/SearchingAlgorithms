package serachCompanents;

public class JumpSearch {

    public int jumpFunc(int arres[], int x) {

        int len = arres.length;

        int step = (int)Math.floor(Math.sqrt(len));

        int prev = 0;

        for (int minStep = Math.min(step, x)- 1; arres[minStep] < x; minStep = Math.min(step, x) - 1) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(len));

            if (prev >= len) {
                return -1;
            }
        }


        while (arres[prev] < x) {
            prev ++;

            if (prev == Math.min(step, x)) {
                return -1;
            }
        }

        if (arres[prev] == x) {
            return prev;
        }


        return -1;

    }

}
