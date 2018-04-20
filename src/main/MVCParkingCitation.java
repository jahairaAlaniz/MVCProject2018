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
        TicketView GUI = new TicketView();
        TicketController tc = new TicketController(ticketModel,GUI);
        
        Scene scene = new Scene(GUI, 1400, 800);
        
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
