package com.curse.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {

    @FXML
    private Button btTest;

    @FXML
    public void buttonAction(){
        System.out.println("clik");
    }
}
