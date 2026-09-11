import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFX extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Hello JavaFX!");

        Button button = new Button("Click Me");

        StackPane root = new StackPane();

        root.getChildren().addAll(label, button);

        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("My First JavaFX Program");
        stage.setScene(scene);

        stage.show();

        button.setOnAction(event -> {
            label.setText("Button Clicked!");
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}