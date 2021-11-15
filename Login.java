//This program demonstrate using of nested pane to set up the layout

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Login extends Application {
    public void start(Stage primaryStage) {
        //Create a border pane as the root
        BorderPane rootPane = new BorderPane();
        //centerPane is a GridPane, it contains 3 labels and 3 text fields
        GridPane centerPane = new GridPane();
        centerPane.setAlignment(Pos.CENTER);
        centerPane.setPadding(new Insets(20, 20, 20, 20));
        centerPane.setHgap(5);
        centerPane.setVgap(20);
//Create 3 labels
        //Create 3 text fields
        Label title = new Label("PATIENT PORTAL");
        title.setFont(new Font("Arial", 34));
        Label fName = new Label("                        First Name:");
        fName.setFont(new Font("Arial", 16));
        Label lName = new Label("                        Last Name :");
        lName.setFont(new Font("Arial", 16));
        Label DOB = new Label("                             DOB    :");
        DOB.setFont(new Font("Arial", 16));
        TextField fNameField = new TextField();
        TextField lNameField = new TextField();
        TextField DOBField = new TextField();
        Button button1 = new Button("Login");
        button1.setFont(new Font("Arial", 16));
        Button button2 = new Button("Create New User");
        button2.setFont(new Font("Arial", 16));
        //add the 3 labels and 3 text fields accordingly
        centerPane.add(title, 6, 0);
        centerPane.add(fName, 6, 1);
        centerPane.add(fNameField, 6, 2);
        centerPane.add(lName, 6, 3);
        centerPane.add(lNameField, 6, 4);
        centerPane.add(DOB, 6, 5);
        centerPane.add(DOBField, 6, 6);
        centerPane.add(button1, 6, 7);
        centerPane.add(button2, 6, 8);
        //eastPane is a vertical TilePane, it contains 4 buttons
        TilePane eastPane = new TilePane(Orientation.VERTICAL);
        eastPane.setAlignment(Pos.CENTER);
        eastPane.setPadding(new Insets(10, 10, 10, 10));
        //create four buttons



//To enable the buttons to be resized to the size of the tile,

//set the horizontal gap between above 3 buttons
        //Place centerPane, eastPane and southPane inside the rootPane
        rootPane.setCenter(centerPane);
        rootPane.setRight(eastPane);
        // Create a scene and place it in the stage
        Scene scene = new Scene(rootPane, 200, 100);
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}