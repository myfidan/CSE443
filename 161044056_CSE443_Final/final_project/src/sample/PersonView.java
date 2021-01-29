package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.concurrent.TimeUnit;

/**
 * MVC View
 * Print person and canvas
 */
public class PersonView {

    /**
     * Draw canvas and individuals
     * @param primaryStage javafx stage
     * @param groupScene javafx group
     * @param person models
     * @param controller controller
     */
    public void viewPerson(Stage primaryStage, Group groupScene,Person[] person,Controller controller){
        Text text = new Text();
        text.setText("Infected count: "+Person.getInfectedCount());
        text.setX(50);
        text.setY(50);

        Text text2 = new Text();
        text2.setText("Healty count: "+(250-Person.getInfectedCount()));
        text2.setX(50);
        text2.setY(70);

        Text time = new Text();
        time.setX(50);
        time.setY(30);

        Text deadC = new Text();
        deadC.setX(50);
        deadC.setY(90);

        groupScene = new Group(text,text2,time,deadC);

        for (int i=0; i< person.length; i++) groupScene.getChildren().add(controller.getModel()[i].getRect());



        Thread thread1 = new Thread(()->{
            int t=0;
            while(true){
                time.setText("Time: "+t+" seconds");
                text.setText("Infected count: "+(Person.getInfectedCount()-Person.getDeadCount()));
                text2.setText("Healty count: "+(250-Person.getInfectedCount()));
                deadC.setText("Dead count: "+Person.getDeadCount());
                t++;
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.setDaemon(true);
        thread1.start();

        Scene scene;
        scene = new Scene(groupScene,1000,600);
        primaryStage.setTitle("Epidemic");
        primaryStage.setScene(scene);
        primaryStage.show();


        Thread thread = new Thread(()-> {
            try {
                loop(person,controller);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    /**
     * Main loop
     * @param person model
     * @param controller
     * @throws InterruptedException
     */
    private void loop(Person[] person,Controller controller) throws InterruptedException {

        for(int i=0; i<10000000; i++){
            for (Person value : person) {

                controller.updateCoordinate(value);
            }

            TimeUnit.MILLISECONDS.sleep(50);
        }

    }
}
