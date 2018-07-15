package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {

    private void addButtons(GridPane gridPane, int row){
        for (int i=1; i <=3;i++){
            Button button = new Button("");
            button.setPrefSize(300, 300);
            gridPane.add(button, i - 1,row);
            button.setOnAction(this);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
      //  GridPane gridPane = new GridPane();

        // Nowa Metoda

        GridPane gridPane = new GridPane();
        addButtons(gridPane,0);
        addButtons(gridPane,1);
        addButtons(gridPane,2);

       /*Button button = new Button("0");
        button.setPrefHeight(300);
        button.setPrefWidth(300);
        gridPane.add(button,0,0);

        Button button1 = new Button("1");
        button1.setPrefHeight(300);
        button1.setPrefWidth(300);
        gridPane.add(button1,1,0);

        Button button2 = new Button("2");
        button2.setPrefHeight(300);
        button2.setPrefWidth(300);
        gridPane.add(button2,2,0);
         */

        primaryStage.setTitle("MajGame");
        primaryStage.setScene(new Scene(gridPane, 910, 910));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
        private int counter = 0;
    @Override
    public void handle(ActionEvent event) {
        Button button = (Button) event.getSource();
        if (counter % 2 == 0) {
            button.setText("X");
            button.setStyle("-fx-background-color: #00ff00; -fx-font-size: 19");
        }else {
            button.setText("Y");
            button.setStyle("-fx-font: 19 arial; -fx-base: #b6e7c9 ");
            //button.setStyle("-fx-background-color: #0e4091");
        }
        button.setDisable(true);
        counter++;
        System.out.println("Klik Klik na Guziczek");
    }
}
