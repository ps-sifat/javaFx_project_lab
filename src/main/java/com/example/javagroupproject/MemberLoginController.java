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
    private void handleLogin(ActionEvent event) {
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
                goToMemberPanel(event); // Go to Member Panel after successful login
            } else {
                messageLabel.setText("Incorrect password.");
            }
        } else {
            messageLabel.setText("Invalid ID format.");
        }
    }

    private void goToMemberPanel(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/javagroupproject/member_panel.fxml"));
            Scene scene = new Scene(loader.load(), 430, 370);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Member Panel");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBack(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/javagroupproject/library_main.fxml"));
            Scene scene = new Scene(loader.load(), 400, 350);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Library Management System");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
