package com.example.javagroupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MemberPanelController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    // ------------------- BACK BUTTON -------------------
    @FXML
    private void handleBack(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml")); // Go back to Login Page
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Login Page");
        stage.show();
    }

    // ------------------- SEARCH BOOK BUTTON -------------------
    @FXML
    private void handleSearchBook(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("search_book.fxml")); // Load Search Book Page
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Search Book");
        stage.show();
    }

    // ------------------- CHECKOUT HISTORY BUTTON -------------------
    @FXML
    private void handleCheckoutHistory(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("checkout_history.fxml")); // Load Checkout History Page
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Checkout History");
        stage.show();
    }

    // ------------------- CHECKOUT BOOK BUTTON -------------------
    @FXML
    private void handleCheckoutBook(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("checkout_book.fxml")); // Load Checkout Book Page
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Checkout Book");
        stage.show();
    }

    // ------------------- VIEW ALL BOOKS BUTTON -------------------
    @FXML
    private void handleViewBooks(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("view_books.fxml")); // Load View Books Page
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("View All Books");
        stage.show();
    }
}
