import java.util.Scanner;

public class sistemPerpusWifi24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== === === === === === === === === === === ===");
        System.out.println("=== Sistem Perpustakaan & Akses WiFi Kampus ===");
        System.out.println("=== === === === === === === === === === === ===");

        System.out.print("Apakah Anda memiliki kartu anggota perpustakaan? (ya/tidak): ");
        String anggota = scanner.nextLine().trim();

        String pesan;

        if (anggota.equalsIgnoreCase("ya")) {
            System.out.print("Apakah Anda memiliki tunggakan buku? (ya/tidak): ");
            String tunggakan = scanner.nextLine().trim();

            if (tunggakan.equalsIgnoreCase("tidak")) {
                pesan = "Akses diterima: Anda bisa menggunakan layanan perpustakaan dan WiFi kampus.";
            } else {
                pesan = "Akses ditolak: Anda memiliki tunggakan buku.";
            }
        } else {
            pesan = "Akses ditolak: Anda bukan anggota perpustakaan.";
        }
        System.out.println(pesan);
        scanner.close();
    }
}
