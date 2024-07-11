package org.example.line98;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import viewModel.Line98MD;

import java.io.IOException;

public class Menu {
    private Stage stage;
    @FXML
    private Label instruction;

    @FXML
    private Button playBtn;

    @FXML
    void switchToPlay(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("line98.fxml"));
        Parent root = fxmlLoader.load(); // Load the FXML file and get the root node
        Line98 controller = fxmlLoader.getController(); // Get the controller associated with the FXML file
        controller.setViewModel(new Line98MD()); // Set the ViewModel on the controller
        Scene scene = new Scene(root); // Create a new Scene with the root node
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene); // Set the Scene on the Stage
        stage.setResizable(false); // Make the stage non-resizable
        stage.show(); // Show the stage
    }

}
