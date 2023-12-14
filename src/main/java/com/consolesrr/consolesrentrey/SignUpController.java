package com.consolesrr.consolesrentrey;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SignUpController {

    @FXML
    private TextField addressTextField;

    @FXML
    private TextField confirmPasswordTextField;

    @FXML
    private TextField fullNameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private AnchorPane signUpAnchorPane;

    @FXML
    private TextField usernameTextField;

    @FXML
    void logInHyperlinkAction(ActionEvent event) throws IOException {
        new SceneSwitch(signUpAnchorPane, "login-view.fxml");
    }

}
