import java.util.Scanner;
public class ganjilGenap24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Menentukan Ganjil Genap ===");
        System.out.print("Masukkan bilangan : ");
        int angka = scanner.nextInt();
        String hasil;

        if (angka % 2 == 0) {
            hasil = "Genap";
        } else {
            hasil = "Ganjil";
        }
        System.out.println("Hasil dengan if-else: " + hasil);
    }
}