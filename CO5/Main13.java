import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Main13 extends Application{
    public void start(Stage stage){
        Label lb = new Label("Name :");
        TextField tf = new TextField();
        tf.setPromptText("Enter Name");
        Button sb = new Button("Submit");
        Button cl = new Button("Clear");

        HBox root = new HBox(10);
        root.getChildren().addAll(lb,tf,sb,cl);

        sb.setOnAction(event ->{
            System.out.println("Name :"+tf.getText());
        });

        cl.setOnAction(event ->{
            tf.clear();
        });

        Scene scene = new Scene(root,400,200);

        stage.setTitle("HBox");
        stage.setScene(scene);
        stage.show();


    }
}