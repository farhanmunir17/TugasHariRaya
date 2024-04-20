import java.util.Scanner;

public class gajiKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menghitung Gaji Karyawan Sesuai Jam Kerja ===");

        String namaKaryawan;
        char golongan;
        int jamKerja;
        int upahPerJam = 0;
        int total;

        System.out.print("Masukan Nama Karyawan:");
        namaKaryawan = input.nextLine();
        System.out.print("Pilih Golongan (A/B/C):");
        golongan = input.next().charAt(0);
        System.out.print("Masukan Total Jam Kerja:");
        jamKerja = input.nextInt();
        input.nextLine();

        switch (golongan) {
            case 'A':
                upahPerJam = 30000;
                break;
            case 'B':
                upahPerJam = 25000;
                break;
            case 'C':
                upahPerJam = 20000;
                break;
            default:
                System.out.println("Golongan yang dimasukkan tidak valid.");
                return;
        }

        total = jamKerja * upahPerJam;

        if ((jamKerja - 48) > 0) {
            total = total + ((jamKerja - 48) * 5000);
        }

        System.out.println("Karyawan yang bernama " + namaKaryawan + " menerima upah Rp. " + total + " per minggu");
        return;
    }
}
