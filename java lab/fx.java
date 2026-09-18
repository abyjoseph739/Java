import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentForm extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label(Enter your name);

        TextField textBox = new TextField();
        textBox.setPromptText(Your name);

        Button button = new Button(Submit);

        Label result = new Label();

        button.setOnAction(event - {
            String name = textBox.getText();
            result.setText(Welcome,  + name + !);
        });

        VBox layout = new VBox(10);

        layout.getChildren().addAll(
                label,
                textBox,
                button,
                result
        );

        Scene scene = new Scene(layout, 400, 250);

        stage.setTitle(Student Registration);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}