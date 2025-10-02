import java.util.Scanner;

public class Perpustakaan24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Perpustakaan Kampus ===");

        System.out.print("Apakah Anda membawa kartu mahasiswa? (ya/tidak): ");
        String kartu = input.nextLine();

        System.out.print("Apakah Anda sudah registrasi online? (ya/tidak): ");
        String registrasi = input.nextLine();

        if (kartu.equalsIgnoreCase("ya") || registrasi.equalsIgnoreCase("ya")) {
            System.out.println("Izin masuk diberikan.");
        } else {
            System.out.println("Izin masuk ditolak.");
        }

        input.close();
    }
}
