import java.util.Scanner;

public class sigin_login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulang = 'y';
        char login = 'y';
        while (ulang == 'y') {

            System.out.println("=== PROGRAM SIGN IN & LOGIN ===");
            System.out.println("=================================");

            String username = "", pw = "";

            System.out.println("=== SIGN IN ===");
            System.out.print("Masukan Username: ");
            username = input.nextLine();

            System.out.println("Masukan Password: ");
            pw = input.nextLine();

            System.out.println("== Sign In Berhasil ===");
            System.out.println("Apakah Anda Ingin Login? (y/n) :");
            input.next().charAt(0);
            input.nextLine();
            System.out.println("======================================================");

            while (login == 'y') {
                String usernameCopy, pwCopy;

                System.out.println();
                System.out.println("=== LOGIN ===");

                System.out.print("Masukkan Username: ");
                usernameCopy = input.nextLine();

                System.out.print("Masukkan Password: ");
                pwCopy = input.nextLine();

                if (username.equals(usernameCopy) && pw.equals(pwCopy)) {
                    System.out.println("Login Berhasil. Selamat Datang " + username + "!!");
                    System.out.println("========================================================");
                    break;
                } else if (!username.equals(usernameCopy)) {
                    System.out.println("Username Tidak Terdaftar");
                    System.out.println("Apakah Anda Ingin Login Lagi? (y/n)");
                    input.next().charAt(0);
                    System.out.println("========================================================");
                } else {
                    System.out.println("Login Gagal. Pastikan Password Benar !!");
                    System.out.println("Apakah Anda Ingin Login Lagi? (y/n)");
                    input.next().charAt(0);
                    System.out.println("========================================================");

                }
            }

            System.out.println("Apakah Anda Ingin Mengulangi Program? (y/n)");
            input.next().charAt(0);

        }
    }
}
