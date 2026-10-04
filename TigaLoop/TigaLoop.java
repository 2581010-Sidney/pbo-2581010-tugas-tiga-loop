import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 5;

        System.out.println("Basas Deret (n) : " + n);
        System.out.println("==== SATU DERET, TIGA LOOP ====");
        System.out.print("for\t\t\t: ");
        for (int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("while\t\t: ");
        int i=1;
        while (i<=n){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        System.out.print("do-while\t: ");
        int k=1;
        do{
            System.out.print(k + " ");
            k++;
        } while (k<=n);
        System.out.println();
    }
}