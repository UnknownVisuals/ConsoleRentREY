package com.consolesrr.consolesrentrey;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainController {
    @FXML
    private AnchorPane logInAnchorPane;

    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    void logInButtonAction(ActionEvent event) throws IOException {
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        System.out.println(username + " " + password);
    }
    @FXML
    void signUpHyperlinkAction(ActionEvent event) throws IOException {
        new SceneSwitch(logInAnchorPane, "signup-view.fxml");
    }
}
