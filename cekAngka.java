import java.util.Scanner;

class cekAngka {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = 3;
        int B = 6;
        int C = 2;
        int K = 5;
        int L = 4;
        int M = 3;

        // input soal a
        boolean soalA = (4 + 2 > A) && (B - 2 > 3 + 2) || (B + 2 <= 6 + 2);
        System.out.println("A = " + soalA);

        boolean soalB = (K + 5 < M) || (C * M < L) && (2 * M - L > 0);
        System.out.println("B = " + soalB);

        boolean soalC = (L + 5 < M) || (C * K < L) && (2 * K - L > 0);
        System.out.println("C = " + soalC);

        boolean soalD = (A * 4) <= (3 * M + B);
        System.out.println("D = " + soalD);

        boolean soalE = (K + 10 > A) && (L - 2 > 4 * C);
        System.out.println("E = " + soalE);
    }

}