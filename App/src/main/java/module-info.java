module sio.app {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.app to javafx.fxml;
    opens sio.app.models;
    exports sio.app;
}