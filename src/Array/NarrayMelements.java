package Array;
import java.util.Arrays;
import java.util.Scanner;


    public class NarrayMelements {
        int suma = 0;

        Scanner sc = new Scanner(System.in);

        public void citire() {
            System.out.print("Introduceti numarul de array-uri: ");
            int N = sc.nextInt();
            int[] array = new int[N];
            int[] sumaArray = new int[N];
            for (int i = 0; i < N; i++) {

                System.out.print("Introduceti numarul de elemente din array: ");
                int M = sc.nextInt();
                int[] tempArray = new int[M];

                for (int j = 0; j < M; j++) {
                    System.out.print("tempArray [ " + i + " ] [ " + j + "] = ");
                    tempArray[j] = sc.nextInt();
                    array[i] = tempArray[j];

                }

                suma = 0;
                for (int j = 0; j < M; j++) {
                    suma = suma + tempArray[j];
                }


                sumaArray[i] = suma;

                System.out.println(Arrays.toString(sumaArray));
            }
            for (int i = 0; i < sumaArray.length; i++) {
                if (sumaArray[i] != sumaArray[sumaArray.length - i - 1]) {
                    System.out.println("Sumele nu sunt egale");
                } else {
                    System.out.println("Sumele sunt egale");
                }
                break;
            }




        }
    }


