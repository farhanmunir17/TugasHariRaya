import java.util.Scanner;

public class hitungRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menghitung Nilai Rata-Rata ===");

        System.out.print("Masukan Angka ke-1:");
        int angka1 = input.nextInt();
        System.out.print("Masukan Angka ke-2:");
        int angka2 = input.nextInt();
        System.out.print("Masukan Angka ke-3:");
        int angka3 = input.nextInt();

        double rata2 = (angka1 + angka2 + angka3) / 3;
        System.out.println("Hasil Rata-Rata :" + rata2);

    }
}