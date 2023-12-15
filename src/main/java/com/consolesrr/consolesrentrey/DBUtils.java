package com.consolesrr.consolesrentrey;

import com.consolesrr.consolesrentrey.controllers.DashboardController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DBUtils {
    public static void switchScene(ActionEvent event, String fxmlFile, String username, String password) {
        Parent root = null;

        if (username != null && password != null) {
            try {
                FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource(fxmlFile));
                root = loader.load();
                DashboardController logInController = loader.getController();
                logInController.setUsername(username);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                root = FXMLLoader.load(DBUtils.class.getResource(fxmlFile));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,480,720));
        stage.show();
    }

    public static void signUp(ActionEvent event, String fullName, String address, int phoneNumber, String username, String password, String confirmPassword){
        Connection connection = ;
    }
}
