package com.battleships.controller;

import java.net.URL; 
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.control.Label;


public class MainController implements Initializable {

    @FXML
    private Label ship3efield;

    @FXML
    private GridPane boardLeft;

    @FXML
    private Label ship1efield;

    @FXML
    private Label ship2efield;

    private Label currentLabel;
    @FXML
    private GridPane boardRight;

    @FXML
    private Label ship4efield;


    @FXML
    void da2222(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	        ship1efield.setText("1-el, Left: 4");
	        ship2efield.setText("2-el, Left: 3");
	        ship3efield.setText("3-el, Left: 2");
	        ship4efield.setText("4-el, Left: 1");
	}

	 public void shipSelected(Event event) {
	        if (currentLabel != null)
	            currentLabel.setStyle("-fx-background-color:white;");
	        currentLabel = (Label) event.getSource();

	        currentLabel.setStyle("-fx-background-color:pink;");

	    }
}
