module com.example.newproject2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;
    requires java.desktop;


    opens com.example.newproject2 to javafx.fxml;
    exports com.example.newproject2;
}