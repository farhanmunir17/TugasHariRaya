import java.util.Scanner;

public class soal19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan;

        System.out.println("=== Kalkulator Faktorial ===");
        System.out.print("Masukkan sebuah bilangan bulat positif: ");
        bilangan = input.nextInt();

        if (bilangan < 0) {
            System.out.println("Itu bukan Bilangan Positif.");
        } else {
            long faktorial = hitungFaktorial(bilangan);
            System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);
        }
    }

    public static long hitungFaktorial(int n) {
        if (n == 0) {
            return 1;
        }

        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        return hasil;
    }
}
