package application;

import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class exercise15_Animation extends Application {
    private boolean animationRunning = true;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Polygon pentagon = createPentagon();
        Rectangle rectangle = new Rectangle(20, 10, Color.BLUE);

        // Path transition for the rectangle
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.seconds(5));
        pathTransition.setPath(pentagon);
        pathTransition.setNode(rectangle);
        pathTransition.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(PathTransition.INDEFINITE);
        pathTransition.setAutoReverse(true);

        // Change opacity as the rectangle moves
        pathTransition.currentTimeProperty().addListener((obs, oldTime, newTime) -> {
            double progress = newTime.toSeconds() / pathTransition.getTotalDuration().toSeconds();
            rectangle.setOpacity(0.5 + 0.5 * Math.sin(progress * Math.PI * 2));
        });

        pane.getChildren().addAll(pentagon, rectangle);

        // Mouse click to pause/resume
        pane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                if (animationRunning) {
                    pathTransition.pause();
                } else {
                    pathTransition.play();
                }
                animationRunning = !animationRunning;
            }
        });

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Rectangle on Pentagon");
        primaryStage.setScene(scene);
        primaryStage.show();

        pathTransition.play();
    }

    private Polygon createPentagon() {
        Polygon pentagon = new Polygon();
        double centerX = 250, centerY = 250, radius = 100;
        for (int i = 0; i < 5; i++) {
            pentagon.getPoints().addAll(
                centerX + radius * Math.cos(2 * Math.PI * i / 5),
                centerY - radius * Math.sin(2 * Math.PI * i / 5)
            );
        }
        pentagon.setStroke(Color.BLACK);
        pentagon.setFill(null);
        return pentagon;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

