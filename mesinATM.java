import java.util.Scanner;

public class mesinATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== PROGRAM MESIN ATM ===");

        String username, password, password_awal = "12345";
        int saldo = 100000000;
        char home = 'y';

        while (home == 'y') {

            System.out.println("=== LOG IN ===");
            System.out.print("Masukan Username: ");
            username = input.nextLine();

            System.out.print("Masukan Password: ");
            password = input.nextLine();

            if (username.equals(username) && password.equals(password_awal)) {
                char ulang = 'y';
                int opsi;
                while (ulang == 'y') {
                    System.out.println("=== Selamat Datang di Bank Cahaya Ilahi ===");
                    System.out.println("1. Periksa Saldo");
                    System.out.println("2. Tarik Saldo");
                    System.out.println("3. Isi Saldo");
                    System.out.println("4. Ganti Password");
                    System.out.println("5. Keluar");
                    System.out.println("Silahkan Pilih (1-5):");
                    opsi = input.nextInt();

                    switch (opsi) {
                        case 1: {
                            System.out.println("==============================================================");
                            System.out.println("Sisa Saldo Anda: Rp." + saldo);

                            System.out.println("Apakah anda ingin mengulangi intruksi? (y/n):");
                            ulang = input.next().charAt(0);

                            if (ulang != 'y') {
                                System.out.println("Apakah anda ingin mengulang? (y/n):");
                                home = input.next().charAt(0);
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("====================================================");
                            int minus;
                            System.out.println("Masukan Nominal :");
                            minus = input.nextInt();

                            if (minus < saldo) {
                                saldo -= minus;
                                System.out.println("Tarik Saldo Berhasil\n");
                                System.out.println("Sisa Saldo Anda : Rp." + saldo);
                            } else {
                                System.out.println("Saldo Tidak Cukup. Sisa Saldo Anda Rp." + saldo);
                            }

                            System.out.println("Apakah anda ingin mengulangi intruksi? (y/n):");
                            ulang = input.next().charAt(0);

                            if (ulang != 'y') {
                                System.out.println("Apakah anda ingin mengulang? (y/n):");
                                home = input.next().charAt(0);
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("====================================================");
                            int plus;
                            System.out.println("Masukan Nominal :");
                            plus = input.nextInt();

                            if (plus < saldo) {
                                saldo += plus;
                                System.out.println("Isi Saldo Berhasil\n");
                                System.out.println("Sisa Saldo Anda : Rp." + saldo);
                            } else {
                                System.out.println("Input Tidak Valid. Masukan Angka.");
                            }

                            System.out.println("Apakah anda ingin mengulangi intruksi? (y/n):");
                            ulang = input.next().charAt(0);

                            if (ulang != 'y') {
                                System.out.println("Apakah anda ingin mengulang? (y/n):");
                                home = input.next().charAt(0);
                            }
                            break;
                        }
                        case 4: {
                            System.out.println("====================================================");
                            String Konfirmasi_password, password_baru;
                            System.out.println("Masukan Password Lama :");
                            Konfirmasi_password = input.nextLine();

                            if (Konfirmasi_password == password) {
                                System.out.println("Masukan Password Baru :");
                                password_baru = input.nextLine();
                                System.out.println("====================================================");
                                ulang = 'n';
                                home = 'y';
                            } else {
                                System.out.println("Password Salah. Pastikan Password Anda Benar.");
                                System.out.println("====================================================");
                                ulang = 'y';
                            }
                            break;
                        }
                        case 5: {
                            ulang = 'n';
                            System.out.println("Apakah anda ingin mengulang Program? (y/n)");
                            home = input.next().charAt(0);
                            break;
                        }
                        default:
                            System.out.println("Intruksi Tidak Valid. Silahkan Pilih (1-5):");
                    }
                }
            }
            System.out.println("====================================================");
        }

    }
}
