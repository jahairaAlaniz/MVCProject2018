package ticket;

import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
/**
 *
 * @author Jahaira Alaniz
 */
public class TicketView extends BorderPane
{    
    
    private int currentTicket = 0;
    
    private BorderPane root = new BorderPane();
    private GridPane gridpane = new GridPane();
    //Creating the entry or display grid pane elements
    
    private Label titleLabel = new Label("Parking Citation");


    private Label ticketNoLabel = new Label("Citation No.:");
    private TextField ticketNoTF = new TextField();
            
    private Label licenseLabel = new Label("License Plate No.:");
    private TextField licenseTF = new TextField();
    
    private Label stateLabel = new Label("State:");
    private TextField stateTF = new TextField();
    
    private Label permitLabel = new Label("Permit No.:");
    private TextField permitTF = new TextField();
    
    private Label modelLabel = new Label("Vehicle Model:");
    private TextField modelTF = new TextField();
    
    private Label colorLabel = new Label("Color:");
    private TextField colorTF = new TextField();
    
    private Label reasonLabel = new Label("Reason:");
    private TextField reasonInfoTF = new TextField();
    
    private Label dateLabel = new Label("Date:");
    private TextField dateTF = new TextField();
    
    private Label timeLabel = new Label("Time:");
    private TextField timeTF = new TextField();
    
    private Label locationLabel = new Label("Location:");
    private TextField locationTF = new TextField();
    
    private Label issuedLabel = new Label("Issued by:");
    private TextField issuedTF = new TextField();

    
    //feedback
    private Label feedbackLabel = new Label("Feedback");
    private TextArea feedbackTA = new TextArea();
    
    private TextArea viewTA = new TextArea();
   
    
    //creating the vertical boxes for the gridpane
    
    
    //payment info
    private Label paymentInfoLabel = new Label("Payment Information");
    private Label paymentTextLabel = new Label("Payments can be made at the following office\n"
                             +"Business Office Tandy 107\n"
                             +"Monday thru Friday: 8:00 am - 5:00 pm\n"
                             +"$25 per citation, other fees may apply\n"
                             +"$100 for boot removal\n"
                                + "\n"
                             +"Payments can be mailed to the following address:\n"
                            + "TSC\n"
                            + "C/O Finance Dept\n"
                            + "Attn: Parking Enforcement\n"
                            + "80 Fort Brown\n"
                            + "Brownsville, TX 78520\n"
                            + "\n"
                            + "DO NOT MAIL CASH!\n"
                            + "For more Information on parking citations please visit:\n"
                            + "www.tsc.edu/parking");
    //reason checklist
    private String reason1 = "Vehicle has no Permit";
    private String reason2 = "Parked in no Parking Area/Space";
    private String reason3 = "Parked in Fire Lane";
    private String reason4 = "Parked in Handicap Space";
    private String reason5 = "Parked Reserved or Assigned Space";
    private String reason6 = "Blocking Driveway, Access, or Other Vehicle";
    private String reason7 = "Parked in 2 spaces";
    private String reason8 = "Expired Meter";
    private String reason9 = "Other:";
    
    private CheckBox box1 = new CheckBox(reason1);
    private CheckBox box2 = new CheckBox(reason2);
    private CheckBox box3 = new CheckBox(reason3);
    private CheckBox box4 = new CheckBox(reason4);
    private CheckBox box5 = new CheckBox(reason5);
    private CheckBox box6 = new CheckBox(reason6);
    private CheckBox box7 = new CheckBox(reason7);
    private CheckBox box8 = new CheckBox(reason8);
    private CheckBox box9 = new CheckBox(reason9);
    
    //buttons  
    private Button submitBtn = new Button("Submit");
    private Button previousBtn = new Button("<<");
    private Button nextBtn = new Button(">>");
    private Button viewBtn = new Button("View All");
    private Button feedbackSubmitBtn = new Button("Submit");
    private Button clearViewBtn = new Button("Clear");    
    private Button exit = new Button("Exit");
    
    private HBox arrowBtnHbox = new HBox(previousBtn, nextBtn);
    private HBox reasonInfoHbox = new HBox(box9, reasonInfoTF);    
    
    //all VBox
    private VBox ticketNoVBox = new VBox(getTicketNoLabel(), getTicketNoTF());
    private VBox licenseVBox = new VBox(licenseLabel, licenseTF);
    private VBox stateVBox = new VBox(stateLabel, stateTF);
    private VBox permitVBox = new VBox(permitLabel, permitTF);
    private VBox modelVBox = new VBox(modelLabel, modelTF);
    private VBox colorVBox = new VBox(colorLabel, colorTF);
    private VBox dateVBox = new VBox(dateLabel, dateTF);
    private VBox timeVBox = new VBox(timeLabel, timeTF);
    private VBox locationVBox = new VBox(locationLabel, locationTF);
    private VBox issuedVBox = new VBox(issuedLabel, issuedTF);
    private VBox checkboxVbox = new VBox(reasonLabel,box1, box2, box3, box4, box5, box6, box7, box8, reasonInfoHbox);
    private VBox viewBtnVbox = new VBox(viewBtn, arrowBtnHbox, clearViewBtn);
 
    private VBox feedbackVBox = new VBox(getFeedbackLabel(), getFeedbackTA(), feedbackSubmitBtn); 
    private VBox paymentInfoVbox = new VBox(paymentInfoLabel, paymentTextLabel);
    
    //all Hbox
    private HBox titleHBox = new HBox( getTitleLabel());
    private HBox viewVbox = new HBox(viewBtnVbox, viewTA);
    
    
    
    public TicketView()
    {
    //modifications for setCenter
        gridpane.setVgap(15);
        gridpane.setHgap(15);
        gridpane.setAlignment(Pos.CENTER);
        
        //fonts and size
        ticketNoLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        licenseLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        stateLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        permitLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        modelLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        colorLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        reasonLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        dateLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        timeLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        locationLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        issuedLabel.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 16));
        
        box1.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box2.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box3.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box4.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box5.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box6.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box7.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box8.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));
        box9.setFont(Font.font("Times New Roman", FontWeight.LIGHT, 15));

        
        /*************************
        *  gridpane positioning  *
        *************************/
        
        gridpane.addRow(0,licenseVBox);
        gridpane.addRow(0, stateVBox);
        gridpane.addRow(0, permitVBox);
        gridpane.addRow(1, modelVBox);
        gridpane.addRow(1, colorVBox);
        gridpane.addRow(2, checkboxVbox);
        gridpane.addRow(3, dateVBox);
        gridpane.addRow(3, timeVBox);
        gridpane.addRow(4, locationVBox);
        gridpane.addRow(4, issuedVBox);
        gridpane.addRow(4,ticketNoVBox);
        gridpane.addRow(5, submitBtn);
        

        
        
        

        //setLeft of borderpane
        viewTA.setEditable(false);
        viewTA.setPrefHeight(300);
        viewTA.setPrefWidth(400);
        
        
        //modification setTop of borderpane
       
        titleHBox.setAlignment(Pos.CENTER); //alignment to the middle of the top
        
        titleLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 40)); //font and size
       
       //modification of setRight of the borderpane.
       paymentInfoLabel.setFont(Font.font("Times New Roman", FontWeight.MEDIUM, 20));
       paymentTextLabel.setFont(Font.font("Times New Roman", FontWeight.MEDIUM, 16));
       
        /*
        Positions on the borderpane
        */
     
        this.setTop(titleHBox);
        this.setBottom(feedbackVBox);
        this.setLeft(viewVbox);
        this.setCenter(gridpane);
        this.setRight(paymentInfoVbox);
        
    }
    
    public void updateViewNext(ArrayList<Ticket> currentData){
        int ticketNo =0;
        String license = "";
        String state = "";
        String permit = "";
        String model  = "";
        String color = "";
        String reason = "";
        String date = "";
        String time = "";
        String location = "";
        String issued = "";
        String currentTicket1 = "";
       
       Ticket current = (Ticket) currentData.get(getCurrentTicket());
       ticketNo = current.getTicketNo();
       license = current.getLicense();
       state = current.getState();
       permit =  current.getPermit();
       model  = current.getModel();
       color = current.getColor();
       reason = current.getDate();
       date = current.getReason();
       time = current.getTime();
       location = current.getLocation();
       issued = current.getIssued();
       currentTicket1 += ticketNo +"\n"+license + "\n" + state + "\n" + permit + "\n" + model + "\n" + color + "\n" + reason + "\n" + date + "\n" + time + "\n" + location + "\n" + issued + "\n\n";
       
        setCurrentTicket(getCurrentTicket() + 1);
       
       
       
       
        viewTA.setText(currentTicket1);
    }
    
    
     public void updateViewPrevious(ArrayList<Ticket> currentData){
        int ticketNo = 0;
        String license = "";
        String state = "";
        String permit = "";
        String model  = "";
        String color = "";
        String reason = "";
        String date = "";
        String time = "";
        String location = "";
        String issued = "";
        String currentTicket1 = "";
       
       Ticket current = (Ticket) currentData.get(getCurrentTicket());
       ticketNo = current.getTicketNo();
       license = current.getLicense();
       state = current.getState();
       permit =  current.getPermit();
       model  = current.getModel();
       color = current.getColor();
       date = current.getDate();
       reason = current.getReason();
       time = current.getTime();
       location = current.getLocation();
       issued = current.getIssued();
       currentTicket1 += ticketNo + "\n"+license + "\n" + state + "\n" + permit + "\n" + model + "\n" + color + "\n" + reason + "\n" + date + "\n" + time + "\n" + location + "\n" + issued + "\n\n";
       
       
        setCurrentTicket(getCurrentTicket() - 1);
       
       
       
       
       
       viewTA.setText(currentTicket1);
        }
    
    	
    
    /*****************************
     * updateTicketGUI function  *
     ****************************/
    
    
  



    
    //update ticket
    
        
    
     public void updateTicketViewAll(ArrayList<Ticket> allTicket){
        
        int ticketNo = 0;
        String license = "";
        String state = "";
        String permit = "";
        String model  = "";
        String color = "";
        String reason = "";
        String date = "";
        String time = "";
        String location = "";
        String issued = "";
        String allticket = "";
            
        for (int i = 0; i < allTicket.size(); i++)
        {
           Ticket current = (Ticket) allTicket.get(i);
            
            ticketNo = current.getTicketNo();
            license = current.getLicense();
            state = current.getState();
            permit =  current.getPermit();
            model  = current.getModel();
            color = current.getColor();
            date = current.getDate();
            reason = current.getReason();
            time = current.getTime();
            location = current.getLocation();
            issued = current.getIssued();
            
            //show everything in the DataBase
            allticket += ticketNo + "\n" +license + "\n" + state + "\n" + permit + "\n" + model + "\n" + color + "\n" + reason + "\n" + date + "\n" + time + "\n" + location + "\n" + issued + "\n\n"; 
        }
        
        
        gridpane.getChildren().clear();
        gridpane.addRow(6,ticketNoVBox);
        gridpane.addRow(0, licenseVBox); 
        gridpane.addRow(0, stateVBox);
        gridpane.addRow(0, permitVBox);
        gridpane.addRow(1, modelVBox);
        gridpane.addRow(1, colorVBox);
        gridpane.addRow(2, reasonLabel);
        gridpane.addRow(3, checkboxVbox);
        gridpane.addRow(4, dateVBox);
        gridpane.addRow(5, timeVBox);
        gridpane.addRow(4, locationVBox);
        gridpane.addRow(5, issuedVBox);
        gridpane.addRow(6, submitBtn);
        
        viewTA.setText(allticket);
        
        
     }       
     
     public void Error(){
     String error = "Error!!";
     viewTA.setText(error);
   }
         
                 
        
         
     public void clearFields()
    {
        getTicketNoTF().clear();
        ticketNoTF.clear();
        licenseTF.clear();
        stateTF.clear();
        permitTF.clear();
        modelTF.clear();
        colorTF.clear();
        reasonInfoTF.clear();
        dateTF.clear();
        timeTF.clear();
        locationTF.clear();
        issuedTF.clear();
        
    }
    
 public void invalidTicketPrevious(){
        
    }


    
    public Label getLicenseLabel()
    {
        return licenseLabel;
    }

    public void setLicenseLabel(Label licenseLabel)
    {
        this.licenseLabel = licenseLabel;
    }

    public TextField getLicenseTF()
    {
        return licenseTF;
    }

    public void setLicenseTF(TextField licenseTF)
    {
        this.licenseTF = licenseTF;
    }

    public Label getStateLabel()
    {
        return stateLabel;
    }

    public void setStateLabel(Label stateLabel)
    {
        this.stateLabel = stateLabel;
    }

    public TextField getStateTF()
    {
        return stateTF;
    }

    public void setStateTF(TextField stateTF)
    {
        this.stateTF = stateTF;
    }

    public Label getPermitLabel()
    {
        return permitLabel;
    }

    public void setPermitLabel(Label permitLabel)
    {
        this.permitLabel = permitLabel;
    }

    public TextField getPermitTF()
    {
        return permitTF;
    }

    public void setPermitTF(TextField permitTF)
    {
        this.permitTF = permitTF;
    }

    public Label getModelLabel()
    {
        return modelLabel;
    }

    public void setModelLabel(Label modelLabel)
    {
        this.modelLabel = modelLabel;
    }

    public TextField getModelTF()
    {
        return modelTF;
    }

    public void setModelTF(TextField modelTF)
    {
        this.modelTF = modelTF;
    }

    public Label getColorLabel()
    {
        return colorLabel;
    }

    public void setColorLabel(Label colorLabel)
    {
        this.colorLabel = colorLabel;
    }

    public TextField getColorTF()
    {
        return colorTF;
    }

    public void setColorTF(TextField colorTF)
    {
        this.colorTF = colorTF;
    }

    public Label getReasonLabel()
    {
        return reasonLabel;
    }

    public void setReasonLabel(Label reasonLabel)
    {
        this.reasonLabel = reasonLabel;
    }

    public Label getDateLabel()
    {
        return dateLabel;
    }

    public void setDateLabel(Label dateLabel)
    {
        this.dateLabel = dateLabel;
    }

    public TextField getDateTF()
    {
        return dateTF;
    }

    public void setDateTF(TextField dateTF)
    {
        this.dateTF = dateTF;
    }

    public Label getTimeLabel()
    {
        return timeLabel;
    }

    public void setTimeLabel(Label timeLabel)
    {
        this.timeLabel = timeLabel;
    }

    public TextField getTimeTF()
    {
        return timeTF;
    }

    public void setTimeTF(TextField timeTF)
    {
        this.timeTF = timeTF;
    }

    public Label getLocationLabel()
    {
        return locationLabel;
    }

    public void setLocationLabel(Label locationLabel)
    {
        this.locationLabel = locationLabel;
    }

    public TextField getLocationTF()
    {
        return locationTF;
    }

    public void setLocationTF(TextField locationTF)
    {
        this.locationTF = locationTF;
    }

    public Label getIssuedLabel()
    {
        return issuedLabel;
    }

    public void setIssuedLabel(Label issuedLabel)
    {
        this.issuedLabel = issuedLabel;
    }

    public TextField getIssuedTF()
    {
        return issuedTF;
    }

    public void setIssuedTF(TextField issuedTF)
    {
        this.issuedTF = issuedTF;
    }

    
    
    
    public Button getSubmitBtn()
    {
        return submitBtn;
    }

    public void setSubmitBtn(Button submitBtn)
    {
        this.submitBtn = submitBtn;
    }

    public Button getPreviousBtn()
    {
        return previousBtn;
    }

    public void setPreviousBtn(Button previousBtn)
    {
        this.previousBtn = previousBtn;
    }

    public Button getNextBtn()
    {
        return nextBtn;
    }

    public void setNextBtn(Button nextBtn)
    {
        this.nextBtn = nextBtn;
    }


    public Button getExit()
    {
        return exit;
    }

    public void setExit(Button exit)
    {
        this.exit = exit;
    }

    public TextArea getViewTA()
    {
        return viewTA;
    }

    public void setViewTA(TextArea viewTA)
    {
        this.viewTA = viewTA;
    }


    public void setFeedbackLabel(Label feedbackLabel)
    {
        this.feedbackLabel = feedbackLabel;
    }
    
    
        public Label getFeedbackLabel() {
        return feedbackLabel;
    }

    
        /**
     * @return the feedbackSubmitBtn
     */
    public Button getFeedbackSubmitBtn() {
        return feedbackSubmitBtn;
    }

    /**
     * @param feedbackSubmitBtn the feedbackSubmitBtn to set
     */
    public void setFeedbackSubmitBtn(Button feedbackSubmitBtn) {
        this.feedbackSubmitBtn = feedbackSubmitBtn;
    }

    /**
     * @return the clearViewBtn
     */
    public Button getClearViewBtn() {
        return clearViewBtn;
    }

    /**
     * @param clearViewBtn the clearViewBtn to set
     */
    public void setClearViewBtn(Button clearViewBtn) {
        this.clearViewBtn = clearViewBtn;
    }

    /**
     * @return the arrowBtnHbox
     */
    public HBox getArrowBtnHbox() {
        return arrowBtnHbox;
    }

    /**
     * @param arrowBtnHbox the arrowBtnHbox to set
     */
    public void setArrowBtnHbox(HBox arrowBtnHbox) {
        this.arrowBtnHbox = arrowBtnHbox;
    }



    /**
     * @return the titleLabel
     */
    public Label getTitleLabel() {
        return titleLabel;
    }

    /**
     * @param titleLabel the titleLabel to set
     */
    public void setTitleLabel(Label titleLabel) {
        this.titleLabel = titleLabel;
    }

  
    
    
    
    
    /**
     * @return the root
     */
    public BorderPane getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(BorderPane root) {
        this.root = root;
    }


    /**
     * @return the feedbackTA
     */
    public TextArea getFeedbackTA() {
        return feedbackTA;
    }

    /**
     * @param feedbackTA the feedbackTA to set
     */
    public void setFeedbackTA(TextArea feedbackTA) {
        this.feedbackTA = feedbackTA;
    }
    /**
     * @return the reasoninfoTF
     */
    public TextField getReasonInfoTF() {
        return reasonInfoTF;
    }

    /**
     * @param reasonInfoTF the reasonInfoTF to set
     */
    public void setReasonInfoTF(TextField reasonInfoTF) {
        this.reasonInfoTF = reasonInfoTF;
    }

    /**
     * @param paymentinfoLabel the paymentinfoLabel to set


    /**
     * @return the paymentInfoLabel
     */
    public Label getPaymentInfoLabel() {
        return paymentInfoLabel;
    }


    /**
     * @return the paymentTextLabel
     */
    public Label getPaymentTextLabel() {
        return paymentTextLabel;
    }

    /**
     * @param paymentTextLabel the paymentTextLabel to set
     */
    public void setPaymentTextLabel(Label paymentTextLabel) {
        this.paymentTextLabel = paymentTextLabel;
    }

    /**
     * @return the reason1
     */
    public String getReason1() {
        return reason1;
    }

    /**
     * @param reason1 the reason1 to set
     */
    public void setReason1(String reason1) {
        this.reason1 = reason1;
    }

    /**
     * @return the reason2
     */
    public String getReason2() {
        return reason2;
    }

    /**
     * @param reason2 the reason2 to set
     */
    public void setReason2(String reason2) {
        this.reason2 = reason2;
    }

    /**
     * @return the reason3
     */
    public String getReason3() {
        return reason3;
    }

    /**
     * @param reason3 the reason3 to set
     */
    public void setReason3(String reason3) {
        this.reason3 = reason3;
    }

    /**
     * @return the reason4
     */
    public String getReason4() {
        return reason4;
    }

    /**
     * @param reason4 the reason4 to set
     */
    public void setReason4(String reason4) {
        this.reason4 = reason4;
    }

    /**
     * @return the reason5
     */
    public String getReason5() {
        return reason5;
    }

    /**
     * @param reason5 the reason5 to set
     */
    public void setReason5(String reason5) {
        this.reason5 = reason5;
    }

    /**
     * @return the reason6
     */
    public String getReason6() {
        return reason6;
    }

    /**
     * @param reason6 the reason6 to set
     */
    public void setReason6(String reason6) {
        this.reason6 = reason6;
    }

    /**
     * @return the reason7
     */
    public String getReason7() {
        return reason7;
    }

    /**
     * @param reason7 the reason7 to set
     */
    public void setReason7(String reason7) {
        this.reason7 = reason7;
    }

    /**
     * @return the reason8
     */
    public String getReason8() {
        return reason8;
    }

    /**
     * @param reason8 the reason8 to set
     */
    public void setReason8(String reason8) {
        this.reason8 = reason8;
    }

    /**
     * @return the reason9
     */
    public String getReason9() {
        return reason9;
    }

    /**
     * @param reason9 the reason9 to set
     */
    public void setReason9(String reason9) {
        this.reason9 = reason9;
    }

    /**
     * @return the box1
     */
    public CheckBox getBox1() {
        return box1;
    }

    /**
     * @param box1 the box1 to set
     */
    public void setBox1(CheckBox box1) {
        this.box1 = box1;
    }

    /**
     * @return the box2
     */
    public CheckBox getBox2() {
        return box2;
    }

    /**
     * @param box2 the box2 to set
     */
    public void setBox2(CheckBox box2) {
        this.box2 = box2;
    }

    /**
     * @return the box3
     */
    public CheckBox getBox3() {
        return box3;
    }

    /**
     * @param box3 the box3 to set
     */
    public void setBox3(CheckBox box3) {
        this.box3 = box3;
    }

    /**
     * @return the box4
     */
    public CheckBox getBox4() {
        return box4;
    }

    /**
     * @param box4 the box4 to set
     */
    public void setBox4(CheckBox box4) {
        this.box4 = box4;
    }

    /**
     * @return the box5
     */
    public CheckBox getBox5() {
        return box5;
    }

    /**
     * @param box5 the box5 to set
     */
    public void setBox5(CheckBox box5) {
        this.box5 = box5;
    }

    /**
     * @return the box6
     */
    public CheckBox getBox6() {
        return box6;
    }

    /**
     * @param box6 the box6 to set
     */
    public void setBox6(CheckBox box6) {
        this.box6 = box6;
    }

    /**
     * @return the box7
     */
    public CheckBox getBox7() {
        return box7;
    }

    /**
     * @param box7 the box7 to set
     */
    public void setBox7(CheckBox box7) {
        this.box7 = box7;
    }

    /**
     * @return the box8
     */
    public CheckBox getBox8() {
        return box8;
    }

    /**
     * @param box8 the box8 to set
     */
    public void setBox8(CheckBox box8) {
        this.box8 = box8;
    }

    /**
     * @return the box9
     */
    public CheckBox getBox9() {
        return box9;
    }

    /**
     * @param box9 the box9 to set
     */
    public void setBox9(CheckBox box9) {
        this.box9 = box9;
    }

    /**
     * @return the viewBtn
     */
    public Button getViewBtn() {
        return viewBtn;
    }

    /**
     * @param viewBtn the viewBtn to set
     */
    public void setViewBtn(Button viewBtn) {
        this.viewBtn = viewBtn;
    }

    /**
     * @return the currentTicket
     */
    public int getCurrentTicket() {
        return currentTicket;
    }

    /**
     * @param currentTicket the currentTicket to set
     */
    public void setCurrentTicket(int currentTicket) {
        this.currentTicket = currentTicket;
    }

    /**
     * @return the ticketNoLabel
     */
    public Label getTicketNoLabel() {
        return ticketNoLabel;
    }

    /**
     * @param ticketNoLabel the ticketNoLabel to set
     */
    public void setTicketNoLabel(Label ticketNoLabel) {
        this.ticketNoLabel = ticketNoLabel;
    }

    /**
     * @return the ticketNoTF
     */
    public TextField getTicketNoTF() {
        return ticketNoTF;
    }

    /**
     * @param ticketNoTF the ticketNoTF to set
     */
    public void setTicketNoTF(TextField ticketNoTF) {
        this.ticketNoTF = ticketNoTF;
    }



}