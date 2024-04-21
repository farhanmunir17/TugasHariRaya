public class jumlahBilangan {
    public static void main(String[] args) {
        System.out.println("Menjumlahkan bilangan dari 1 sampai 50");
        int jumlah = 0;
        int i = 1;

        while (i <= 50) {
            if (i % 2 == 0) {
                jumlah += i;
            }
            i++;
        }
        System.out.print("Total: " + jumlah);
    }
}
