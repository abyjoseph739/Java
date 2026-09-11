import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridExample extends Application {

    @Override
    public void start(Stage stage) {

        Label lb = new Label("Enter your name:");

        TextField tf = new TextField();

        Button br = new Button("Submit");

        Label result = new Label();

        GridPane root = new GridPane();

        root.add(lb, 0, 0);
        root.add(tf, 1, 0);

        root.add(br, 1, 1);

        root.add(result, 1, 2);

        Scene scene = new Scene(root, 400, 250);

        stage.setScene(scene);
        stage.setTitle("GridPane Example");

        br.setOnAction(event -> {
            String name = tf.getText();
            result.setText("Hello " + name);
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}