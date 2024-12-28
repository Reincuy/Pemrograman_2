package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggal, int bulan, int tahun) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggal;
        this.bulanKemerdekaan = bulan;
        this.tahunKemerdekaan = tahun;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this(nama, jenisKepemimpinan, namaPemimpin, -1, -1, -1);
    }

    public void tampilkan(HashMap<Integer, String> bulanMap) {
        System.out.print("Negara " + nama + " mempunyai ");
        switch (jenisKepemimpinan.toLowerCase()) {
            case "presiden":
                System.out.println("Presiden bernama " + namaPemimpin);
                break;
            case "perdana menteri":
                System.out.println("Perdana Menteri bernama " + namaPemimpin);
                break;
            case "monarki":
                System.out.println("Raja bernama " + namaPemimpin);
                return;
        }
        System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " +
                           bulanMap.get(bulanKemerdekaan) + " " + tahunKemerdekaan);
    }
}

public class PRAK302_2310817310004_MSAMILRENDYNORSALEH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Negara> negaraList = new LinkedList<>();
        HashMap<Integer, String> bulanMap = new HashMap<>();
        String[] bulanNama = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        for (int i = 1; i <= 12; i++) {
            bulanMap.put(i, bulanNama[i]);
        }

        System.out.print("Masukkan jumlah negara: ");
        int jumlahNegara = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahNegara; i++) {
            System.out.print("Nama Negara: ");
            String nama = scanner.nextLine();
            System.out.print("Jenis Kepemimpinan: ");
            String jenisKepemimpinan = scanner.nextLine();
            System.out.print("Nama Pemimpin: ");
            String namaPemimpin = scanner.nextLine();

            if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                System.out.print("Tanggal Kemerdekaan: ");
                int tanggal = scanner.nextInt();
                System.out.print("Bulan Kemerdekaan: ");
                int bulan = scanner.nextInt();
                System.out.print("Tahun Kemerdekaan: ");
                int tahun = scanner.nextInt();
                scanner.nextLine();
                negaraList.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun));
            } else {
                negaraList.add(new Negara(nama, jenisKepemimpinan, namaPemimpin));
            }
        }

        for (Negara negara : negaraList) {
            negara.tampilkan(bulanMap);
            System.out.println();
        }

        scanner.close();
    }
}
