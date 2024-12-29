package Application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Praktikum6 extends Application {
    private TableView<Mahasiswa> tableView;
    private ObservableList<Mahasiswa> data;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        TableColumn<Mahasiswa, String> colNIM = new TableColumn<>("NIM");
        colNIM.setCellValueFactory(param -> param.getValue().nimProperty());

        TableColumn<Mahasiswa, String> colNama = new TableColumn<>("Nama");
        colNama.setCellValueFactory(param -> param.getValue().namaProperty());

        data = FXCollections.observableArrayList(
                new Mahasiswa("2201", "Ali"),
                new Mahasiswa("2202", "Budi"),
                new Mahasiswa("2203", "Citra"),
                new Mahasiswa("2204", "Dewi"),
                new Mahasiswa("2205", "Eka"),
                new Mahasiswa("2206", "Faisal"),
                new Mahasiswa("2207", "Gina"),
                new Mahasiswa("2208", "Hadi"),
                new Mahasiswa("2209", "Ika"),
                new Mahasiswa("2210", "Joko")
        );

        tableView = new TableView<>(data);
        tableView.getColumns().addAll(colNIM, colNama);

        TextField tfNIM = new TextField();
        tfNIM.setPromptText("NIM");
        TextField tfNama = new TextField();
        tfNama.setPromptText("Nama");

        Button btnAdd = new Button("Tambah");
        btnAdd.setOnAction(e -> {
            if (!tfNIM.getText().isEmpty() && !tfNama.getText().isEmpty()) {
                data.add(new Mahasiswa(tfNIM.getText(), tfNama.getText()));
                tfNIM.clear();
                tfNama.clear();
            }
        });

        Button btnDelete = new Button("Hapus");
        btnDelete.setOnAction(e -> {
            Mahasiswa selected = tableView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                data.remove(selected);
            }
        });

        HBox formBox = new HBox(10, tfNIM, tfNama, btnAdd, btnDelete);
        formBox.setAlignment(Pos.CENTER);

        VBox root = new VBox(10, tableView, formBox);
        root.setAlignment(Pos.CENTER);
        root.setPrefSize(400, 400);

        stage.setScene(new Scene(root));
        stage.setTitle("Praktikum 6 - GUI JavaFX");
        stage.show();
    }
}
