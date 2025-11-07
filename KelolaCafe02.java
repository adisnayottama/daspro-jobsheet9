import java.util.Scanner;

public class KelolaCafe02 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int jumlahPesanan;
        String[] namaPesanan;
        double[] hargaPesanan;
        double totalBiaya;
        int i;

        totalBiaya = 0;

        System.out.print("Masukkan jumlah pesanan: ");
        jumlahPesanan = sc.nextInt();
        sc.nextLine();

        namaPesanan = new String[jumlahPesanan];
        hargaPesanan = new double[jumlahPesanan];

        for (i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": Rp ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();

            totalBiaya += hargaPesanan[i];
            System.out.println();
        }

        System.out.println("=== DAFTAR PESANAN CAFE ===");
        for (i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("Total biaya: Rp " + totalBiaya);
    }
}