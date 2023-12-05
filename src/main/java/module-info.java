module com.example.semesterprojekt1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.semesterprojekt1 to javafx.fxml;
    exports com.example.semesterprojekt1;
}