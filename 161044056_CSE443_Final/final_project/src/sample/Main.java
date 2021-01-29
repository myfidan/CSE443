package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;


public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Person[] person = new Person[250];
        for(int i=0; i< person.length-1; i++) person[i] = new Person(false);
        person[249] = new Person(true);
        Controller controller = new Controller(person,new PersonView());
        controller.updateView(primaryStage,new Group(),person);
        
    }




    public static void main(String[] args) {
        launch(args);
    }
}
