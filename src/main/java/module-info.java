module com.example.angelaoten {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.angelaoten to javafx.fxml;
    exports com.example.angelaoten;
}