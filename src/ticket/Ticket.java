package ticket;
/**
 *
 * @author Jahaira Alaniz
 */
public class Ticket 
{
    private int ticketNo;
    private String license;
    private String state;
    private String permit;
    private String model;
    private String color;
    private String reason;
    private String date;
    private String time;
    private String location;
    private String issued;
    private String paymentinfo;
    private Boolean paid;
    public Ticket()
    {
        
    }
    
    public Ticket(String license, String state, String permit, String model, String color, String reason, String date, String time, String location, String issued, Boolean paid) {
        this.license = license;
        this.state = state;
        this.permit = permit;
        this.model = model;
        this.color = color;
        this.reason = reason;
        this.date = date;
        this.time = time;
        this.location = location;
        this.issued = issued;
        this.paid = paid;
    }

    Ticket(String license, String state, String permit, String model, String color, String reason, String date, String time, String location, String sued) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    /**
     * @return the number
     */
    public int getTicketNo()
    {
        return ticketNo;
    }

    /**
     * @param ticket the number to set
     */
    public void setTicketNo(int ticketNo)
    {
        this.ticketNo = ticketNo;
    }

    /**
     * @return the license
     */
    public String getLicense() 
    {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) 
    {
        this.license = license;
    }

    /**
     * @return the state
     */
    public String getState()
    {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state)
    {
        this.state = state;
    }

    /**
     * @return the permit
     */
    public String getPermit()
    {
        return permit;
    }

    /**
     * @param permitnumber the permitnumber to set
     */
    public void setPermit(String permit) 
    {
        this.permit = permit;
    }

    /**
     * @return the model
     */
    public String getModel()
    {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) 
    {
        this.model = model;
    }

    /**
     * @return the color
     */
    public String getColor()
    {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color)
    {
        this.color = color;
    }

    /**
     * @return the reason
     */
    public String getReason()
    {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason)
    {
        this.reason = reason;
    }

    /**
     * @return the date
     */
    public String getDate()
    {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date)
    {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() 
    {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time)
    {
        this.time = time;
    }

    /**
     * @return the location
     */
    public String getLocation() 
    {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location)
    {
        this.location = location;
    }

    /**
     * @return the issued
     */
    public String getIssued()
    {
        return issued;
    }

    /**
     * @param issuedby the issuedby to set
     */
    public void setIssued(String issued) 
    {
        this.issued = issued;
    }

    /**
     * @return the paymentinfo
     */
    public String getPaymentinfo() 
    {
        return paymentinfo;
    }

    /**
     * @param paymentinfo the paymentinfo to set
     */
    public void setPaymentinfo(String paymentinfo)
    {
        this.paymentinfo = paymentinfo;
    }
    
    public void setPaid(Boolean paid)
    {
        this.paid = paid;
    }
    
    public Boolean getPaid()
    {
        return paid;
    }
}
