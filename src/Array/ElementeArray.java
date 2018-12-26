package Array;
import java.util.Scanner;

public class ElementeArray {
    public int suma =0;
    public int temp1, temp2;
    Scanner sc;
    int temp;

    public void citire(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente al array-ului: ");
        int n = sc.nextInt();
        int V[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("V[" + i + "] = ");
            V[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            suma += V[i];}
        System.out.println("Suma elementelor array-ului = " + suma);

    }
    public void comparare(){
        if (temp1 == 0){
            temp1 = suma;
        }
        else{
            temp2 = suma;
        }
        if (temp1 == temp2){
            System.out.println("Valoarea elementelor sunt egale!");
                    }
        else {
            System.out.println("Nu sunt egale");
        }


    }
}
