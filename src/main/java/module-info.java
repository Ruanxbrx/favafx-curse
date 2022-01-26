module com.curse.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.curse.javafx;
    opens com.curse.javafx to javafx.fxml;
}