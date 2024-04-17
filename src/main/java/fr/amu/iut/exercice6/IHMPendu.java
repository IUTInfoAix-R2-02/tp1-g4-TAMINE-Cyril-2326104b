package fr.amu.iut.exercice6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class IHMPendu extends Application {

    private Button boutonA = new Button("a");
    private Button boutonB = new Button("b");
    private Button boutonC = new Button("c");
    private Button boutonD = new Button("d");
    private Button boutonE= new Button("e");
    private Button boutonF = new Button("f");
    private Button boutonG = new Button("g");
    private Button boutonH = new Button("h");
    private Button boutonI = new Button("i");
    private Button boutonJ = new Button("j");
    private Button boutonK=new Button("k");
    private Button boutonL=new Button("l");
    private Button boutonM=new Button("m");
    private Button boutonN=new Button("n");
    private Button boutonO=new Button("o");
    private Button boutonP=new Button("p");
    private Button boutonQ=new Button("q");
    private Button boutonR=new Button("r");
    private Button boutonS=new Button("s");
    private Button boutonT=new Button("t");
    private Button boutonU=new Button("u");
    private Button boutonV=new Button("v");
    private Button boutonW=new Button("w");
    private Button boutonX=new Button("x");
    private Button boutonY=new Button("y");
    private Button boutonZ=new Button("z");
    private Button boutonRejoue=new Button("Rejouer");

    BackgroundFill background_fill = new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY);

    // create Background
    Background background = new Background(background_fill);

    private Label label;
    private TextField textField;

    public IHMPendu() {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox();
        Dico d1 = new Dico();
        String rand = d1.getMot();

        String cache="";
        for (int i=0; i< rand.length(); ++i){
            cache+= "*";
        }
        Label motRandom= new Label(cache);
        this.label=new Label("Nombre de vies : 6");

        this.textField= new TextField("Choisissez une lettre !");

        HBox hbox = new HBox();
        vbox.setBackground(background);
        hbox.setAlignment(Pos.CENTER);
        HBox hbox2 = new HBox();
        hbox2.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10,10,10,10));
        hbox.setSpacing(5);
        hbox2.setSpacing(5);
        HBox rejouer = new HBox();
        rejouer.getChildren().addAll(boutonRejoue);
        rejouer.setPadding(new Insets(10,10,10,10));
        rejouer.setAlignment(Pos.BOTTOM_CENTER);

        hbox.getChildren().addAll(boutonA, boutonB, boutonC, boutonD, boutonE,
                boutonF, boutonG, boutonH, boutonI, boutonJ, boutonK, boutonL, boutonM
                );

        hbox2.getChildren().addAll(boutonN, boutonO, boutonP, boutonQ, boutonR,
                boutonS, boutonT, boutonU, boutonV, boutonW,
                boutonX, boutonY, boutonZ);

        vbox.getChildren().addAll(label, motRandom, textField, hbox, hbox2, rejouer);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Jeu du pendu");
        primaryStage.setWidth(500);
        primaryStage.setHeight(550);

        // A completer

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
