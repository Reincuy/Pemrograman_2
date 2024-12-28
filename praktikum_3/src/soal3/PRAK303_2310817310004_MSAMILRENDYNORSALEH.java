package soal3;

import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}

public class PRAK303_2310817310004_MSAMILRENDYNORSALEH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = scanner.nextLine();
                    mahasiswaList.add(new Mahasiswa(nama, nim));
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = scanner.nextLine();
                    mahasiswaList.removeIf(mhs -> mhs.getNim().equals(nimHapus));
                    System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                    break;
                case 3:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nimCari = scanner.nextLine();
                    mahasiswaList.stream()
                            .filter(mhs -> mhs.getNim().equals(nimCari))
                            .forEach(mhs -> System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama()));
                    break;
                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    mahasiswaList.forEach(mhs -> System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama()));
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
