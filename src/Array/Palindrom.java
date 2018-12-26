package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un cuvant: ");
        String cuvant = sc.nextLine();
        char[] Array = cuvant.toCharArray();
        char[] original = Arrays.copyOf(Array,Array.length);
        for (int i = 0; i < Array.length / 2; i++){
            char temp = Array[i];
            Array[i] = Array[Array.length - i - 1];
            Array[Array.length - i - 1] = temp;
        }
        System.out.println("Cuvantul initial este: " + Arrays.toString(original));
        System.out.println("Cuvantul inversat este: " + Arrays.toString(Array));

        if (Arrays.equals(Array,original)){
            System.out.println("Cuvantul este un PALINDROM");
        }
        else{
            System.out.println("Cuvantul NU este PALINDROM");
        }
    }
}
