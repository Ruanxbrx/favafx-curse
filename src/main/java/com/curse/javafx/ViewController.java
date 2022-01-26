package com.curse.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewController {
    @FXML
    private Button btTest;

    @FXML
    public void onBtTestAction() {
        System.out.println("click ");

    }
}