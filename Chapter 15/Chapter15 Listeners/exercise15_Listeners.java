package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class exercise15_Listeners extends Application {
    private double radius = 20;
    private Circle ball = new Circle(radius, radius, radius);

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        ball.setFill(Color.RED);
        pane.getChildren().add(ball);

        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    if (ball.getCenterY() - radius > 0) 
                        ball.setCenterY(ball.getCenterY() - 10);
                    break;
                case DOWN:
                    if (ball.getCenterY() + radius < pane.getHeight())
                        ball.setCenterY(ball.getCenterY() + 10);
                    break;
                case LEFT:
                    if (ball.getCenterX() - radius > 0)
                        ball.setCenterX(ball.getCenterX() - 10);
                    break;
                case RIGHT:
                    if (ball.getCenterX() + radius < pane.getWidth())
                        ball.setCenterX(ball.getCenterX() + 10);
                    break;
            }
        });

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Move the Ball");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
