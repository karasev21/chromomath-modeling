package io.github.karasev21.chromomath.controllers;

import java.io.IOException;
import java.sql.SQLException;

import io.github.karasev21.chromomath.db.Database;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class dbConnectorController {
  @FXML
  private TextField dbNameTextField;
  @FXML
  private TextField userTextField;
  @FXML
  private TextField passwordTextField;



  public void handleConnectDB(){
    Database.getConnection("jdbc:postgresql://localhost:5433/" + dbNameTextField.getText(), userTextField.getText(), passwordTextField.getText());
  }
}