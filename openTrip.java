import java.util.Scanner;

public class openTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== OPEN TRIP GN.RINJANI ===");
        System.out.println("=== Registrasi Peserta ===");

        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = input.nextInt();
        if (jumlahPeserta <= 0) {
            System.out.println("Jumlah Peserta Tidak Boleh 0");
            return;
        }
        input.nextLine();

        String[] namaPeserta = new String[jumlahPeserta];
        String[] ttlPeserta = new String[jumlahPeserta];
        int[] usiaPeserta = new int[jumlahPeserta];
        String[] jenisKelPeserta = new String[jumlahPeserta];
        String[] noHpPeserta = new String[jumlahPeserta];

        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.print("Nama Peserta ke-" + (i + 1) + ": ");
            namaPeserta[i] = input.nextLine();

            System.out.print("Tempat, Tanggal lahir Peserta ke-" + (i + 1) + ": ");
            ttlPeserta[i] = input.nextLine();

            System.out.print("Usia Peserta ke-" + (i + 1) + ": ");
            usiaPeserta[i] = input.nextInt();
            input.nextLine();

            System.out.print("Jenis Kelamin Peserta ke-" + (i + 1) + ": ");
            jenisKelPeserta[i] = input.next();

            System.out.print("No Hp Peserta ke-" + (i + 1) + ": ");
            noHpPeserta[i] = input.next();

        }

        System.out.println("\n=== Data Peserta Open Trip Gunung Rinjani ===");
        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.println("Nama: " + namaPeserta[i]);
            System.out.println("TTL : " + ttlPeserta[i]);
            System.out.println("Usia: " + usiaPeserta[i]);
            System.out.println("Jenis Kelamin: " + jenisKelPeserta[i]);
            System.out.println("NO Hp: " + noHpPeserta[i]);
            System.out.println("=== Pendaftaran Selesai, Terima Kasih!! ===");
            System.out.println("======================================");
        }
    }
}
// masih ada kendala jika yg dimasukan lebih dari 1 orang