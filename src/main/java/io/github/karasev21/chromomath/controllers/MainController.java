package io.github.karasev21.chromomath.controllers;

import java.io.IOException;

import javax.xml.transform.stax.StAXResult;

import io.github.karasev21.chromomath.MainApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void handleDBConnectionBtn() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/io/github/karasev21/chromomath/db-connection-view.fxml"));
        Scene scene = new Scene(root, 320, 240);
        Stage stage = new Stage();
        stage.setTitle("Connection to Database");
        stage.setScene(scene);
        stage.show();
    }
}