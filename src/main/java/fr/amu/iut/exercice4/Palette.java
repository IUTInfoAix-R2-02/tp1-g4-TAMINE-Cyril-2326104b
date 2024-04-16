package fr.amu.iut.exercice4;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Label label;
    private Pane panneau;
    private HBox bas;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();

        VBox vbox = new VBox();

        this.root = new BorderPane();
        root.setPrefSize(400,200);


        HBox centre = new HBox();
        this.label = new Label();
        this.label.setMaxWidth(180.0d);
        this.label.setFont( Font.font("Courier", FontWeight.NORMAL, 12) );

        centre.setAlignment(Pos.CENTER);
        centre.getChildren().add(this.label);


        this.panneau = new Pane();




        this.bas = new HBox();
        this.vert= new Button("Vert");
        this.rouge= new Button("Rouge");
        this.bleu = new Button("Bleu");
        this.bas.setSpacing(5);
        bas.setMargin(vert, new Insets(10,10,10,10));
        bas.setMargin(rouge, new Insets(10,10,10,10));
        bas.setMargin(bleu, new Insets(10,10,10,10));

        this.vert.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> handleVertClick(actionEvent));
        this.bleu.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> handleBleuClick(actionEvent));
        this.rouge.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> handleRougeClick(actionEvent));
        this.bas.getChildren().addAll(vert, rouge, bleu);
        this.bas.setAlignment(Pos.CENTER);




        this.root.setTop(centre);
        this.root.setCenter(this.panneau);
        this.root.setBottom(this.bas);

        vbox.getChildren().addAll(root);
        vbox.setAlignment(Pos.CENTER);



        Scene scene = new Scene(vbox);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth(400);
        primaryStage.setHeight( 200 );
        ;

        // Affichage de la fenêtre
        primaryStage.show();
    }

    public void handleVertClick(Event event){
        panneau.setStyle("-fx-background-color: green");
        ++nbVert;
        label.setText("Vert choisi " + nbVert + " fois" );
    }

    public void handleRougeClick(Event event){
        panneau.setStyle("-fx-background-color: red");
        ++nbRouge;
        label.setText("Rouge choisi " + nbRouge + " fois" );
    }

    public void handleBleuClick(MouseEvent event){
        panneau.setStyle("-fx-background-color: blue");
        ++nbBleu;
        label.setText("Bleu choisi " + nbBleu + " fois" );
    }
}

