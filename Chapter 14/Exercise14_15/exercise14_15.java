package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class exercise14_15 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene and place it in the stage
        Scene scene = new Scene(new MyPolygon(), 400, 400);
        primaryStage.setTitle("ShowPolygon"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    
    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

class MyPolygon extends Pane {
    private void paint() {
        // Create a polygon and place polygon to pane
        Polygon polygon = new Polygon();
        polygon.setFill(Color.RED); // Fill the polygon with red color
        polygon.setStroke(Color.BLACK);
        polygon.setRotate(22.5); // Rotate the polygon by 22.5 degrees
        ObservableList<Double> list = polygon.getPoints();
        
        double centerX = getWidth() / 2, centerY = getHeight() / 2;
        double radius = Math.min(getWidth(), getHeight()) * 0.4;
        
        int s = 8; // Number of sides for an octagon
        
        // Add points to the polygon list
        for (int i = 0; i < s; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / s));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
        }
        
        // Create the text and set its properties
        Text text = new Text("STOP");
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 60));
        text.setFill(Color.WHITE);
        
        // Clear existing children and add the polygon and text
        getChildren().clear();
        getChildren().addAll(polygon, text);
        
        // Center the text within the pane
        text.setX(centerX - text.getBoundsInLocal().getWidth() / 2);
        text.setY(centerY + text.getBoundsInLocal().getHeight() / 4);
    }
    
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paint();
    }
    
    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paint();
    }
}
