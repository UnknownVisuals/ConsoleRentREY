package com.consolesrr.consolesrentrey;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SignUpController {

    @FXML
    private TextField fullNameTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField confirmPasswordTextField;

    @FXML
    private AnchorPane signUpAnchorPane;

    @FXML
    void signUpButtonAction(ActionEvent event) {
        String fullName = fullNameTextField.getText();
        String address = addressTextField.getText();
        String phoneNumber = phoneNumberTextField.getText();
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        String confirmPassword = confirmPasswordTextField.getText();

        System.out.println(fullName);
        System.out.println(address);
        System.out.println(phoneNumber);
        System.out.println(username);
        System.out.println(password);
        System.out.println(confirmPassword);
    }

    @FXML
    void logInHyperlinkAction(ActionEvent event) throws IOException {
        new SceneSwitch(signUpAnchorPane, "login-view.fxml");
    }

}
