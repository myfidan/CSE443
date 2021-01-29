package sample;

import javafx.scene.Group;
import javafx.stage.Stage;

import java.util.Random;

/**
 * MVC Controller class
 */
public class Controller{

    private Person[] model;
    private PersonView view;
    //mediator used for comminitacion between models
    private Mediator mediator;
    private double R;
    private double Z;

    public Controller(Person[] model, PersonView view) {
        this.model = model;
        this.view = view;
        mediator = new ConcreteMediator();

        Random rand = new Random();
        R = 0.5+ (1.0-0.5)*rand.nextDouble();
        Z = 0.1 + (0.9-0.1)*rand.nextDouble();
    }

    /**
     * Calculate all person coordinates,routes,infect eq..
     * @param person
     */
    public void updateCoordinate(Person person)  {
        if(!person.isDead()){

            if(person.isInfected()){
                person.incLiveSecond();
                if(person.getLiveSecond() >= (Z*1000)){
                    person.setDead(true);
                    person.setY_coord(1000);
                    Person.setDeadCount(Person.getDeadCount()+1);
                    return;
                }
                mediator.setFirstPerson(person);
                for(int i=0; i< model.length; i++){
                    mediator.setSecondPerson(model[i]);
                    mediator.PersonComminicate(R);
                }
            }

            int rotate = person.getRotate();
            switch (rotate){
                case 0: //up
                    if (person.getY_coord() >= 5){
                        person.setY_coord(person.getY_coord()-5);
                    }
                    else{
                        person.setRotate();
                        updateCoordinate(person);
                    }
                    break;
                case 1: //down
                    if (person.getY_coord()<=590){
                        person.setY_coord(person.getY_coord()+5);
                    }
                    else{
                        person.setRotate();
                        updateCoordinate(person);
                    }
                    break;
                case 2: //left
                    if(person.getX_coord()>=5){
                        person.setX_coord(person.getX_coord()-5);
                    }
                    else{
                        person.setRotate();
                        updateCoordinate(person);
                    }
                    break;
                case 3: //right
                    if (person.getX_coord()<=990){
                        person.setX_coord(person.getX_coord()+5);
                    }
                    else{
                        person.setRotate();
                        updateCoordinate(person);
                    }
                    break;
                case 4: //up left
                    if(person.getX_coord() >= 5 && person.getY_coord()>=5){
                        person.setY_coord(person.getY_coord()-5);
                        person.setX_coord(person.getX_coord()-5);
                    }
                    else{
                        person.setRotate();
                        updateCoordinate(person);
                    }
                    break;
                case 5: //up right
                    if(person.getX_coord() <= 990 && person.getY_coord()>=5){
                        person.setY_coord(person.getY_coord()-5);
                        person.setX_coord(person.getX_coord()+5);
                    }
                    else{
                        person.setRotate();
                        updateCoordinate(person);
                    }
                    break;
                case 6: //down left
                    if(person.getX_coord() >= 5 && person.getY_coord() <= 590){
                        person.setY_coord(person.getY_coord()+5);
                        person.setX_coord(person.getX_coord()-5);
                    }
                    else{
                        person.setRotate();
                        updateCoordinate(person);
                    }
                    break;
                case 7: //down right
                    if(person.getX_coord() <= 990 && person.getY_coord() <= 590){
                        person.setY_coord(person.getY_coord()+5);
                        person.setX_coord(person.getX_coord()+5);
                    }
                    else{
                        person.setRotate();
                        updateCoordinate(person);
                    }
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        }
    }

    /**
     * Call MVC View function for showing javafx objects and canvas
     * @param primaryStage Javafx Stage
     * @param groupScene Javafx Group
     * @param person Models
     */
    public void updateView(Stage primaryStage, Group groupScene,Person[] person){

        view.viewPerson(primaryStage,groupScene,person,this);

    }

    public Person[] getModel() {
        return model;
    }

    public PersonView getView() {
        return view;
    }


}
