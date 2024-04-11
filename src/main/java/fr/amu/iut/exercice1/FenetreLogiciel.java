// Le package
package fr.amu.iut.exercice1;
// Les imports

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Création du conteneur principal
        VBox vbox = new VBox();
        HBox centre= new HBox();
        // Création des sous-conteneurs
        HBox barreMenu = new HBox();



        // Création du menu, et de la barre de menu
        Menu menu1= new Menu ("File");
        Menu menu2 = new Menu("Edit");
        Menu menu3= new Menu("Help");
        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);

        // Création des sous-menus
        MenuItem file1 = new MenuItem("New");
        MenuItem file2 = new MenuItem("Open");
        MenuItem file3 = new MenuItem("Save");
        MenuItem file4 = new MenuItem("Close");

        MenuItem edit1 = new MenuItem("Cut");
        MenuItem edit2 = new MenuItem("Copy");
        MenuItem edit3 = new MenuItem("Paste");

        // Ajout des items dans le menu
        menu1.getItems().add(file1);
        menu1.getItems().add(file2);
        menu1.getItems().add(file3);
        menu1.getItems().add(file4);

        menu2.getItems().add(edit1);
        menu2.getItems().add(edit2);
        menu2.getItems().add(edit3);

        // Séparateur
        Separator sepa = new Separator();


        Text text1 = new Text("Name");
        Text text2 = new Text("Email");
        Text text3 = new Text("Password");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        Button button1 = new Button("Submit");
        Button button2 = new Button("Cancel");


        GridPane gridPane = new GridPane();





        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(text3, 0,2);
        gridPane.add(textField3, 1,2);
        gridPane.add(button1, 0, 3);
        gridPane.add(button2, 1, 3);

        Separator sep = new Separator(Orientation.VERTICAL);

        VBox boutonCote = new VBox();
        boutonCote.setSpacing(8);
        VBox.setVgrow(boutonCote, Priority.ALWAYS);
        boutonCote.setAlignment(Pos.CENTER_LEFT);
        // Création des boutons
        Label boutonTexte = new Label("Boutons :");
        Button bouton1 = new Button("Bouton 1");
        Button bouton2= new Button ("Bouton 2");
        Button bouton3 = new Button ("Bouton 3");
        boutonCote.getChildren().addAll(boutonTexte, bouton1, bouton2, bouton3);
        // Ajout des boutons au conteneur
        barreMenu.getChildren().addAll(menuBar);

        VBox grillepain = new VBox();
        grillepain.setAlignment(Pos.CENTER);
        HBox.setHgrow(grillepain, Priority.ALWAYS);
        VBox.setVgrow(grillepain, Priority.ALWAYS);

        grillepain.getChildren().add(gridPane);

        HBox.setHgrow(centre, Priority.ALWAYS);
        VBox.setVgrow(centre, Priority.ALWAYS);
        centre.getChildren().addAll(boutonCote, sep, grillepain);

        Separator separ = new Separator();


        // Conteneur bas de page
        HBox basPage = new HBox();
        basPage.setAlignment(Pos.BOTTOM_CENTER);
        Label texte = new Label("Ceci est un label de bas de page");
        basPage.getChildren().add(texte);

        vbox.getChildren().addAll(
                menuBar,
                sepa,
                centre,
                separ,
                basPage
                
                
        );
        


                // Ajout du conteneur à la scene
        Scene scene = new Scene(vbox);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 650 );
        primaryStage.setHeight( 500 );

        primaryStage.setTitle("Premier exemple manipulant les conteneurs");

        // Affichage de la fenêtre
        primaryStage.show();
    }

        public static void main (String args[]){
            launch(args); // Lance le programme

        }
    }
