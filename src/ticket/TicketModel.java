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
    private ArrayList<Ticket> ticketList = new ArrayList<>();
    
    private Scanner read;
    private File fileName = new File("tickets.dat");
    private ArrayList<Ticket>ticketDB = new ArrayList<>();
    Ticket currentTicket = new Ticket();
    TicketView GUI = new TicketView();
    
    public void setCurrentTicket(Ticket currentTicket)
    {
        this.currentTicket = currentTicket;
        WriteFile();
        ReadFile();
    }
    
     public Ticket getCurrentTicket()
    {
        return currentTicket;
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
    public void setTicketDB(ArrayList<Ticket> ticketDB) {
        this.ticketList = ticketList;
    }
    
    public void WriteFile()
    {
        
        
        try{
            
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter tix = new PrintWriter(bw);
            
        
            
            
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

            
            
            tix.write(license + " " + state + " " + permit + " " + model + " " + color+ " " + reason + " " + date + " " + time +" "+ location + " " + issued +"\n");
            
           
        
        
        tix.close();
        
        
        
      }
      catch(Exception ex)
      {
          GUI.Error();
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
            GUI.Error();
        }
    
    
}

    
    
    private static int ticketnumber = 1;
    public void createTicket(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j)
    {
        Ticket t = new Ticket();
        t.setTicketNo(ticketnumber);
        ticketnumber++;
        //license number
        t.setLicense(a);
        //state
        t.setState(b);
        //permit number
        t.setPermit(c);
        //vehicle model
        t.setModel(d);
        //color
        t.setColor(e);
        //reason
        t.setReason(f);
        //date
        t.setDate(g);
        //time
        t.setTime(h);
        //location
        t.setLocation(i);
        //issued by
        t.setIssued(j);
        t.setPaymentinfo("PAYMENTS\n"
                + "Payments can be made at the following office:\n"
                + "Business Office, Tandy 107\n"
                + "Monday thru Friday 8:00 am - 5:00 pm\n"
                + "$25 per citation, other fees may apply\n"
                + "$100 for boot removal\n"
                + "Payment can be mailed to the following address:\n"
                + "TSC C/O Finance Dept\n"
                + "Attn: Parking Enforcement\n"
                + "80 Fort Brown\n"
                + "Brownsville, TX 78520\n"
                + "DO NOT MAIL IN CASH!\n"
                + "For More Information on parking citations please visit:\n"
                + "www.tsc.edu/parking\n");
        t.setPaid(false);

        ticketList.add(t);
    }
    
    public int getCurrentTicketNumber(int currentTicket)
    {
        for(Ticket ticket : ticketList)
        {
            if(ticket.getTicketNo() == currentTicket)
            {
                return ticket.getTicketNo();
            }
        }
        return 0;
    }
    
    public String getCurrentTicketLicenseNumber(int currentTicket)
    {
        for(Ticket ticket : ticketList)
        {
            if(ticket.getTicketNo() == currentTicket)
            {
                if(ticket.getLicense().compareTo("")!=0)
                    return ticket.getLicense();
                else
                    return "---";
            }
        }
        return "";
    }
    
    public String getCurrentState(int currentTicket)
    {
        for(Ticket ticket : ticketList)
        {
            if(ticket.getTicketNo() == currentTicket)
            {
                if(ticket.getState().compareTo("")!=0)
                    return ticket.getState();
                else
                    return "---";
            }
        }
        return "";
    }   
    
    public String getCurrentPermit(int currentTicket)
    {
        for(Ticket ticket : ticketList)
        {
            if(ticket.getTicketNo() == currentTicket)
            {
                if(ticket.getPermit().compareTo("") != 0)
                    return ticket.getPermit();
                else
                    return "---";
            }
        }
        return "";
    }   
    
    public String getCurrentModel(int currentTicket)
    {
        for(Ticket ticket : ticketList)
        {
            if(ticket.getTicketNo() == currentTicket)
            {
                if(ticket.getModel().compareTo("") != 0)
                    return ticket.getModel();
                else
                    return "---";
            }
        }
        return "";
    }
    
    public String getCurrentColor(int currentTicket)
    {
        for(Ticket ticket : ticketList)
        {
            if(ticket.getTicketNo() == currentTicket)
            {
                if(ticket.getColor().compareTo("")!=0)
                    return ticket.getColor();
                else
                    return "---";
            }
        }
        return "";
    }   
    public String getCurrentReason(int currentTicket)
    {
        for(Ticket ticket : ticketList)
        {
            if(ticket.getTicketNo() == currentTicket)
            {
                if(ticket.getReason().compareTo("")!=0)
                    return ticket.getReason();
                else
                    return "---";
            }
        }
        return "";
    }   
    public String getCurrentDate(int currentTicket)
    {
        for(Ticket ticket : ticketList)
        {
            if(ticket.getTicketNo() == currentTicket)
            {
                if(ticket.getDate().compareTo("")!=0)
                    return ticket.getDate();
                else
                    return "---";
            }
        }
        return "";
    }   
    public String getCurrentTime(int currentTicket)
    {
        for(Ticket ticket : ticketList)
        {
            if(ticket.getTicketNo() == currentTicket)
            {
                if(ticket.getTime().compareTo("")!=0)
                    return ticket.getTime();
                else
                    return "---";
            }
        }
        return "";
    }   
    public String getCurrentLocation(int currentTicket)
    {
        for(Ticket ticket : ticketList)
        {
            if(ticket.getTicketNo() == currentTicket)
            {
                if(ticket.getLocation().compareTo("")!=0)
                    return ticket.getLocation();
                else
                    return "---";
            }
        }
        return "";
    }   
    public String getCurrentIssued(int currentTicket)
    {
        for(Ticket ticket : ticketList)
        {
            if(ticket.getTicketNo() == currentTicket)
            {
                if(ticket.getIssued().compareTo("")!=0)
                    return ticket.getIssued();
                else
                    return "---";
            }
        }
        return "";
    }   
    public String getPaymentInformation()
    {
        return "PAYMENTS\n"
                + "Payments can be made at the following office:\n"
                + "Business Office, Tandy 107\n"
                + "Monday thru Friday 8:00 am - 5:00 pm\n"
                + "$25 per citation, other fees may apply\n"
                + "$100 for boot removal\n"
                + "Payment can be mailed to the following address:\n"
                + "TSC C/O Finance Dept\n"
                + "Attn: Parking Enforcement\n"
                + "80 Fort Brown\n"
                + "Brownsville, TX 78520\n"
                + "DO NOT MAIL IN CASH!\n"
                + "For More Information on parking citations please visit:\n"
                + "www.tsc.edu/parking\n";
    }
    
    public String getCurrentPaidStatus(int currentTicket)
    {
        for(Ticket ticket : ticketList)
        {
            if(ticket.getTicketNo() == currentTicket)
            {
                if(ticket.getPaid())
                    return "paid";
                else
                    return "unpaid";
            }
        }
        return "";
    }
    public void changePaidStatus(int currentTicket)
    {
        for (int i = 0; i < ticketList.size(); i++) 
        {
            if(ticketList.get(i).getTicketNo() == currentTicket)
            {
                if(ticketList.get(i).getPaid())
                    ticketList.get(i).setPaid(false);
                else
                    ticketList.get(i).setPaid(true);
            }

        }
    }
   
}
