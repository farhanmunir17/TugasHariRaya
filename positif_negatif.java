import java.util.Scanner;

public class positif_negatif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menentukan Bilangan Positif Atau Negatif ===");

        System.out.println("Masukan Angka:");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println(angka + " Adalah Bilangan Positif");
        }
        if (angka < 0) {
            System.out.println(angka + " Adalah Bilangan Negatif");
        } else {
            System.out.println("");
        }

    }
}