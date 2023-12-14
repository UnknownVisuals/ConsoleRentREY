package com.consolesrr.consolesrentrey;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Hyperlink signUpHyperlink;

    @FXML
    void logInButtonAction(ActionEvent event) {
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        System.out.println(username + " " + password);
    }

    @FXML
    void signUpHyperlinkAction(ActionEvent event) {
        System.out.println("Hyperlink Action Works!");
    }

}
