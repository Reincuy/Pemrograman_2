public class Buku {
    private int id; // ID buku, jika ada auto-increment di database
    private String namaBuku;
    private double harga;
    private int stok;
    private String kategori;

    // Constructor
    public Buku(int id, String namaBuku, double harga, int stok, String kategori) {
        this.id = id;
        this.namaBuku = namaBuku;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "id=" + id +
                ", namaBuku='" + namaBuku + '\'' +
                ", harga=" + harga +
                ", stok=" + stok +
                ", kategori='" + kategori + '\'' +
                '}';
    }
}
