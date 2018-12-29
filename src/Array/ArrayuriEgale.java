package Array;

import java.util.Scanner;

public class ArrayuriEgale {
    static void elgalitate(int[] array1, int[] array2){
        boolean egal = true;
        if (array1.length == array2.length){
            for (int i = 0; i < array1.length; i++){
                if (array1[i] != array2[i]){
                    egal = false;
                }
            }
        }
        else {
            egal = false;
        }
        if (egal){
            System.out.println("Cele doua array-uri sunt egale");
        }
        else {
            System.out.println("Cele doua array-uri nu sunt egale");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente ale array-ului: ");
        int n = sc.nextInt();
        int V[] = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("V [ " + i + "] = ");
            V[i] = sc.nextInt();
        }
        System.out.print("Introduceti numarul de elemente ale celui de al doilea array: ");
        int m = sc.nextInt();
        int S[] = new int[m];
        for (int j = 0; j < m; j++){
            System.out.print("S [ " + j + "] = ");
            S[j] = sc. nextInt();
        }
        elgalitate(V,S);
    }
}
