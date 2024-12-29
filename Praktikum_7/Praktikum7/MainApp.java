import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Membuat TabPane
        TabPane tabPane = new TabPane();

        // Tab untuk Data Pelanggan
        Tab tabPelanggan = new Tab("Data Pelanggan", createPelangganPane());
        tabPelanggan.setClosable(false);

        // Tab untuk Data Buku
        Tab tabBuku = new Tab("Data Buku", createBukuPane());
        tabBuku.setClosable(false);

        // Tab untuk Data Penjualan
        Tab tabPenjualan = new Tab("Data Penjualan", createPenjualanPane());
        tabPenjualan.setClosable(false);

        // Menambahkan Tab ke TabPane
        tabPane.getTabs().addAll(tabPelanggan, tabBuku, tabPenjualan);

        // Scene dan Stage
        Scene scene = new Scene(tabPane, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Manajemen Data");
        primaryStage.show();
    }

    // Membuat pane untuk Data Pelanggan
    private VBox createPelangganPane() {
        Label namaLabel = new Label("Nama");
        TextField namaField = new TextField();

        Label emailLabel = new Label("Email");
        TextField emailField = new TextField();

        Label teleponLabel = new Label("Telepon");
        TextField teleponField = new TextField();

        // Tombol
        Button addButton = new Button("Add");
        Button editButton = new Button("Edit");
        Button deleteButton = new Button("Delete");

        HBox buttonBox = new HBox(10, addButton, editButton, deleteButton);
        buttonBox.setPadding(new Insets(10, 0, 10, 0));

        // Tabel Pelanggan
        TableView<Pelanggan> tableView = new TableView<>();

        TableColumn<Pelanggan, String> namaColumn = new TableColumn<>("Nama");
        namaColumn.setMinWidth(200);

        TableColumn<Pelanggan, String> emailColumn = new TableColumn<>("Email");
        emailColumn.setMinWidth(200);

        TableColumn<Pelanggan, String> teleponColumn = new TableColumn<>("Telepon");
        teleponColumn.setMinWidth(200);

        tableView.getColumns().addAll(namaColumn, emailColumn, teleponColumn);

        VBox vbox = new VBox(10, namaLabel, namaField, emailLabel, emailField, teleponLabel, teleponField, buttonBox, tableView);
        vbox.setPadding(new Insets(10));
        return vbox;
    }

    // Membuat pane untuk Data Buku
    private VBox createBukuPane() {
        Label namaBukuLabel = new Label("Nama Buku");
        TextField namaBukuField = new TextField();

        Label hargaLabel = new Label("Harga");
        TextField hargaField = new TextField();

        Label stokLabel = new Label("Stok");
        TextField stokField = new TextField();

        Label kategoriLabel = new Label("Kategori");
        ComboBox<String> kategoriCombo = new ComboBox<>();
        kategoriCombo.getItems().addAll("Fiksi", "Non-Fiksi", "Komik", "Ilmiah"); // Contoh data kategori

        // Tombol
        Button addButton = new Button("Add");
        Button editButton = new Button("Edit");
        Button deleteButton = new Button("Delete");

        HBox buttonBox = new HBox(10, addButton, editButton, deleteButton);
        buttonBox.setPadding(new Insets(10, 0, 10, 0));

        // Tabel Buku
        TableView<Buku> tableView = new TableView<>();

        TableColumn<Buku, String> namaColumn = new TableColumn<>("Nama Buku");
        namaColumn.setMinWidth(200);

        TableColumn<Buku, Double> hargaColumn = new TableColumn<>("Harga");
        hargaColumn.setMinWidth(100);

        TableColumn<Buku, Integer> stokColumn = new TableColumn<>("Stok");
        stokColumn.setMinWidth(100);

        TableColumn<Buku, String> kategoriColumn = new TableColumn<>("Kategori");
        kategoriColumn.setMinWidth(150);

        tableView.getColumns().addAll(namaColumn, hargaColumn, stokColumn, kategoriColumn);

        VBox vbox = new VBox(10, namaBukuLabel, namaBukuField, hargaLabel, hargaField, stokLabel, stokField, kategoriLabel, kategoriCombo, buttonBox, tableView);
        vbox.setPadding(new Insets(10));
        return vbox;
    }

    // Membuat pane untuk Data Penjualan
    private VBox createPenjualanPane() {
        Label tanggalLabel = new Label("Tanggal");
        TextField tanggalField = new TextField();

        Label produkLabel = new Label("Produk");
        ComboBox<String> produkCombo = new ComboBox<>();
        produkCombo.getItems().addAll("Produk A", "Produk B", "Produk C"); // Contoh produk

        Label jumlahLabel = new Label("Jumlah");
        TextField jumlahField = new TextField();

        // Tombol
        Button addButton = new Button("Add");
        Button editButton = new Button("Edit");
        Button deleteButton = new Button("Delete");

        HBox buttonBox = new HBox(10, addButton, editButton, deleteButton);
        buttonBox.setPadding(new Insets(10, 0, 10, 0));

        // Tabel Penjualan
        TableView<Penjualan> tableView = new TableView<>();

        TableColumn<Penjualan, String> tanggalColumn = new TableColumn<>("Tanggal");
        tanggalColumn.setMinWidth(150);

        TableColumn<Penjualan, String> produkColumn = new TableColumn<>("Produk");
        produkColumn.setMinWidth(200);

        TableColumn<Penjualan, Integer> jumlahColumn = new TableColumn<>("Jumlah");
        jumlahColumn.setMinWidth(100);

        TableColumn<Penjualan, Double> totalColumn = new TableColumn<>("Total Harga");
        totalColumn.setMinWidth(150);

        tableView.getColumns().addAll(tanggalColumn, produkColumn, jumlahColumn, totalColumn);

        VBox vbox = new VBox(10, tanggalLabel, tanggalField, produkLabel, produkCombo, jumlahLabel, jumlahField, buttonBox, tableView);
        vbox.setPadding(new Insets(10));
        return vbox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
