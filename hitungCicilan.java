import java.util.Scanner;

public class hitungCicilan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Menghitung Cicilan ===");

        System.out.println("Masukan jumlah cicilan yang harus dibayar:");
        double jumlahCicilan = scanner.nextDouble();

        System.out.println("Masukan jumlah bulan:");
        double jumlahBulan = scanner.nextDouble();

        double cicilan = jumlahCicilan / jumlahBulan;

        System.out.println("Uang Yang Harus Dibayar Tiap Bulan:" + cicilan);
    }
}
