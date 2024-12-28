package Praktikum2.Soal1;

class Buah {
    String namaBuah;
    double berat; 
    double hargaPerKg;
    double jumlahBeli; 

    public Buah(String namaBuah, double berat, double hargaPerKg, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.berat = berat;
        this.hargaPerKg = hargaPerKg;
        this.jumlahBeli = jumlahBeli;
    }

    public double getHargaSebelumDiskon() {
        return hargaPerKg * jumlahBeli;
    }

    public double getDiskon() {
        return (jumlahBeli / 4) * hargaPerKg * 0.02;
    }

    public double getHargaSetelahDiskon() {
        return getHargaSebelumDiskon() - getDiskon();
    }

    public void info() {
        System.out.printf("Nama Buah: %s%n", namaBuah);
        System.out.printf("Berat: %.2f kg%n", berat);
        System.out.printf("Harga: Rp%.2f/kg%n", hargaPerKg);
        System.out.printf("Jumlah Beli: %.2f kg%n", jumlahBeli);
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", getHargaSebelumDiskon());
        System.out.printf("Total Diskon: Rp%.2f%n", getDiskon());
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n%n", getHargaSetelahDiskon());
    }
}

public class soal1 {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000, 40);
        Buah mangga = new Buah("Mangga", 0.2, 3500, 15);
        Buah alpukat = new Buah("Alpukat", 0.25, 10000, 12);

        apel.info();
        mangga.info();
        alpukat.info();
    }
}
