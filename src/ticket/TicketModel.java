package ticket;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author jahaira
 */
public class TicketModel {
    
   private static final String USERNAME = "root";
   private static final String PASSWORD = "password";
   private static final String CONN_STRING = "jdbc:mysql://localhost:3306/ParkingCitation";
    
    private ArrayList<Ticket>ticketDB = new ArrayList<>();
    Ticket currentTicket = new Ticket();
    TicketView GUI = new TicketView();
    
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet Rs = null;
    
    public void setCurrentTicket(Ticket currentTicket)
    {
        this.currentTicket = currentTicket;
        Database();
        
    }
    
     public Ticket getCurrentTicket()
    {
        return currentTicket;
    }
     
      public ArrayList<Ticket> getCurrentTickets()
    {
        return getTicketDB();
    }

    /**
     * @return the ticketDB
     */
    public ArrayList<Ticket> getTicketDB() {
        return ticketDB;
    }
    
    public void Database(){
        
        
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Connected!");
            
            stmt = conn.createStatement();
            Rs = stmt.executeQuery("SELECT * FROM ParkingCitation.citation;");
            
            int ticketNo = currentTicket.getTicketNo();
            String license = currentTicket.getLicense();
            String state = currentTicket.getState();
            String permit = currentTicket.getPermit();
            String model = currentTicket.getModel();
            String color = currentTicket.getColor();
            String reason = currentTicket.getReason();
            String date = currentTicket.getDate();
            String time = currentTicket.getTime();
            String location = currentTicket.getLocation();
            String issued = currentTicket.getIssued();
            String insert = "INSERT INTO ParkingCitation.citation" + " (ticketNo,license, state, permit, model, color, reason, date, time, location, issued)" + " VALUES ("+ticketNo+",'"+license+"','"+state+"','"+permit+"','"+model+"','"+color+"','"+reason+"','"+date+"','"+time+"','"+location+"','"+issued+"')";
            
            while(Rs.next()){
                int ticketNoDB = Integer.parseInt(Rs.getString("ticketNo"));
                String licenseDB = Rs.getString("license");
                String stateDB = Rs.getString("state");
                String permitDB = Rs.getString("permit");
                String modelDB = Rs.getString("model");
                String colorDB = Rs.getString("color");
                String reasonDB = Rs.getString("reason");
                String dateDB = Rs.getString("date");
                String timeDB = Rs.getString("time");
                String locationDB = Rs.getString("location");
                String issuedDB = Rs.getString("issued");
                
                currentTicket = new Ticket(ticketNoDB,licenseDB, stateDB, permitDB, modelDB, colorDB, reasonDB, dateDB, timeDB, locationDB, issuedDB);
                
                ticketDB.add(currentTicket);
                
                        
            }
            
            
            stmt.executeUpdate(insert);   
           
            
        
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }

    /**
     * @param ticketDB the ticketDB to set
     */
    public void setTicketDB(ArrayList<Ticket> ticketDB) {
        this.ticketDB = ticketDB;
    }
    
   
    
}
