package org.example.keycrafapp.view.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.keycrafapp.Services.UserService;

public class LoginViewController {
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    private final UserService userService = new UserService();

    @FXML
    private void onLogin() {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (userService.loginUser(email, password)) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Invalid email or password.");
        }
    }

    @FXML
    private void onRegister() {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (userService.registerUser(email, password)) {
            messageLabel.setText("Registration successful!");
        } else {
            messageLabel.setText("Email already in use.");
        }
    }
}
