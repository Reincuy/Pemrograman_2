import java.util.Scanner;

public class PRAK101_2310817310004_MSAMILRENDYNORSALEH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggi = scanner.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double berat = scanner.nextDouble();

        String[] bulanNama = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        System.out.printf("Nama Lengkap %s, Lahir di %s pada Tanggal %d %s %d%n", nama, tempatLahir, tanggalLahir, bulanNama[bulanLahir - 1], tahunLahir);
        System.out.printf("Tinggi Badan %d cm dan Berat Badan %.2f kilogram%n", tinggi, berat);

        scanner.close();
    }
}
