package com.consolesrr.consolesrentrey.controllers;

import com.consolesrr.consolesrentrey.DBUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private AnchorPane dashboardAnchorPane;

    @FXML
    private Button logOutButton;


    @FXML
    private Label helloUsernameLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        logOutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.switchScene(event,"login-view.fxml", null, null);
            }
        });
    }

    public void setUsername(String username) {
        helloUsernameLabel.setText(username);
    }

    @FXML
    void nintendoBannerAction(MouseEvent event) {

    }

    @FXML
    void psBannerAction(MouseEvent event) {

    }

    @FXML
    void xboxBannerAction(MouseEvent event) {

    }

}
