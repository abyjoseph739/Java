import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main1 extends Application{
    public void start(Stage stage){
        Label lb = new Label("Enter your name:");
        TextField tf = new TextField();
        tf.setPromptText("Type your name");
        Button br = new Button("Greet");
        Label result = new Label();
        VBox root = new VBox(10);
        root.getChildren().addAll(lb,tf,br,result);
        Scene scene = new Scene(root,400,250);
        stage.setScene(scene);
        stage.setTitle("Greeting Application");
        br.setOnAction(event ->{
            String name = tf.getText();
            result.setText("hello"+ name);
        });
        stage.show();



    }
}

