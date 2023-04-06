package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    @FXML
    private Label welcomeLabel;

    @FXML
    private TextField nameTextField;

    private String username;

    public void setUsername(String username) {
        this.username = username;
        welcomeLabel.setText("Welcome, " + username + "!");
    }

    @FXML
    private void handleLogout(ActionEvent event) {
        try {
            Parent loginParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene loginScene = new Scene(loginParent, 300, 200);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(loginScene);
            window.setTitle("Login");
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleUpdateName(ActionEvent event) {
        String newName = nameTextField.getText();
        setUsername(newName);
    }

    // Other methods and logic can be added here as needed
}