package Praktikum2.Soal2;

class Kopi {
    String namaKopi;  
    String ukuran;    
    double harga;     
    private String pembeli; 

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return this.pembeli;
    }

    public double getPajak() {
        return harga * 0.11;
    }

    public void info() {
        System.out.printf("Nama Kopi: %s%n", namaKopi);
        System.out.printf("Ukuran: %s%n", ukuran);
        System.out.printf("Harga: Rp. %.1f%n", harga);
    }
}
