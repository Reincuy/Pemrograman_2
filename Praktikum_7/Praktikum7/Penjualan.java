public class Penjualan {
    private int id; // ID penjualan, jika ada auto-increment di database
    private String tanggal;
    private String produk;
    private int jumlah;
    private double totalHarga;

    // Constructor
    public Penjualan(int id, String tanggal, String produk, int jumlah, double totalHarga) {
        this.id = id;
        this.tanggal = tanggal;
        this.produk = produk;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getProduk() {
        return produk;
    }

    public void setProduk(String produk) {
        this.produk = produk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    @Override
    public String toString() {
        return "Penjualan{" +
                "id=" + id +
                ", tanggal='" + tanggal + '\'' +
                ", produk='" + produk + '\'' +
                ", jumlah=" + jumlah +
                ", totalHarga=" + totalHarga +
                '}';
    }
}
