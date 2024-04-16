package fr.amu.iut.exercice6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
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




    private Label label;
    private TextField textField;

    public IHMPendu() {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox();
        this.label=new Label("Nombre de vies : 6");

        this.textField= new TextField("Choisissez une lettre !");

        vbox.getChildren().addAll(label, textField);
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
