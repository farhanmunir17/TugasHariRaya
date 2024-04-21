import java.util.Random;

class kataRandom {
    public static void main(String[] args) {
        System.out.println("=== Membuat Kata Random ===");
        String huruf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();

        Random acak = new Random();
        int length = 7;

        for (int i = 0; i < length; i++) {
            int index = acak.nextInt(huruf.length());

            char hurufRandom = huruf.charAt(index);

            sb.append(hurufRandom);
        }

        String hurufRandom = sb.toString();
        System.out.println("Kata Random adalah: " + hurufRandom);

    }
}