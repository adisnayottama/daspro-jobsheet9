import java.util.Scanner;

public class KelolaNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah;
        int[] nilai;
        int total, nilaiTertinggi, nilaiTerendah;
        double rataRata;
        int i;

        total = 0;
        nilaiTertinggi = 0;
        nilaiTerendah = 0;
        rataRata = 0.0;

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        jumlah = sc.nextInt();
        nilai = new int[jumlah];

        for (i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }
        nilaiTertinggi = nilai[0];
        nilaiTerendah = nilai[0];

        for (i = 1; i < nilai.length; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        rataRata = (double) total / nilai.length;

        System.out.println("\nRata-rata nilai  : " + rataRata);
        System.out.println("Nilai tertinggi  : " + nilaiTertinggi);
        System.out.println("Nilai terendah   : " + nilaiTerendah);

        System.out.print("Semua nilai      : ");
        for (i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
    }
}
