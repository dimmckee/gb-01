package ru.geekbrains.j1.lesson2;

public class homework2 {

        public static void main(String[] args) {
            /* Задание 1 */
            int[] arr = {1, 0, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) arr[i] = 0;
                else arr[i] = 1;
            }

            System.out.println(Arrays.toString(arr));

            /* Задание 2 */

            int[] arr2 = new int[8];
            for (int i = 0, int j = 1;
            i<arr2.length ;
            i++, j = j + 3){
                arr2[i] = j;
            }
            System.out.println(Arrays.toString(arr2));

            /* Задание 3 */


            int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < w.length; i++) {
                if (arr3[i] < 6) arr3[i] = arr3[i] * 2;
            }
            System.out.println(Arrays.toString(arr3));


            /* Задание 4 */

            int[][] arr4 = new int[4][4];
            for (int i = 0; i < arr4.length; i++) {
                for (int j = 0; j < arr4.length; j++) {
                    if ((i == j) || /* ? */) {
                        arr4[i][j] = 1;
                    }

                }
            }

            /* Задание 5 */
            int[] arr5 = {6, 4, 2, 2, 16, 8, 5, 9, 3, 8,};
            int min = arr5[0], max = arr5[0], i, imin = 0, imax = 0;
            for (i = 0; i != arr5.length; i++) {
                if (arr5[i] < min) {
                    min = arr5[i];
                    imin = i;
                }
                if (arr5[i] > max) {
                    max = arr5[i];
                    imax = i;
                }
                System.out.println("max = " + max + " min = " + min);
                System.out.println("imax = " + imax + " imin = " + imin);
            }

        }

    }



