import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class fx3 extends Application{
    public void start(Stage stage){
        Label name = new Label("Name :");
        TextField nm = new TextField();
        nm.setPromptText("enter your name");
        Label Email = new Label("Email :");
        TextField em = new TextField();
        em.setPromptText("email");
        Label Course = new Label("Course");
        TextField ce = new TextField();
        ce.setPromptText("course");

        Button registerButton = new Button("Register");
        Label result = new Label();

        VBox root = new VBox(10);
        root.getChildren().addAll(nm,em,ce);

        GridPane gr = new GridPane();

        gr.add(name, 0, 0);
        gr.add(nm, 1, 0);

        gr.add(Email, 0, 1);
        gr.add(em, 1, 1);

        gr.add(Course, 0, 2);
        gr.add(ce, 1, 2);

        gr.add(registerButton, 1, 3);
        gr.add(result, 1, 4);


        registerButton.setOnAction(event ->{
            String nme = nm.getText();
            result.setText("Registration successful, " + nme);
        });
        Scene scene = new Scene(gr,500,300);
        stage.setScene(scene);
        stage.setTitle("Student Registration");

        stage.show();




    }
}
