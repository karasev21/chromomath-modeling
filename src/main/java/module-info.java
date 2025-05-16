module io.github.karasev21.chromomath {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens io.github.karasev21.chromomath.controllers to javafx.fxml;
    exports io.github.karasev21.chromomath;
    exports io.github.karasev21.chromomath.controllers;
}