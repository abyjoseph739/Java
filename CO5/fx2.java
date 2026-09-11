import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class fx2 extends Application{
    public void start(Stage stage){
        Label lb = new Label("Enter your name:");
        TextField tf = new TextField();
        tf.setPromptText("Type Your Name");
        Label result = new Label();
        Button br = new Button("Submit");
        VBox root = new VBox(10);
        root.getChildren().addAll(lb,tf,result,br);
        Scene scene = new Scene(root,400,200);
        br.setOnAction(event ->{
            String name = tf.getText();
            result.setText("hello "+name);
        });
        stage.setScene(scene);
        stage.setTitle("hey");
        stage.show();
    }
}