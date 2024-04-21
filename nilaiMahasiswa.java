import java.util.Scanner;

public class nilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== DATA NILAI MAHASISWA ===");

        System.out.print("NAMA: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        int NIM = input.nextInt();

        System.out.print("NILAI TUGAS: ");
        int TUGAS = input.nextInt();

        System.out.print("NILAI UTS: ");
        int UTS = input.nextInt();

        System.out.print("NILAI UAS: ");
        int UAS = input.nextInt();

        double Nilai_Akhir = (TUGAS * 0.3f + UTS * 0.3f + UAS * 0.3);
        System.out.println("Nilai Akhir = " + Nilai_Akhir);
    }
}