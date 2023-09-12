package com.kaat.sceneswift;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SceneSwiftController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}