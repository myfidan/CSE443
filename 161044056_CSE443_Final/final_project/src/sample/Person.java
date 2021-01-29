package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

/**
 * My MVC model
 * not infected person represent with 5x5 green rect
 * infected person represent with 5x5 red rect
 */
public class Person {

    private Rectangle rect;
    private int x_coord;
    private int y_coord;
    private int rotate;
    private boolean infected;
    private boolean dead = false;
    private double M; //Mask
    private int S; //Speed
    private int D; //Social Distance
    private int C; //Second they spend
    private int liveSecond = 0;

    private final double width = 5;
    private final double heigth = 5;

    private static int infectedCount = 1;
    private static int deadCount = 0;

    public Person(boolean inf){
        rect = new Rectangle();
        rect.setHeight(width);
        rect.setWidth(heigth);


        Random random = new Random();
        x_coord = random.nextInt(996);
        y_coord = random.nextInt(596);
        rect.setX(x_coord);
        rect.setY(y_coord);

        infected = inf;
        rotate = random.nextInt(8);
        if(infected){
            rect.setFill(Color.RED);
        }
        else{
            rect.setFill(Color.GREEN);
        }
        int check1 = random.nextInt(2);
        if(check1 == 1){
            M = 0.2;
        }else{
            M = 1.0;
        }
        S = random.nextInt(500)+1;
        D = random.nextInt(10);
        C = random.nextInt(5)+1;
    }

    public static int getInfectedCount() {
        return infectedCount;
    }

    public static void setInfectedCount(int infectedCount) {
        Person.infectedCount = infectedCount;
    }

    public static int getDeadCount() {
        return deadCount;
    }

    public static void setDeadCount(int deadCount) {
        Person.deadCount = deadCount;
    }


    public Rectangle getRect() {
        return rect;
    }

    public int getX_coord() {
        return x_coord;
    }

    public int getY_coord() {
        return y_coord;
    }

    public boolean isInfected() {
        return infected;
    }

    public void setRect(Rectangle rect) {
        this.rect = rect;
    }

    public void setX_coord(int x_coord) {
        this.x_coord = x_coord;
        this.rect.setX(this.x_coord);
    }

    public void setY_coord(int y_coord) {
        this.y_coord = y_coord;
        this.rect.setY(this.y_coord);
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
        rect.setFill(Color.RED);
    }

    public int getRotate() {
        return rotate;
    }

    public void setRotate() {
        Random random = new Random();
        rotate = random.nextInt(8);
    }

    public double getM() {
        return M;
    }

    public int getS() {
        return S;
    }

    public int getD() {
        return D;
    }

    public int getC() {
        return C;
    }

    public int getLiveSecond() {
        return liveSecond;
    }

    public void incLiveSecond() {
        this.liveSecond = ++liveSecond;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}
