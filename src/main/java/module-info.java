module com.curse.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.curse.javafx to javafx.fxml;
    exports com.curse.javafx;
}