package ticket;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Jahaira Alaniz
 */
public class TicketController
{
    private TicketModel ticketModel;
    private TicketView ticketView;
    int j = 0;
    
    
    
    public TicketController(TicketModel ticketModel, TicketView ticketView)
    {
        this.ticketModel = ticketModel;
        this.ticketView = ticketView;
        attachHandlers();
    }
    
    public void attachHandlers()
            
    {
              ticketView.getViewBtn().setOnAction(
              new EventHandler<ActionEvent>(){
              @Override
              public void handle(ActionEvent event)
              {
                    
                 ArrayList<Ticket> Tickets = ticketModel.getCurrentTickets();
		 	
		ticketView.updateTicketViewAll(Tickets);
                ticketModel.ReadFile();
               }
               }
             
      
      );  
        
        ticketView.getSubmitBtn().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                String license = ticketView.getLicenseTF().getText();
                String state = ticketView.getStateTF().getText();
                String permit = ticketView.getPermitTF().getText();
                String model = ticketView.getModelTF().getText();
                String color = ticketView.getColorTF().getText();
                String reason = ticketView.getReasonInfoTF().getText();
                String date = ticketView.getDateTF().getText();
                String time = ticketView.getTimeTF().getText();
                String location = ticketView.getLocationTF().getText();
                String issued = ticketView.getIssuedTF().getText();
                
                
                 if(ticketView.getBox1().isSelected())
                        reason = ticketView.getReason1();
                    if(ticketView.getBox2().isSelected())
                        reason = ticketView.getReason2();
                    if(ticketView.getBox3().isSelected())
                        reason = ticketView.getReason3();
                    if(ticketView.getBox4().isSelected())
                        reason = ticketView.getReason4();
                    if(ticketView.getBox5().isSelected())
                        reason = ticketView.getReason5();
                    if(ticketView.getBox6().isSelected())
                        reason = ticketView.getReason6();
                    if(ticketView.getBox7().isSelected())
                        reason = ticketView.getReason7();
                    if(ticketView.getBox8().isSelected())
                        reason = ticketView.getReason8();
                    if(ticketView.getBox9().isSelected())
                        reason = ticketView.getReasonInfoTF().getText();
                    
                
                
                Ticket currentTicket1 = new Ticket(license,state,permit,model,color,reason,date,time,location,issued);
                ticketModel.setCurrentTicket1(currentTicket1);
                ticketView.clearFields();

            }
            }
        
        );

        
        ticketView.getPreviousBtn().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                ArrayList<Ticket> currentData = ticketModel.getCurrentTickets();
                ticketView.updateViewNext(currentData);
                ticketModel.ReadFile();
            }
        } );
        
        
        ticketView.getNextBtn().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                ArrayList<Ticket> currentData = ticketModel.getCurrentTickets();
                ticketView.updateViewNext(currentData);
                ticketModel.ReadFile();
            }
        } );
        
        
         ticketView.getFeedbackSubmitBtn().setOnAction(
                new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event)
                {
                    ticketView.getFeedbackTA().clear();
                }
                }
      
      );
             
      
      ticketView.getClearViewBtn().setOnAction(
                new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event)
                {
                    ticketView.getViewTA().clear();
                }
                }
      
      );

        
        
        
        ticketView.getExit().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                System.exit(0);
            }
        } );
        
    }
}