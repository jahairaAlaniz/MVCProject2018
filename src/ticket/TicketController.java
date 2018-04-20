/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author jahaira
 */
public class TicketController {
    TicketModel ticketModel;
    TicketView GUI;
    int j = 0;
    
    public TicketController(TicketModel ticketModel, TicketView GUI) {
        this.ticketModel = ticketModel;
        this.GUI = GUI;
        attachHandlers();
    }
   
    
    /*
    *  all Button eventhandler
    */
    public void attachHandlers()
    {
        
       /********************************
        *   View button eventhandler   *
        *******************************/
      GUI.getViewBtn().setOnAction(
                new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event)
                {
                    ticketModel.Database();
                    ArrayList<Ticket> Tickets = ticketModel.getCurrentTickets();
		
                    GUI.updateTicketViewAll(Tickets);
                    GUI.clearFields();
                }
                }
             
      
      );
      
      
      /*************************************
      *   form submit Button eventhandler  *
      *************************************/
      GUI.getSubmitBtn().setOnAction(
                new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event)
                {
                    //get fields
                    int ticketNo = Integer.parseInt(GUI.getTicketNoTF().getText());
                    String license = GUI.getLicenseTF().getText();
                    String state = GUI.getStateTF().getText();
                    String permit = GUI.getPermitTF().getText();
                    String model = GUI.getModelTF().getText();
                    String color = GUI.getColorTF().getText();
                    String reason = GUI.getReasonInfoTF().getText();
                    String date = GUI.getDateTF().getText();
                    String time = GUI.getTimeTF().getText();
                    String location = GUI.getLocationTF().getText();
                    String issued = GUI.getIssuedTF().getText();
                    

                    
                    
                    if(GUI.getBox1().isSelected())
                        reason = GUI.getReason1();
                    if(GUI.getBox2().isSelected())
                        reason = GUI.getReason2();
                    if(GUI.getBox3().isSelected())
                        reason = GUI.getReason3();
                    if(GUI.getBox4().isSelected())
                        reason = GUI.getReason4();
                    if(GUI.getBox5().isSelected())
                        reason = GUI.getReason5();
                    if(GUI.getBox6().isSelected())
                        reason = GUI.getReason6();
                    if(GUI.getBox7().isSelected())
                        reason = GUI.getReason7();
                    if(GUI.getBox8().isSelected())
                        reason = GUI.getReason8();
                    if(GUI.getBox9().isSelected())
                        reason = GUI.getReasonInfoTF().getText();
                    
                    
                    
                    Ticket currentTicket = new Ticket(ticketNo, license, state, permit, model, color, reason, date, time, location, issued);
                    ticketModel.setCurrentTicket(currentTicket);
                    GUI.clearFields();
                }
                }
      
      );
      
      GUI.getFeedbackSubmitBtn().setOnAction(
                new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event)
                {
                    GUI.getFeedbackTA().clear();
                }
                }
      
      );
      /******************************************
      *   feedback submit button eventhandler   *
      ******************************************/        
      GUI.getClearViewBtn().setOnAction(
                new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event)
                {
                    GUI.getViewTA().clear();
                }
                }
      
      );
      
       
      GUI.getNextBtn().setOnAction(
                new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event)
                {
                    ArrayList<Ticket> currentData = ticketModel.getCurrentTickets();
                    GUI.updateViewNext(currentData);
                
                }
                }
      
      );
      
      GUI.getPreviousBtn().setOnAction(
                new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event)
                {
                    ArrayList<Ticket> currentData = ticketModel.getCurrentTickets();
                    GUI.updateViewPrevious(currentData);
                
                }
                }
      
      );
      
    }
    
    
}
