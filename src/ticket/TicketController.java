package ticket;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Marco
 */
public class TicketController
{
    private int currentTicket = 0;
    private TicketModel ticketModel;
    private TicketView ticketView;
    
    public TicketController(TicketModel ticketModel, TicketView ticketView)
    {
        this.ticketModel = ticketModel;
        this.ticketView = ticketView;
        attachHandlers();
    }
    
    public void attachHandlers()
    {
        ticketView.getBtn1().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                String license;
                String state;
                String permit;
                String model;
                String color;
                String reason;
                String date;
                String time;
                String location;
                String issued;
                
                license = ticketView.getLicenseTF().getText();
                state = ticketView.getStateTF().getText();
                permit = ticketView.getPermitTF().getText();
                model = ticketView.getModelTF().getText();
                color = ticketView.getColorTF().getText();
                reason = ticketView.getCurrentReason().getValue().toString();
                date = ticketView.getDateTF().getText();
                time = ticketView.getTimeTF().getText();
                location = ticketView.getLocationTF().getText();
                issued = ticketView.getIssuedTF().getText();
                
                ticketModel.createTicket(license, state, permit, model, color, reason, date, time, location, issued);

                ticketView.getFeedbackLabel().setText("Feedback information\nTicket has been created.");
                ticketView.getNumberTF().clear();
                ticketView.getLicenseTF().clear();
                ticketView.getStateTF().clear();
                ticketView.getPermitTF().clear();
                ticketView.getModelTF().clear();
                ticketView.getColorTF().clear();
                ticketView.getDateTF().clear();
                ticketView.getTimeTF().clear();
                ticketView.getLocationTF().clear();
                ticketView.getIssuedTF().clear();
            }
        } );
        ticketView.getBtn2().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                currentTicket--;
                if(currentTicket < 1)
                    currentTicket = 1;
                showInformation();
            }
        } );
        ticketView.getBtn3().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                currentTicket++;
                if(currentTicket > ticketModel.getTicketList().size())
                    currentTicket = ticketModel.getTicketList().size();
                showInformation();
            }
        } );
        ticketView.getBtn4().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                ticketModel.changePaidStatus(currentTicket);
                ticketView.getFeedbackLabel().setText("Feedback information\nCurrent ticket is now "+ticketModel.getCurrentPaidStatus(currentTicket));
            }
        } );
        ticketView.getBtn5().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                System.exit(0);
            }
        } );
        
    }
    public void showInformation()
    {
        ticketView.getNumberTF().setText(""+currentTicket);
        ticketView.getLicenseTF().setText(ticketModel.getCurrentTicketLicenseNumber(currentTicket));
        ticketView.getStateTF().setText(ticketModel.getCurrentState(currentTicket));
        ticketView.getPermitTF().setText(ticketModel.getCurrentPermitNumber(currentTicket));
        ticketView.getModelTF().setText(ticketModel.getCurrentModel(currentTicket));
        ticketView.getColorTF().setText(ticketModel.getCurrentColor(currentTicket));
        ticketView.setCurrentReason(ticketModel.getCurrentReason(currentTicket));
        ticketView.getDateTF().setText(ticketModel.getCurrentDate(currentTicket));
        ticketView.getTimeTF().setText(ticketModel.getCurrentTime(currentTicket));
        ticketView.getLocationTF().setText(ticketModel.getCurrentLocation(currentTicket));
        ticketView.getIssuedTF().setText(ticketModel.getCurrentIssuedBy(currentTicket));
        ticketView.getPaymentTA().setText(ticketModel.getPaymentInformation()); 
        ticketView.getFeedbackLabel().setText("Feedback information\nCurrent ticket is "+ticketModel.getCurrentPaidStatus(currentTicket));
    }
}