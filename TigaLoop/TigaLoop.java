import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Batas Deret (n) : ");
        int n = scanner.nextInt();
        System.out.println();

        System.out.println("==== SATU DERET, TIGA LOOP ====");
        System.out.print("for\t\t\t: ");
        for (int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("while\t\t: ");
        int w = 1;
        while (w<=n){
            System.out.print(w + " ");
            w++;
        }
        System.out.println();

        System.out.print("do-while\t: ");
        int k = 1;
        do{
            System.out.print(k + " ");
            k++;
        } while (k<=n);
        System.out.println();
        System.out.println();

        int kurang = 0;
        for (int j=1; j<n; j++){
            kurang++;
        }

        int kurangSama = 0;
        for (int j=1; j<=n; j++){
            kurangSama++;
        }
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        int tercetak = 0;
        System.out.print("Disaring :");
        for (int h=1; h<=10; h++){
            if (h % 2 ==0){
                continue;
            }
            if (h>7){
                break;
            }
            System.out.print(" " + h);
            tercetak++;
        }
        System.out.println();
        System.out.println("Sampai println\t: " + tercetak + " kali");
    }
}

/*
* Jalanan pertama, n=5 --------
*
* Batas Deret (n) : 5

==== SATU DERET, TIGA LOOP ====
for			: 1 2 3 4 5
while		: 1 2 3 4 5
do-while	: 1 2 3 4 5

i <  n berputar : 4 kali
i <= n berputar : 5 kali
Disaring : 1 3 5 7
Sampai println	: 4 kali

* Jalanan kedua, n=0 --------
*
* Batas Deret (n) : 0

==== SATU DERET, TIGA LOOP ====
for			:
while		:
do-while	: 1

i <  n berputar : 0 kali
i <= n berputar : 0 kali
Disaring : 1 3 5 7
Sampai println	: 4 kali
*
* Kesimpulan: do-while mengecek kondisi sesudah badan loop dijalankan, jadi badannya pasti jalan minimal sekali.

* "Kenapa baris for dan while kosong, sedangkan do-while tidak?"
* Jawaban:
* Karena for dan while mengecek kodisi sebelum badan loop. sedangkan do while menjalankan badan loop minimal sekali baru mengecek kondisi.

* "Kenapa loop penyaring tidak berhenti di i=8?"
* Jawaban:
* di pengecekan if (h>7), tertulis kondisi berhenti apabila h>7. ketika h=8 dan karena itu angka genap jadi continue dan lompat keiterasi berikutnya.
* ketika h=9 karna ganjil, continue tidak aktif dan pengecekan apakah h>7 dijalankan lalu menghentikaan loop.
* Hasil tetap 1 3 5 7 walau sebenarnya berhenti di 9 dan bukan di 8.
* */