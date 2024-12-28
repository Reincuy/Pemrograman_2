package soal2;

import java.util.Scanner;

class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String nama, String ras) {
        this.nama = nama;
        this.ras = ras;
    }

    public void display() {
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}

class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    public Kucing(String nama, String ras, String warnaBulu) {
        super(nama, ras);
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}

class Anjing extends HewanPeliharaan {
    private String[] kemampuan;

    public Anjing(String nama, String ras, String warnaBulu, String... kemampuan) {
        super(nama, ras);
        this.kemampuan = kemampuan;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("Memiliki kemampuan : ");
        for (String kemampuan : kemampuan) {
            System.out.print(kemampuan + " ");
        }
        System.out.println();
    }
}

public class PRAK402_2310817310004_MSAMILRENDYNORSALEH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (pilihan == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = scanner.nextLine();
            System.out.print("Ras: ");
            String ras = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            String warnaBulu = scanner.nextLine();

            Kucing kucing = new Kucing(nama, ras, warnaBulu);
            kucing.display();

        } else if (pilihan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = scanner.nextLine();
            System.out.print("Ras: ");
            String ras = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            String warnaBulu = scanner.nextLine();
            System.out.print("Kemampuan: ");
            String[] kemampuan = scanner.nextLine().split(",\\s*");

            Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);
            anjing.display();
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
