import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;

public class ulangTahun {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("=== Hari Ulang Tahun ===");

        int tanggalLahir;
        Month bulanLahir;

        System.out.print("Masukan Tanggal Lahir Anda: ");
        tanggalLahir = input.nextInt();
        System.out.print("Masukan Bulan Lahir Anda: ");
        String bulanString = input.next();
        bulanLahir = Month.valueOf(bulanString.toUpperCase());

        LocalDate tanggalSekarang = LocalDate.now();
        System.out.println("Sekarang Tanggal: " + tanggalSekarang);

        int tanggal = tanggalSekarang.getDayOfMonth();
        Month bulan = tanggalSekarang.getMonth();

        if (tanggal == tanggalLahir && bulan.equals(bulanLahir)) {
            System.out.println("HAPPY BIRTHDAY TO YOU !!");
        } else {
            System.out.println("Hari ini bukan hari ulang tahun anda.");
        }
    }
}
