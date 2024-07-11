package org.example.line98;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import viewModel.Line98MD;

import java.net.URL;
import java.util.ResourceBundle;

import static HelpMethods.staticNumber.SIZE;

public class Line98 implements Initializable {
    private Line98MD model;
    @FXML
    private Button eraseButton;

    @FXML
    private Button hintButton;

    @FXML
    private GridPane line98Board;

    @FXML
    private Button newGameButton;

    @FXML
    private Button redoButton;

    @FXML
    private Button restart;

    @FXML
    private Button undoButton;

    @FXML
    void backToMenu(ActionEvent event) {

    }

    @FXML
    void erase(ActionEvent event) {

    }

    @FXML
    void hint(ActionEvent event) {

    }

    @FXML
    void newGame(ActionEvent event) {

    }

    @FXML
    void redo(ActionEvent event) {

    }

    @FXML
    void restart(ActionEvent event) {

    }

    @FXML
    void undo(ActionEvent event) {

    }
    public void setViewModel(Line98MD md){
        this.model = md;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initLine98();
        drawline98Board();
    }

    private void drawline98Board() {
    }

    private void initLine98() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                TextField textField = new TextField();
                textField.setPrefWidth(60);
                textField.setPrefHeight(60);

                textField.setStyle("-fx-text-box-border: transparent");
                textField.setEditable(false);

                textField.setAlignment(Pos.CENTER);

                textField.setFocusTraversable(false);

                line98Board.add(textField, col, row);
            }
        }
    }
}
