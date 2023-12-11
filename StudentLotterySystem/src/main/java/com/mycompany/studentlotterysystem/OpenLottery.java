package com.mycompany.studentlotterysystem;

import com.formdev.flatlaf.*;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.io.File;  
import java.io.FileInputStream;  
import static java.lang.Integer.parseInt;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;  
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.Timer;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;

public class OpenLottery extends javax.swing.JFrame {
    private String FirstName, LastName, Email, sessionId;
            File file;
            FileInputStream fis;

            XSSFWorkbook wb;
    public OpenLottery() {
        initComponents();
        jPanel1.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        popupMenu1 = new java.awt.PopupMenu();
        WinnerLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTextArea1 = new javax.swing.JTextArea();
        ShowWinners = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        ContestantsLabel = new javax.swing.JLabel();
        WinnerSizeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileChooserContestants = new javax.swing.JMenu();
        SendEmailBar = new javax.swing.JMenu();
        NewWinnerSheet = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem3.setText("jMenuItem3");

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        WinnerLabel.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        WinnerLabel.setText("Winners:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 2, 8)); // NOI18N
        jLabel2.setText("This program was made by the reknown \"Bayshore Boys\"..");

        outputTextArea1.setEditable(false);
        outputTextArea1.setBackground(new java.awt.Color(102, 102, 102));
        outputTextArea1.setColumns(20);
        outputTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        outputTextArea1.setRows(5);
        jScrollPane1.setViewportView(outputTextArea1);

        ShowWinners.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ShowWinners.setText("Roll winners");
        ShowWinners.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ShowWinners.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ShowWinners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowWinnersActionPerformed(evt);
            }
        });

        outputTextArea.setEditable(false);
        outputTextArea.setBackground(new java.awt.Color(102, 102, 102));
        outputTextArea.setColumns(20);
        outputTextArea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        outputTextArea.setRows(5);
        outputTextArea.setCaretColor(new java.awt.Color(255, 255, 255));
        outputTextArea.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(outputTextArea);

        ContestantsLabel.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        ContestantsLabel.setText("Contestants:");

        WinnerSizeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        WinnerSizeButton.setText("Enter number of winners");
        WinnerSizeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WinnerSizeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        WinnerSizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WinnerSizeButtonMouseClicked(evt);
            }
        });
        WinnerSizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WinnerSizeButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jLabel3.setText("Student Lottery System");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(OpenLottery.class.getClassLoader().getResource("resources/lotoicon.gif")));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -10, 380, -1));

        FileChooserContestants.setText("Click to load Contestants");
        FileChooserContestants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FileChooserContestantsMouseClicked(evt);
            }
        });
        jMenuBar1.add(FileChooserContestants);

        SendEmailBar.setText("Send Email to Winners");
        SendEmailBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SendEmailBarMouseClicked(evt);
            }
        });
        jMenuBar1.add(SendEmailBar);

        NewWinnerSheet.setText("Save Winners");
        NewWinnerSheet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewWinnerSheetMouseClicked(evt);
            }
        });
        jMenuBar1.add(NewWinnerSheet);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(484, 484, 484)
                        .addComponent(jLabel2))
                    .addComponent(ContestantsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(ShowWinners))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WinnerSizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WinnerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ContestantsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WinnerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WinnerSizeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ShowWinners)
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    ArrayList<Student> StudentList = new ArrayList<Student>();
    ArrayList<Student> Winners = new ArrayList<Student>();
    
    static String StudentOutput = "";
    static int numWinners = 1;
    
    private void FileChooserContestantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FileChooserContestantsMouseClicked
        
        StudentList = new ArrayList<Student>();
        StudentOutput = "";

        try{

            file = showFileChooser();
            fis = new FileInputStream(file);

            wb = new XSSFWorkbook(fis);
            
          //  wb.add
            
            XSSFSheet sheet = wb.getSheetAt(0);
            

            Iterator<Row> itr = sheet.iterator();

            itr.next();

            while (itr.hasNext())
            {
                Row row = itr.next();
                Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
                int i = 0;

                String FirstName = "";
                String LastName = "";
                String Email = "";
                String sessionId = "";

                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType())
                    {
                        case Cell.CELL_TYPE_STRING:    //field that represents string cell type
                        if(i == 0) {
                            FirstName = cell.getStringCellValue();
                            i = 1;
                            break;
                        }
                        if(i == 1) {
                            LastName = cell.getStringCellValue();
                            i = 2;
                            break;
                        }
                        if(i == 2) {
                            Email= cell.getStringCellValue();
                            i = 3;
                            break;
                        }
                        if(i == 3) {
                            sessionId = cell.getStringCellValue();
                            i = 0;
                            StudentList.add(new Student(FirstName, LastName, Email, sessionId));
                            break;
                        }

                        

                        default:
                    }

                }

                System.out.println("");
            }

        }
        catch(java.lang.RuntimeException e){
            System.out.println(e.getMessage());
        }
        catch(java.io.FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(java.io.IOException e){
            System.out.println(e.getMessage());
        }
        String Contestants = "";
        for (Student s: StudentList){
            Contestants += s+"\n";
        }
        
        RunLottery list = new RunLottery(StudentList, numWinners);
        outputTextArea1.setText(Contestants);

    }//GEN-LAST:event_FileChooserContestantsMouseClicked

    private void SendEmailBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendEmailBarMouseClicked
        
        if(Winners.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please execute program first.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;}
        
        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you would like to send the emails?", "Send Emails", JOptionPane.YES_NO_OPTION);
        if(confirmation==JOptionPane.YES_OPTION){
        SendWinnerEmail();
        SendLoserEmail();
        }
        
        else {
        }
    }//GEN-LAST:event_SendEmailBarMouseClicked

    private void NewWinnerSheetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewWinnerSheetMouseClicked
        
            XSSFSheet sheet = null;
            int index1 = wb.getSheetIndex("Winners");
            
            if(index1!=-1){
                
              int a = JOptionPane.showConfirmDialog(null, "Already created Winners and Waitlist sheet. Would you like to overwrite it?", "Error!", JOptionPane.YES_NO_OPTION);;
              if(a==JOptionPane.YES_OPTION){
                  wb.removeSheetAt(index1);   
                  
              try{sheet = wb.createSheet("Winners");
                 
            } catch (java.lang.NullPointerException e){
                JOptionPane.showMessageDialog(null, "Please execute winners first.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;}
              
              }
              else{return;}
            }      
            
              
        
        CellStyle headerCellStyle = wb.createCellStyle();
        XSSFFont headerFont = wb.createFont();
        headerFont.setBold(true);
        headerCellStyle.setFont(headerFont);

        // Add header row
        
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("First Name");
        headerRow.getCell(0).setCellStyle(headerCellStyle);
        headerRow.createCell(1).setCellValue("Last Name");
        headerRow.getCell(1).setCellStyle(headerCellStyle);
        headerRow.createCell(2).setCellValue("Address");
        headerRow.getCell(2).setCellStyle(headerCellStyle);
        headerRow.createCell(3).setCellValue("Session ID");
        headerRow.getCell(3).setCellStyle(headerCellStyle);

        // Add rows for each winner
        for (int i = 0; i < Winners.size(); i++) {
            Student winner = Winners.get(i);
            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(winner.getFirstName());
            row.createCell(1).setCellValue(winner.getLastName());
            row.createCell(2).setCellValue(winner.getAddress());
            row.createCell(3).setCellValue(winner.getSessionID());
        }

        // Write the workbook to the file
        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            wb.write(outputStream);
            outputStream.close();
            System.out.println(file);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null,"Please try again!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        
        XSSFSheet waitlist = null;
        int index2 = wb.getSheetIndex("Waitlist");
        
        if(index2!=-1)
            wb.removeSheetAt(index2);
                  
              try{waitlist = wb.createSheet("Waitlist");
                
            } catch (java.lang.NullPointerException e){
                JOptionPane.showMessageDialog(null, "Please execute winners first.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;}
              
       
        

        // Add header row
        Row waitlistHeader = waitlist.createRow(0);
        waitlistHeader.createCell(0).setCellValue("First Name");
        waitlistHeader.getCell(0).setCellStyle(headerCellStyle);
        waitlistHeader.createCell(1).setCellValue("Last Name");
        waitlistHeader.getCell(1).setCellStyle(headerCellStyle);
        waitlistHeader.createCell(2).setCellValue("Address");
        waitlistHeader.getCell(2).setCellStyle(headerCellStyle);
        waitlistHeader.createCell(3).setCellValue("Session ID");
        waitlistHeader.getCell(3).setCellStyle(headerCellStyle);

        // Add rows for each winner
        for (int i = 0; i < StudentList.size(); i++) {
            Student waitlisted = StudentList.get(i);
            Row waitrow = waitlist.createRow(i + 1);
            waitrow.createCell(0).setCellValue(waitlisted.getFirstName());
            waitrow.createCell(1).setCellValue(waitlisted.getLastName());
            waitrow.createCell(2).setCellValue(waitlisted.getAddress());
            waitrow.createCell(3).setCellValue(waitlisted.getSessionID());
        }

        // Write the workbook to the file
        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            wb.write(outputStream);
            outputStream.close();
            System.out.println(file);
            JOptionPane.showMessageDialog(null, "Successfully created Winners and Waitlist sheet!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null,"Please try again!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_NewWinnerSheetMouseClicked

    private void ShowWinnersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowWinnersActionPerformed
        RunLottery list = new RunLottery(StudentList, numWinners);
        Winners = list.Lottery();
        try{
            for(int i = 0; i < Winners.size(); i++) {
                Student current = Winners.get(i);
                StudentOutput += current+"\n";}}
        catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(this, "Please enter a file!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        URL url = null;
        url = OpenLottery.class.getResource("/resources/lotoicon.gif");
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);

        /*JFrame f = new JFrame();
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setUndecorated(true);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(t rue);*/
        jPanel1.setVisible(true);
        
        Timer timer = new Timer(3500, e -> {
            jPanel1.setVisible(false);
            outputTextArea.setText(StudentOutput);
        });
        timer.setRepeats(false);
        timer.start();

    }//GEN-LAST:event_ShowWinnersActionPerformed

    private void WinnerSizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WinnerSizeButtonActionPerformed
        try{
            numWinners = parseInt(JOptionPane.showInputDialog(null, "Enter number of winners: "));}

        catch (java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please enter a file!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_WinnerSizeButtonActionPerformed

    private void WinnerSizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WinnerSizeButtonMouseClicked

    }//GEN-LAST:event_WinnerSizeButtonMouseClicked

    public boolean SendWinnerEmail() {
        for(int i = 0; i<Winners.size(); i++) {
            // Recipient's email ID needs to be mentioned.
            String to = Winners.get(i).getAddress();

            // Sender's email ID needs to be mentioned
            String from = "ischs.studentdecision.system";

            // Assuming you are sending email from through gmails smtp
            String host = "smtp.gmail.com";

            // Get system properties
            Properties properties = System.getProperties();

            // Setup mail server
            properties.put("mail.smtp.host", host);
            properties.put("mail.smtp.port", "465");
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.auth", "true");

            // Get the Session object.// and pass username and password
            Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

                @Override
                protected PasswordAuthentication getPasswordAuthentication() {

                    return new PasswordAuthentication("ischs.studentdecision.system", "snpadrldftrgbxch");
                }

            });

            // Used to debug SMTP issues
            //session.setDebug(true);

            try {
                // Create a default MimeMessage object.
                MimeMessage message = new MimeMessage(session);

                // Set From: header field of the header.
                message.setFrom(new InternetAddress(from));

                // Set To: header field of the header.
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                // Set Subject: header field
                message.setSubject("ISCHS Application Update");

                // Now set the actual message
                message.setText("Dear " +Winners.get(i).getFirstName()+" "+Winners.get(i).getLastName()+",\n\n"
                +"Congratulations!\n"
                +"We are pleased to inform you that your child has been accepted to Internationsl Studeies Charter School for the 2023-2024 school year! \n\n"
                +"To confirm your acceptance please respond to the google form below by February 28th, 2023. \n\n"
                +"Click here: https://forms.gle/VuTzh5TQTw7C3Znc8"
                +"\n\nWe look forward to seeing you at ISCHS!\nThank you.");
                

                System.out.println("sending...");
                
                    outputTextArea.setText(StudentOutput);
                    
                // Send message
                Transport.send(message);
                System.out.println("Sent message successfully....");
                

            } catch (MessagingException mex) {
                mex.printStackTrace();
            }
        }
        
        JOptionPane.showMessageDialog(this, "Sent messages successfully to winners, press OK to send the rest!");
        return true;
    }
    
    public boolean SendLoserEmail() {
        for(int i = 0; i<StudentList.size(); i++) {
            // Recipient's email ID needs to be mentioned.
            String to = StudentList.get(i).getAddress();

            // Sender's email ID needs to be mentioned
            String from = "ischs.studentdecision.system";

            // Assuming you are sending email from through gmails smtp
            String host = "smtp.gmail.com";

            // Get system properties
            Properties properties = System.getProperties();

            // Setup mail server
            properties.put("mail.smtp.host", host);
            properties.put("mail.smtp.port", "465");
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.auth", "true");

            // Get the Session object.// and pass username and password
            Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

                @Override
                protected PasswordAuthentication getPasswordAuthentication() {

                    return new PasswordAuthentication("ischs.studentdecision.system", "snpadrldftrgbxch");
                }

            });

            // Used to debug SMTP issues
            //session.setDebug(true);

            try {
                // Create a default MimeMessage object.
                MimeMessage message = new MimeMessage(session);

                // Set From: header field of the header.
                message.setFrom(new InternetAddress(from));

                // Set To: header field of the header.
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                // Set Subject: header field
                message.setSubject("ISCHS application update");

                // Now set the actual message
                message.setText("Dear " +StudentList.get(i).getFirstName()+" "+StudentList.get(i).getLastName()+",\n\n"
                +"Thank you for taking the time to apply to International Studies Charter School! \n"
                +"We regret to inform you that your child has not been selected for this round of the ISCHS 2023/2024 School year. "
                +"If you wish to be considered for future lottery drawings, please open the attached form to opt into the waitlist. \n\n"
                +"Click here: https://forms.gle/4QBW2qx6TYvXwdYP8"
                +"\n\nWe look forward to seeing you at ISCHS!\nThank you.");


                System.out.println("sending...");
                // Send message
                Transport.send(message);
                System.out.println("Sent message successfully....");
                

            } catch (MessagingException mex) {
                mex.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(null, "Sent!");
        return true;
    }
    
    public static File showFileChooser() {
        
        JFrame frame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);
        
        if (result == JFileChooser.APPROVE_OPTION) {
          return fileChooser.getSelectedFile();
        } 
        else {
          return null;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
}

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new OpenLottery().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContestantsLabel;
    private javax.swing.JMenu FileChooserContestants;
    private javax.swing.JMenu NewWinnerSheet;
    private javax.swing.JMenu SendEmailBar;
    private javax.swing.JButton ShowWinners;
    private javax.swing.JLabel WinnerLabel;
    private javax.swing.JButton WinnerSizeButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JTextArea outputTextArea1;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
