import java.util.Scanner;
public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs= new int[jmlMhs];
        int jmlLulus = 0, jmlTdkLulus = 0;
        double total = 0;
        double rata2;
        double totLulus = 0, totTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totTdkLulus += nilaiMhs[i];
                jmlTdkLulus++;
            }
        }
        
        double rataLulus = totLulus / jmlLulus;
        double rataTidakLulus = totTdkLulus / jmlTdkLulus;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}