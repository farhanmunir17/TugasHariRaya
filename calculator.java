import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== CALCULATOR ===");

        System.out.print("Pilih Operasi(+, -, *, /) :");
        char operasi = input.next().charAt(0);

        System.out.println("Masukan Bilangan Pertama:");
        double bilangan1 = input.nextDouble();

        System.out.println("Masukan Bilangan Pertama:");
        double bilangan2 = input.nextDouble();

        double hasil = 0;
        switch (operasi) {
            case '+':
                hasil = bilangan1 + bilangan2;
                break;
            case '-':
                hasil = bilangan1 - bilangan2;
                break;
            case '*':
                hasil = bilangan1 * bilangan2;
                break;
            case '/':
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                } else {
                    System.out.println("Tidak bisa membagi dengan 0");
                    return;
                }
                break;
            default:
                System.out.println("Operasi tidak valid");
                return;
        }

        System.out.println("Hasil:" + hasil);
    }
}
