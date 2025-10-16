package com.example.javagroupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;

public class AdminLoginController {

    @FXML
    private TextField adminIdField;

    @FXML
    private Button loginBtn;

    @FXML
    private Label messageLabel;

    // Example hardcoded admin ID for demonstration
    private final String ADMIN_ID = "admin123";

    @FXML
    private void handleLogin() {
        String enteredId = adminIdField.getText().trim();

        if (enteredId.isEmpty()) {
            messageLabel.setText("Please enter your Admin ID.");
        } else if (enteredId.equals(ADMIN_ID)) {
            messageLabel.setText("Login successful!");
            // You can navigate to another scene here if needed.
        } else {
            messageLabel.setText("Invalid Admin ID. Try again.");
        }
    }

    public void handleBack(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("library_main.fxml"));
            Scene scene = new Scene(loader.load(), 400, 350);
            Image event = null;
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Library Management System");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
