module com.example.taschenrechner {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.taschenrechner to javafx.fxml;
    exports com.example.taschenrechner;
}