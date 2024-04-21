import java.util.Scanner;

public class wartegBuSri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== WARTEG IBU SRI ===");

        int makanan = 0;
        int minuman = 0;
        int total = 0;
        String lanjut;

        do {
            System.out.println("Silahkan Pilih Makanan Yang Anda Inginkan:");
            System.out.println("1. Nasi Rendang = Rp.15.000");
            System.out.println("2. Nasi Ayam Goreng = Rp.15.000");
            System.out.println("3. Nasi Ikan Laut = Rp.15.000");
            System.out.println("4. Nasi Babat = Rp.15.000");
            System.out.println("5. Nasi Telur Dadar = Rp.10.000");
            System.out.println("6. Nasi Kikil = Rp.15.000");
            System.out.println("7. Nasi Udang = Rp.15.000");
            System.out.println("8. Keluar");

            System.out.print("Silahkan Pilih: ");
            makanan = input.nextInt();
            input.nextLine();

            switch (makanan) {
                case 1:
                    System.out.println("Nasi Rendang");
                    break;
                case 2:
                    System.out.println("Nasi Ayam Goreng");
                    break;
                case 3:
                    System.out.println("Nasi Ikan Laut");
                    break;
                case 4:
                    System.out.println("Nasi Babat");
                    break;
                case 5:
                    System.out.println("Nasi Telur Dadar");
                    break;
                case 6:
                    System.out.println("Nasi Kikil");
                    break;
                case 7:
                    System.out.println("Nasi Udang");
                    break;
                case 8:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }

            if (makanan != 8) {
                System.out.println("Apakah Ada Tambahan Minuman? (y/n)");
                lanjut = input.nextLine();

                if (lanjut.equalsIgnoreCase("y")) {
                    System.out.println("Silahkan Pilih Minuman Yang Anda Inginkan:");
                    System.out.println("1. Es Teh = Rp.5.000");
                    System.out.println("2. Es Campur = Rp.10.000");
                    System.out.println("3. Es Jeruk = Rp.7.000");
                    System.out.println("4. Kelapa Muda = Rp.10.000");
                    System.out.println("5. Air Mineral = Rp.5.000");

                    minuman = input.nextInt();
                    input.nextLine();

                    switch (minuman) {
                        case 1:
                            System.out.println("Es Teh");
                            break;
                        case 2:
                            System.out.println("Es Campur");
                            break;
                        case 3:
                            System.out.println("Es Jeruk");
                            break;
                        case 4:
                            System.out.println("Kelapa Muda");
                            break;
                        case 5:
                            System.out.println("Air Mineral");
                            break;
                        default:
                            System.out.println("Pilihan Tidak Valid");
                            break;
                    }
                }

                total += getHargaMakanan(makanan) + getHargaMinuman(minuman);
                System.out.println("=== Pesanan Anda ===");
                System.out.println("Makanan:" + (makanan) + " + Minuman" + (minuman));
                System.out.println("Total: Rp." + total);
                System.out.println("Terima Kasih Selamat Makan Jangan Lupa Berdo'a");
            }
        } while (makanan != 8);
    }

    public static String getMakananName(int makanan) {
        switch (makanan) {
            case 1:
                return "Nasi Rendang";
            case 2:
                return "Nasi Ayam Goreng";
            case 3:
                return "Nasi Ikan Laut";
            case 4:
                return "Nasi Babat";
            case 5:
                return "Nasi Telur Dadar";
            case 6:
                return "Nasi Kikil";
            case 7:
                return "Nasi Udang";
            default:
                return "Pilihan Tidak Valid";
        }
    }

    // Metode untuk mendapatkan nama minuman berdasarkan nomor yang dipilih
    public static String getMinumanName(int minuman) {
        switch (minuman) {
            case 1:
                return "Es Teh";
            case 2:
                return "Es Campur";
            case 3:
                return "Es Jeruk";
            case 4:
                return "Kelapa Muda";
            case 5:
                return "Air Mineral";
            default:
                return "Pilihan Tidak Valid";
        }
    }

    // Metode untuk mendapatkan harga makanan berdasarkan nomor yang dipilih
    public static int getHargaMakanan(int makanan) {
        switch (makanan) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
                return 15000;
            case 5:
                return 10000;
            default:
                return 0;
        }
    }

    // Metode untuk mendapatkan harga minuman berdasarkan nomor yang dipilih
    public static int getHargaMinuman(int minuman) {
        switch (minuman) {
            case 1:
            case 5:
                return 5000;
            case 2:
                return 10000;
            case 3:
                return 7000;
            case 4:
                return 10000;
            default:
                return 0;
        }
    }
}
