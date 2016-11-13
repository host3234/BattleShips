package com.battleships.application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		     Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/com/battleships/board/MainBoard.fxml"));
		    Scene scene = new Scene(parent, 800,600);
			scene.getStylesheets().add(getClass().getResource("/com/battleships/board/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("BattleShips v0.1");		
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
