/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jahaira Alaniz
 */
public class TicketModel
{
    
    private Scanner read;
    private File fileName = new File("tickets.dat"); 
    private ArrayList<Ticket> ticketList = new ArrayList<>();
    Ticket currentTicket1 = new Ticket();
    TicketView ticketView = new TicketView();
    
    public void setCurrentTicket1(Ticket currentTicket1)
    {
        this.currentTicket1 = currentTicket1;
        WriteFile();
        ReadFile();
    }
    
     public Ticket getCurrentTicket1()
    {
        return currentTicket1;
    }
     
      public ArrayList<Ticket> getCurrentTickets()
    {
        return getTicketList();
    }

    /**
     * @return the ticketDB
     */
    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }

    /**
     * @param ticketDB the ticketDB to set
     */
    public void setTicketList(ArrayList<Ticket> ticketList) {
        this.ticketList = ticketList;
    }
    
    public void WriteFile()
    {
        
        
        try{
            
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter tix = new PrintWriter(bw);

            String license = currentTicket1.getLicense();
            String state = currentTicket1.getState();            
            String permit = currentTicket1.getPermit();
            String model = currentTicket1.getModel();
            String color = currentTicket1.getColor();
            String reason = currentTicket1.getReason();           
            String date = currentTicket1.getDate();
            String time = currentTicket1.getTime();            
            String location = currentTicket1.getLocation();
            String issued = currentTicket1.getIssued();
 

            
            
            tix.write(license + " " + state + " " + permit + " " + model + " " + color+ " " + reason + " " + date + " " + time +" "+ location + " " + issued +"\n");
            
           
        
        
        tix.close();
        
        
        
      }
      catch(Exception ex)
      {
          ticketView.Error();
      }
    
        
    }
    
    
    public void ReadFile(){
        try{
            BufferedWriter bw = null;
            bw = new BufferedWriter (new FileWriter("tickets.dat", true));
            Scanner input = new Scanner(fileName);
            
            
            
            while(input.hasNext()){
            String license = input.next();
            String state = input.next();
            String permit =  input.next();
            String model  = input.next();
            String color = input.next();
            String reason = input.next();
            String date = input.next();
            String time = input.next();
            String location = input.next();
            String issued = input.next();
            

               
              Ticket currentData = new Ticket(license,state,permit,model,color,reason, date,time,location,issued);
               ticketList.add(currentData);
               int x = ticketList.size();
               System.out.println(x);
            }
            input.close();
        }
        catch(IOException ex)
        {
            ticketView.Error();
        }
    
    
}

}
