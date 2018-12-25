package Array;

import java.util.Scanner;

public class SumaElemente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente pentru primul array: ");
        int n = sc.nextInt();
        int V[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("V[" + i + "] = ");
            V[i] = sc.nextInt();
        }
        System.out.print("Introduceti numarul de elemente pentru cel de al doilea array: ");
        int m = sc.nextInt();
        int S[] = new int[m];
        for (int i = 0; i < m; i++){
            System.out.print("S[" + i + "] = ");
            S[i] = sc.nextInt();
        }
        int suma1 = 0, suma2 = 0;
        for (int i = 0; i < n; i++){
            suma1 += V[i];}
            System.out.println("Suma elementelor primului array este = " + suma1);
        for (int i = 0; i < m; i++){
            suma2 += S[i];
        }
        System.out.println("Suma elementelor celui de al doilea array este = " + suma2);

        if (suma1 == suma2){
            System.out.println("Sumele celor doua array-uri sunt egale");
        }
        else {
            System.out.println("Sumele nu sunt egale");
        }


    }
}
