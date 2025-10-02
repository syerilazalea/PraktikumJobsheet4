import java.util.Scanner;

public class nestedUjianSkripsi24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pesan;
        System.out.println("=== Ujian Skripsi SIAKAD === ");

        System.out.print("Apakah mahasiswa bebas kompen ? (ya/tidak) : ");
        String bebasKompen = scanner.nextLine().trim();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            // input log bimbingan hanya jika sudah bebas kompen
            System.out.print("Masukkan log bimbingan Pembimbing 1 ? : ");
            int logBimbingan1 = scanner.nextInt();
            System.out.print("Masukkan log bimbingan Pembimbing 2 ? : ");
            int logBimbingan2 = scanner.nextInt();

            if (logBimbingan1 >= 8 && logBimbingan2 >= 4) {
                pesan = "Mahasiswa boleh mendaftar ujian skripsi ";
            } else if (logBimbingan1 < 8 && logBimbingan2 < 4) {
                pesan = "Gagal! log bimbingan tidak memenuhi 8 kali dan kurang dari 4 kali";
            } else if (logBimbingan1 < 8) {
                pesan = "Gagal! log bimbingan tidak memenuhi 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }

        } else {
            pesan = "Gagal! mahasiswa masih memiliki tanggungan kompen";
        }

        System.out.println(pesan);
    }
}
