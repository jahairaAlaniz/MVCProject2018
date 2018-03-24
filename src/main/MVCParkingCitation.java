/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import ticket.TicketController;
import ticket.TicketModel;
import ticket.TicketView;

/**
 *
 * @author Jahaira Alaniz
 */
public class MVCParkingCitation extends Application
{
    
    @Override
    public void start(Stage primaryStage)
    {
        TicketModel ticketModel = new TicketModel();
        TicketView ticketView = new TicketView();
        TicketController tc = new TicketController(ticketModel,ticketView);
        StackPane root = new StackPane();
        root.getChildren().add(ticketView);
        
        Scene scene = new Scene(root, 800, 800);
        
        primaryStage.setTitle("Parking Citation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
