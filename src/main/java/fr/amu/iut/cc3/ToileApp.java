package fr.amu.iut.cc3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ToileApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        VBox pointsBox = new VBox();
        pointsBox.setAlignment(Pos.CENTER_RIGHT);

        Label labelCpt1 = new Label("Compétence 1 - Réaliser ");
        Label labelCpt2 = new Label("Compétence 2 - Optimiser ");
        Label labelCpt3 = new Label("Compétence 3 - Administrer ");
        Label labelCpt4 = new Label("Compétence 4 - Gérer ");
        Label labelCpt5 = new Label("Compétence 5 - Conduire ");
        Label labelCpt6 = new Label("Compétence 6 - Collaborer ");

        TextField comp1 = new TextField();
        TextField comp2 = new TextField();
        TextField comp3 = new TextField();
        TextField comp4 = new TextField();
        TextField comp5 = new TextField();
        TextField comp6 = new TextField();

        Button bouton1 = new Button("Tracer");
        Button bouton2 = new Button("Vider");

        pointsBox.getChildren().addAll(labelCpt1,labelCpt2,labelCpt3,labelCpt4,labelCpt5,labelCpt6,comp1,comp2,comp3,comp4,comp5,comp6,bouton1,bouton2);

        Parent root = FXMLLoader.load(getClass().getResource("toile.fxml"));
        primaryStage.setResizable(false);
        primaryStage.setScene( new Scene(root) );
        primaryStage.show();
    }

}

