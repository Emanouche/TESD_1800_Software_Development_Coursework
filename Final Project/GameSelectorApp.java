package FinalProject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameSelectorApp extends Application {
	private List<Game> games = new ArrayList<>();
	private ListView<String> gameListView = new ListView<>();
	
	public static void main (String [] args) {
		launch(args);
		
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Game Selector");
		
	//TextFields to enter game details
	TextField gameField = new TextField();
	gameField.setPromptText("Enter game name");
	
	TextField genreField = new TextField();
	genreField.setPromptText ("Enter game genre");
	
	//label to display the selected game
	Label selectedGameLabel =new Label();
	
	//Add Button to add games to the list
	Button addButton = new Button("Add Game");
	addButton.setOnAction(e -> {
		String gameName = gameField.getText().trim();
		String gameGenre = genreField.getText().trim();
		if (!gameName.isEmpty() && !gameGenre.isEmpty()) {
			Game game = new Game(gameName, gameGenre);
			games.add(game);
			gameListView.getItems().add(game.toString());
			gameField.clear();
			genreField.clear();
		}
		
	});
	
	// Random Button to pick a game from the list
	Button randomButton = new Button ("Pick Random Game");
	randomButton.setOnAction(e -> {
		if (!games.isEmpty()) {
			Random random = new Random();
			Game randomGame = games.get(random.nextInt(games.size()));
			selectedGameLabel.setText("Selected Game: " + randomGame);
			
			//pop up alert of selected game
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Random Game Selected");
			alert.setHeaderText(null);
			alert.setContentText("Selected game: " + randomGame);
			alert.showAndWait();
		}
		else {
			selectedGameLabel.setText("No game to pick from!");
		}
	});
	
	//Layout
	VBox layout = new VBox(10, gameField, genreField, addButton, randomButton, gameListView, 
					 selectedGameLabel);
	Scene scene = new Scene(layout, 300, 400);
	
	primaryStage.setScene(scene);
	primaryStage.show();
	
	
	}
}



