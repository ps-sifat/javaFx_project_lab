package com.example.javagroupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;

public class LibraryMainController {

    @FXML
    private void handleAdmin(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("admin_login.fxml"));
            Scene scene = new Scene(loader.load(), 400, 350);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Admin Login");
            stage.show();
        } catch (Exception e) {
            showError("Unable to open Admin Login Page: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @FXML
    private void handleMember(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("member_login.fxml"));
            Scene scene = new Scene(loader.load(), 430, 370);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Member Login");
            stage.show();
        } catch (Exception e) {
            showError("Unable to open Member Login Page: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @FXML
    private void handleAbout() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About Us");
        alert.setHeaderText("Library Management System");
        alert.setContentText("This system was developed to manage library operations efficiently.");
        alert.showAndWait();
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Navigation Error");
        alert.setContentText(message);
        alert.showAndWait();
    }
}
