module com.kaat.sceneswift {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kaat.sceneswift to javafx.fxml;
    exports com.kaat.sceneswift;
}