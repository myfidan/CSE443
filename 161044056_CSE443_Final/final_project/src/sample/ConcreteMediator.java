package sample;

import java.util.Random;

/**
 * Concrete mediator class used for comminicated between models
 */
public class ConcreteMediator implements Mediator{

    private Person firstPerson;
    private Person secondPerson;

    /**
     * 2 person comminicate algorithm
     * @param RValue static R value [0.5-1.0]
     */
    @Override
    public void PersonComminicate(double RValue) {
        if(!secondPerson.isInfected()){
            int x= secondPerson.getX_coord();
            int y= secondPerson.getY_coord();
            double dist = Math.pow((x-firstPerson.getX_coord()),2)+Math.pow(y-firstPerson.getY_coord(),2);
            if(dist<25){
                Random rand = new Random();
                int maxC = Math.max(firstPerson.getC(),secondPerson.getC());
                int minD = Math.min(firstPerson.getD(),secondPerson.getD());
                double probability = Math.min(RValue * (1+(maxC/10.0))*firstPerson.getM()*secondPerson.getM()*(1-(minD/10.0)),1);
                double randomNum = rand.nextDouble();
                if (probability >= randomNum){
                    secondPerson.setInfected(true);
                    Person.setInfectedCount(Person.getInfectedCount()+1);
                }
                firstPerson.setRotate();
                secondPerson.setRotate();
            }
        }
    }

    @Override
    public void setFirstPerson(Person firstPerson) {
        this.firstPerson = firstPerson;
    }

    @Override
    public void setSecondPerson(Person secondPerson) {
        this.secondPerson = secondPerson;
    }
}
