module com.example.javagroupproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.javagroupproject to javafx.fxml;
    exports com.example.javagroupproject;
}