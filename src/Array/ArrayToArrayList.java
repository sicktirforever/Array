package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayToArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente ale array-ului: ");
        int n = sc.nextInt();
        String my_array[] = new String[n];
        for (int i = 0; i < n; i++){
            System.out.print("my_array [ " + i + "] = ");
            my_array[i] = sc.next();
        }
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(my_array));
        System.out.println(list);
    }
}
