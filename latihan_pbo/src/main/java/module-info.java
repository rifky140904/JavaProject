module com.example.latihan_pbo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.latihan_pbo to javafx.fxml;
    exports com.example.latihan_pbo;
}