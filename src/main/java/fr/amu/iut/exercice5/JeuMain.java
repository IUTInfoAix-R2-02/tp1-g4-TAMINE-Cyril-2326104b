package fr.amu.iut.exercice5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class JeuMain extends Application {

    private Scene scene;
    private BorderPane root;

    private static ArrayList<Obstacle> listeObstacle;

    private long countdown = System.currentTimeMillis();

    @Override
    public void start(Stage primaryStage) {

        root = new BorderPane();


        //Acteurs du jeu
        Personnage pacman = new Pacman();
        Personnage fantome = new Fantome();
        Personnage fantome2 = new Fantome();
        Personnage fantome3 = new Fantome();
        Obstacle r1 = new Obstacle(280, 120, 40, 220);

        // on positionne le fantôme 20 positions vers la droite
        fantome.setLayoutX(20 * 10);
        fantome.setLayoutY(20 * 10);

        fantome2.setLayoutX(10 * 10);
        fantome3.setLayoutX(35 * 10);

        //panneau du jeu
        Pane jeu = new Pane();
        jeu.setPrefSize(840, 580);
        jeu.getChildren().add(pacman);
        jeu.getChildren().add(fantome);
        jeu.getChildren().add(fantome2);
        jeu.getChildren().add(fantome3);
        jeu.getChildren().add(r1);
        root.setCenter(jeu);
        //on construit une scene 640 * 480 pixels
        scene = new Scene(root);

        //Gestion du déplacement du personnage
        deplacer(pacman, fantome, fantome2, fantome3, r1);



        primaryStage.setTitle("... Pac Man ...");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Permet de gérer les événements de type clavier, pression des touches
     * pour le j1(up,down, right, left), pour le j2( z,q,s,d)
     *
     * @param j1
     * @param j2
     */
    private void deplacer(Personnage j1, Personnage j2, Personnage j3, Personnage j4,  Obstacle o1) {
        scene.setOnKeyPressed((KeyEvent event) -> {
            double j1x=j1.getLayoutX();
            double j1y=j1.getLayoutY();
            double j2x=j2.getLayoutX();
            double j2y=j2.getLayoutY();
            double j3x=j3.getLayoutX();
            double j3y=j3.getLayoutY();
            double j4x=j4.getLayoutX();
            double j4y=j4.getLayoutY();
            switch (event.getCode()) {
                case LEFT:
                    j1.deplacerAGauche();
                    break;
                case RIGHT:
                    j1.deplacerADroite(scene.getWidth());
                    break;
                case UP:
                    j1.deplacerEnHaut();
                    break;
                case DOWN:
                    j1.deplacerEnBas(scene.getHeight());
                    break;
                case Z:
                    j2.deplacerEnHaut();
                    break;
                case S :
                    j2.deplacerEnBas(scene.getHeight());
                    break;
                case Q:
                    j2.deplacerAGauche();
                    break;
                case D:
                    j2.deplacerADroite(scene.getWidth());
                    break;
                case O:
                    j3.deplacerEnHaut();
                    break;
                case K:
                    j3.deplacerAGauche();
                    break;
                case L:
                    j3.deplacerEnBas(scene.getHeight());
                    break;
                case M:
                    j3.deplacerADroite(scene.getWidth());
                    break;
                case NUMPAD5:
                    j4.deplacerEnHaut();
                    break;
                case NUMPAD2:
                    j4.deplacerEnBas(scene.getHeight());
                    break;
                case NUMPAD1:
                    j4.deplacerAGauche();
                    break;
                case NUMPAD3:
                    j4.deplacerADroite(scene.getWidth());



            }


            if(o1.murEnCollision(j1)){
                j1.setLayoutX(j1x);
                j1.setLayoutY(j1y);
            }

            else if(o1.murEnCollision(j2)){
                j2.setLayoutX(j2x);
                j1.setLayoutY(j2y);
            }

            else if(o1.murEnCollision(j3)){
                j3.setLayoutX(j3x);
                j3.setLayoutY(j3y);
            }

            else if(o1.murEnCollision(j4)){
                j4.setLayoutX(j4x);
                j4.setLayoutY(j4y);
            }

            if (j1.estEnCollision(j2)){
                System.err.println("Collision détectée !");
                System.exit(0);
            }

            else if (j1.estEnCollision(j3)){
                System.err.println("Collision détectée !");
                System.exit(0);
            }

            else if (j1.estEnCollision(j4)){
                System.err.println("Collision détectée !");
                System.exit(0);
            }



        });
    }


}
