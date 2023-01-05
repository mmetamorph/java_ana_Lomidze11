package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.time.LocalDate;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.time.LocalDate;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Label city1=new Label("გაფრენის ქალაქი");
        Label city2 = new Label("ჩაფრენის ქალაქი");
        Label amount = new Label("ადგილების რაოდენობა");




        TextField tf1=new TextField();
        TextField tf2=new TextField();
        TextField tf3=new TextField();
        Button b = new Button("არჩევა");

        Text text = new Text("ფასი");
        Text text1 = new Text("$");



        GridPane root = new GridPane();
        root.addRow(0, city1, tf1);
        root.addRow(1, city2, tf2);
        root.addRow(2, amount, tf3);
        root.getChildren().add(text);
        root.getChildren().add(text1);





        city1.setTranslateX(50);
        city1.setTranslateY(50);

        city2.setTranslateX(50);
        city2.setTranslateY(50);

        amount.setTranslateX(50);
        amount.setTranslateY(50);

        tf1.setTranslateX(50);
        tf1.setTranslateY(50);

        tf2.setTranslateX(50);
        tf2.setTranslateY(50);

        tf3.setTranslateX(50);
        tf3.setTranslateY(50);

        b.setTranslateX(170);
        b.setTranslateY(70);


        text.setTranslateX(180);
        text.setTranslateY(190);

        text1.setTranslateX(220);
        text1.setTranslateY(190);


        b.setOnAction(actionEvent -> {
            amount.setText(String.valueOf(Integer.parseInt(tf3.getText()) * 89.5));
        });


        b.setOnAction(event -> root.getChildren().setAll(text1));



        root.addRow(3, b);
        Scene scene=new Scene(root,600,400, Color.AQUAMARINE);

        primaryStage.setScene(scene);

        primaryStage.show();






}


}