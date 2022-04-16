/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author varun
 */
public class Rail extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        StackPane scene0 = new StackPane();
        //setting image
        FileInputStream f= new FileInputStream("C:\\Users\\varun\\Documents\\fall sem\\java\\rail\\src\\rail\\tarin.jpg");
        
        
        Image i = new Image(f);
        ImageView iw = new ImageView(i);
        iw.setPreserveRatio(true);
        //scene 0
        Label username = new Label("Enter the UserName");
        Label pass = new Label("Enter the pass");
        
        TextField us1= new TextField();
        PasswordField pwd=new PasswordField ();
        Button SignIn = new Button("SignIn");
        us1.setStyle("-fx-background-color:Cyan; -fx-text-fill:Black; -fx-font-size:16");
        pwd.setStyle("-fx-background-color:Cyan; -fx-text-fill:Black; -fx-font-size:16");
        SignIn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        VBox scene00= new VBox();
        scene00.getChildren().addAll(username,us1,pass,pwd,SignIn);
        scene00.setAlignment(Pos.CENTER);
        scene0.getChildren().addAll(iw,scene00);
        Scene sc0 = new Scene(scene0);
       // scene0.setSpacing(10);
        scene0.setStyle("-fx-background-color: BEIGE;-fx-font-size:18pt;");
        primaryStage.setScene(sc0);
        primaryStage.setTitle("Login Page");
        primaryStage.setWidth(1000);
        primaryStage.setHeight(1000);
         us1.setMaxSize(300,100);
        pwd.setMaxSize(300,100);
        
        primaryStage.show();
       
        SignIn.setOnAction(new EventHandler<ActionEvent>()
        {

            @Override
            public void handle(ActionEvent event1) {
                
              //scene1
                    Label l1 = new Label("Enter Your Name:");
                    Label l2 = new Label("Enter Your Age:");
                    Label l3 = new Label("Enter the no of passengers :");
                    Label l4 = new Label("Select the Departure Date");
                    Label l5= new Label(" Enter the source");
                    Label l6 = new Label ("Enter the Destination");
                    Label l7 = new Label("Enter the class of Traveling");
                    Label l8 =  new Label("Enter all the gender traveling");
                    Button b = new Button("Book");
                    b.setMaxWidth(200);
                    TextField t1 = new TextField();//name
                    TextField t2 = new TextField();//age
                    ComboBox <String>tot = new ComboBox<String>();//pass
                    tot.getItems().addAll("1","2","3","4","5");
                    DatePicker d = new DatePicker();//date
                    TextField t3 = new TextField();//source
                    TextField t4 = new TextField();//destination
                    ToggleGroup  c= new ToggleGroup();//class
                    RadioButton r1 = new RadioButton("1-AC");
                    RadioButton r2 = new RadioButton("2-AC");
                    RadioButton r3 = new RadioButton("3-AC");
                    RadioButton r4 = new RadioButton("Sleeper");
                    t1.setMaxSize(300, 100);
                    t2.setMaxSize(300, 100);
                    t3.setMaxSize(300, 100);
                    t4.setMaxSize(300, 100);  
                    r1.setToggleGroup(c);
                    r2.setToggleGroup(c);
                    r3.setToggleGroup(c);
                    r4.setToggleGroup(c);
                    CheckBox gen1 = new CheckBox("Male");//gender
                    CheckBox gen2 = new CheckBox("Female");
                    CheckBox gen3 = new CheckBox("Others");
                    
                    //setting image
                    
                    VBox scene1 = new VBox();
                    scene1.setStyle("-fx-background-color:#5ac5e8 Blue;-fx-font-size:14pt;");
                    scene1.getChildren().addAll(l1,t1,l2,t2,l3,tot,l4,d,l5,t3,l6,t4,l7,r1,r2,r3,r4,l8,gen1,gen2,gen3,b);
                    scene1.setSpacing(10);
                    Scene sc1 = new Scene(scene1);
                    primaryStage.setScene(sc1);//stage
                    primaryStage.setTitle("Railway page");
                    primaryStage.setWidth(1000);
                    primaryStage.setHeight(1000);
                    primaryStage.show();
                    //scene 2 
                    TextField t11 = new TextField();
                    TextField t21 = new TextField();
                    TextField t31 = new TextField();
                    TextField t41 = new TextField();
                    TextField t51 = new TextField();
                    TextField t61= new TextField();
                    TextField t71 = new TextField();
                    TextField t81 = new TextField();
                    b.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

                    b.setOnAction((ActionEvent event) -> {
                        t11.setText("Name :"+t1.getText());
                        t21.setText("Age :"+t2.getText());
                        t31.setText("Passengers :" + tot.getValue());
                        t41.setText("Date :"+ d.getValue().toString());
                        t51.setText("From:"+t3.getText());
                        t61.setText("To : "+t4.getText());
                        if(r1.isSelected())
                        {
                            t71.setText("Class: "+r1.getText());
                        }
                        if(r2.isSelected())
                        {
                            t71.setText("Class :"+r2.getText());
                        }
                        if(r3.isSelected())
                        {
                            t71.setText("Class :"+r3.getText());
                        }
                        if(r4.isSelected())
                        {
                            t71.setText("Class :"+r4.getText());
                        }
                        String a = "";
                        if(gen1.isSelected())
                        {
                            a=a+gen1.getText();
                            a=a+" ";
                        }
                        if(gen2.isSelected())
                        {
                            a=a+gen2.getText();
                            a=a+" ";
                        }
                        if(gen3.isSelected())
                        {
                             a=a+gen3.getText();
                            a=a+" ,";
                        }
                        t81.setText("Total No  of Genders :"+a);
                        VBox scene2 = new VBox();
                        scene2.setSpacing(20);
                        scene2.getChildren().addAll(t11,t21,t31,t41,t51,t61,t71,t81);
                        Scene s2 = new Scene(scene2);
                        scene2.setStyle("-fx-background-color:#5a8ae8;-fx-font-size:18pt;");
                        primaryStage.setTitle("Details");
                        primaryStage.setScene(s2);
                        primaryStage.show();

                    });

                
            }
        
        
        
        
        }
        
        
        
        );
        

       
        
        
        
        
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
