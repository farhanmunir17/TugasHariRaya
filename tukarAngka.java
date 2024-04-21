import java.util.Scanner;

public class tukarAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menukar 2 Angka ===");

        int angka1;
        int angka2;

        System.out.print("Masukan Angka ke-1: ");
        angka1 = input.nextInt();
        System.out.print("Masukan Angka ke-2: ");
        angka2 = input.nextInt();

        System.out.println("=== Sebelum Ditukar ===");
        System.out.println("Angka Pertama = " + angka1);
        System.out.println("Angka Kedua = " + angka2);

        int tukar = angka1;
        angka1 = angka2;
        angka2 = tukar;

        System.out.println("=== Setelah DiTukar ===");
        System.out.println("Angka Pertama = " + angka1);
        System.out.println("Angka Kedua = " + angka2);
    }
}