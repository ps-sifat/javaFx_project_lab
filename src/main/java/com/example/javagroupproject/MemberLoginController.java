package com.example.javagroupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class MemberLoginController {

    @FXML
    private TextField memberIdField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private void handleLogin() {
        String id = memberIdField.getText().trim();
        String password = passwordField.getText().trim();

        if (id.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Please fill in both fields.");
            return;
        }

        // Check last 3 digits of ID as password
        if (id.length() >= 3) {
            String lastThree = id.substring(id.length() - 3);
            if (password.equals(lastThree)) {
                messageLabel.setText("Login successful!");
            } else {
                messageLabel.setText("Incorrect password.");
            }
        } else {
            messageLabel.setText("Invalid ID format.");
        }
    }

    @FXML
    private void handleBack(ActionEvent event) {
        try {
            // Load the main page FXML file (adjust path if needed)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/javagroupproject/library_main.fxml"));
            Scene scene = new Scene(loader.load(), 400, 350);

            // Get current stage and set new scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Library Management System");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
