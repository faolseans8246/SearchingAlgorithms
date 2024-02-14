import serachCompanents.BinarySearch;
import serachCompanents.JumpSearch;
import serachCompanents.LinearSearch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nMassiv uzunligini kiriting: ");
        int len = scanner.nextInt();

        int[] massiv = new int[len];

        for (int i = 0; i < len; i ++) {
            System.out.printf("%d-item: ", (i + 1));
            massiv[i] = scanner.nextInt();
        }

        System.out.print("\nIzlanayotgan son: ");
        int searching_number = scanner.nextInt();


        /**
         * Pastdan berilgan algorithm clasini chaqirib uni ichidagi methodadn foydalanib ishlatish mumkin
         */

    }
}