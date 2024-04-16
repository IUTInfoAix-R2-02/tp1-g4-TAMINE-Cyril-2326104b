package fr.amu.iut.exercice5;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Obstacle extends Rectangle {


    public Obstacle(){
        super(150,150,60,30);
        this.setFill(Color.RED);
    }
}
