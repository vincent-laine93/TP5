module sio.app {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.app to javafx.fxml;
    exports sio.app;
}