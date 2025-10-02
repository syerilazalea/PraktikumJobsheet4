import java.util.Scanner;

public class ifCetakKRS24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD --- ");
        System.out.print("Apakah UKT sudah lunas (true/false) : ");
        boolean uktLunas = scanner.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi ");
            System.out.print("Silahkan cetak KRS dan minta tanda tangan DPA");
        }

        else {
            System.out.println("Pembayaran UKT belum lunas ");
            System.out.print("Silahkan lunasi UKT terlebih dahulu");
        }
        
    }
}