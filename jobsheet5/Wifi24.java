import java.util.Scanner;

public class Wifi24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== === === ===  === === === ===");
        System.out.println("=== Sistem Akses WiFi Kampus ===");
        System.out.println("=== === === ===  === === === ===");
        System.out.println("Jenis pengguna: ");
        System.out.println("1. Dosen");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Lainnya");

        System.out.print("Masukkan pilihan Anda: ");
        String jenis = input.nextLine();


        if (jenis.equalsIgnoreCase("dosen")) {
            System.out.println("=== Akses WiFi diberikan (anda adalah dosen). ===");
        } else if (jenis.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = input.nextInt();

            if (sks >= 12) {
                System.out.println("=== Akses WiFi diberikan (anda adalah mahasiswa aktif). ===");
            } else {
                System.out.println("=== Akses ditolak, SKS kurang dari 12. ===");
            }
        } else {
            System.out.println("=== Akses ditolak (anda bukan bagian civitas akademika). ===");
        }

        input.close();
    }
}
