/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package omfbreports;

 import java.sql.*;
import com.qoppa.pdfWriter.PDFPrinterJob;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

/**
 *
 * @author Smartec
 */
public class GenShareCertBatch extends javax.swing.JFrame implements Printable{

    /**
     * Creates new form MDIForm
     */
    public GenShareCertBatch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTextFieldcertcertno = new javax.swing.JLabel();
        jTextFieldcertamount = new javax.swing.JLabel();
        jTextFieldcertmillion = new javax.swing.JLabel();
        jTextFieldcertname = new javax.swing.JLabel();
        jTextFieldunits = new javax.swing.JLabel();
        jTextFieldhundredthousand = new javax.swing.JLabel();
        jTextFieldtenthousand = new javax.swing.JLabel();
        jTextFieldcertacno = new javax.swing.JLabel();
        jTextFieldhundred = new javax.swing.JLabel();
        jTextFieldthousand = new javax.swing.JLabel();
        jTextFieldtens = new javax.swing.JLabel();
        jTextFieldcertamount2 = new javax.swing.JLabel();
        jTextFieldcertacno2 = new javax.swing.JLabel();
        jTextFieldcertcertno2 = new javax.swing.JLabel();
        jTextFieldunits2 = new javax.swing.JLabel();
        jTextFieldcertname2 = new javax.swing.JLabel();
        jTextFieldtens2 = new javax.swing.JLabel();
        jTextFieldhundred2 = new javax.swing.JLabel();
        jTextFieldthousand2 = new javax.swing.JLabel();
        jTextFieldtenthousand2 = new javax.swing.JLabel();
        jTextFieldcertmillion2 = new javax.swing.JLabel();
        jTextFieldhundredthousand2 = new javax.swing.JLabel();
        jTextFieldtransferno = new javax.swing.JLabel();
        jTextFieldtransferno2 = new javax.swing.JLabel();
        jLabelbonus2 = new javax.swing.JLabel();
        jLabelbonus = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextFieldgl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFielddate = new javax.swing.JTextField();
        jComboBoxtype = new javax.swing.JComboBox<>();
        jComboBoxprinttype = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OMFB Shares Certificate Generator");
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ImageIcon icon= new ImageIcon(this.getClass().getResource("/omfbreports/Resource/SHARE CERTIFICATESs.jpg"));
        final Image img=icon.getImage();
        this.setIconImage(img);
        jDesktopPane1 =new JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage( img,0,0,getWidth(),getHeight(),this);
            }
        };
        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setAutoscrolls(true);
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDesktopPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jDesktopPane1.setInheritsPopupMenu(true);
        jDesktopPane1.setName(""); // NOI18N
        jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDesktopPane1MouseClicked(evt);
            }
        });

        jTextFieldcertcertno.setText("00000");
        jTextFieldcertcertno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldcertcertno);
        jTextFieldcertcertno.setBounds(60, 50, 60, 14);

        jTextFieldcertamount.setText("000000");
        jTextFieldcertamount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldcertamount);
        jTextFieldcertamount.setBounds(510, 50, 60, 14);

        jTextFieldcertmillion.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldcertmillion.setText("Amount");
        jTextFieldcertmillion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldcertmillion);
        jTextFieldcertmillion.setBounds(200, 190, 40, 20);

        jTextFieldcertname.setText("XXXXX");
        jTextFieldcertname.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldcertname);
        jTextFieldcertname.setBounds(280, 120, 180, 20);

        jTextFieldunits.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldunits.setText("Amount");
        jTextFieldunits.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldunits);
        jTextFieldunits.setBounds(460, 190, 40, 20);

        jTextFieldhundredthousand.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldhundredthousand.setText("Amount");
        jTextFieldhundredthousand.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldhundredthousand);
        jTextFieldhundredthousand.setBounds(240, 190, 39, 20);

        jTextFieldtenthousand.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldtenthousand.setText("Amount");
        jTextFieldtenthousand.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldtenthousand);
        jTextFieldtenthousand.setBounds(280, 190, 39, 20);

        jTextFieldcertacno.setText("000000");
        jTextFieldcertacno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldcertacno);
        jTextFieldcertacno.setBounds(50, 100, 60, 14);

        jTextFieldhundred.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldhundred.setText("Amount");
        jTextFieldhundred.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldhundred);
        jTextFieldhundred.setBounds(370, 190, 40, 20);

        jTextFieldthousand.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldthousand.setText("Amount");
        jTextFieldthousand.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldthousand);
        jTextFieldthousand.setBounds(320, 190, 50, 20);

        jTextFieldtens.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldtens.setText("Amount");
        jTextFieldtens.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldtens);
        jTextFieldtens.setBounds(420, 190, 40, 20);

        jTextFieldcertamount2.setText("000000");
        jTextFieldcertamount2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldcertamount2);
        jTextFieldcertamount2.setBounds(510, 430, 60, 14);

        jTextFieldcertacno2.setText("000000");
        jTextFieldcertacno2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jTextFieldcertacno2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldcertacno2);
        jTextFieldcertacno2.setBounds(60, 480, 60, 14);

        jTextFieldcertcertno2.setText("00000");
        jTextFieldcertcertno2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldcertcertno2);
        jTextFieldcertcertno2.setBounds(60, 430, 60, 14);

        jTextFieldunits2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldunits2.setText("Amount");
        jTextFieldunits2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldunits2);
        jTextFieldunits2.setBounds(460, 570, 40, 13);

        jTextFieldcertname2.setText("XXXXX");
        jTextFieldcertname2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldcertname2);
        jTextFieldcertname2.setBounds(280, 510, 180, 14);

        jTextFieldtens2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldtens2.setText("Amount");
        jTextFieldtens2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldtens2);
        jTextFieldtens2.setBounds(420, 570, 40, 13);

        jTextFieldhundred2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldhundred2.setText("Amount");
        jTextFieldhundred2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldhundred2);
        jTextFieldhundred2.setBounds(380, 570, 40, 13);

        jTextFieldthousand2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldthousand2.setText("Amount");
        jTextFieldthousand2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldthousand2);
        jTextFieldthousand2.setBounds(330, 570, 50, 13);

        jTextFieldtenthousand2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldtenthousand2.setText("Amount");
        jTextFieldtenthousand2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldtenthousand2);
        jTextFieldtenthousand2.setBounds(280, 570, 50, 13);

        jTextFieldcertmillion2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldcertmillion2.setText("Amount");
        jTextFieldcertmillion2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldcertmillion2);
        jTextFieldcertmillion2.setBounds(190, 570, 40, 13);

        jTextFieldhundredthousand2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldhundredthousand2.setText("Amount");
        jTextFieldhundredthousand2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldhundredthousand2);
        jTextFieldhundredthousand2.setBounds(230, 570, 50, 13);

        jTextFieldtransferno.setText("000000");
        jTextFieldtransferno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldtransferno);
        jTextFieldtransferno.setBounds(90, 260, 60, 14);

        jTextFieldtransferno2.setText("000000");
        jTextFieldtransferno2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jTextFieldtransferno2);
        jTextFieldtransferno2.setBounds(100, 650, 60, 14);

        jLabelbonus2.setText("00");
        jLabelbonus2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jLabelbonus2);
        jLabelbonus2.setBounds(210, 400, 80, 10);

        jLabelbonus.setText("00");
        jLabelbonus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jLabelbonus);
        jLabelbonus.setBounds(210, 20, 80, 10);

        jButton3.setBackground(new java.awt.Color(0, 102, 0));
        jButton3.setText("Generate Batch ");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextFieldgl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldgl.setText("300105");
        jTextFieldgl.setBorder(null);

        jLabel2.setBackground(new java.awt.Color(0, 102, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("GL_NO");

        jLabel3.setBackground(new java.awt.Color(0, 102, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Purchase Date");

        jTextFielddate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFielddate.setText("2018-12-04");
        jTextFielddate.setBorder(null);

        jComboBoxtype.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bonus Share", "Not Bonus Share", "Transaction", "Yearly", "Total" }));
        jComboBoxtype.setBorder(null);
        jComboBoxtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxtypeActionPerformed(evt);
            }
        });

        jComboBoxprinttype.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jComboBoxprinttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hardcopy", "softcopy only" }));
        jComboBoxprinttype.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldgl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFielddate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxprinttype, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFielddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxprinttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


   
     String initCertno=JOptionPane.showInputDialog("Kindly,type the certificate no you would like to start with here:");
     count=1;
     

  
       certno=Integer.parseInt(initCertno);
           String   StrQuery="";
       if(jComboBoxtype.getSelectedItem().toString().equalsIgnoreCase("Transaction")){
      StrQuery="select ac_no,abs(amount) amount,name from memtrans inner join customer on cust_no=ac_no "
             + "where  gl_no='"+jTextFieldgl.getText()+"' and ses_date='"+jTextFielddate.getText()+"' order by name";
       }
       else if(jComboBoxtype.getSelectedItem().toString().equalsIgnoreCase("Yearly")){
             StrQuery="select ac_no,SUM(abs(amount)) amount,name from memtrans inner join customer on cust_no=ac_no "
             + "where gl_no='"+jTextFieldgl.getText()+"' and ses_date between '"
                   + ""+jTextFielddate.getText().substring(0,4)+"-01-01' and '"+jTextFielddate.getText().substring(0,4)+"-12-31'"
                     + " group by ac_no,name order by name";
   
       }else{
            StrQuery="select ac_no,SUM(abs(amount)) amount,name from memtrans inner join customer on cust_no=ac_no "
             + "where  gl_no='"+jTextFieldgl.getText()+"'"
                  + " group by ac_no,name order by name";
       }
    glob = new Global();
Connection conn= glob.getConnect();
     try{
 Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);

ResultSet cur = stmt.executeQuery(StrQuery);
        while(cur.next()){
     accno=cur.getString("ac_no");
   if(count==1){
     jTextFieldcertmillion.setText("");
     jTextFieldhundredthousand.setText("");
     jTextFieldtenthousand.setText("");
     jTextFieldthousand.setText("");
     jTextFieldhundred.setText("");
     jTextFieldtens.setText("");
     jTextFieldunits.setText("");
    
  // JOptionPane.showMessageDialog(rootPane,"First Cert "+evt.getY());

        
jTextFieldcertcertno.setText(certno+"");
String amount=cur.getString("amount").replace(".00","");

jTextFieldcertamount.setText(amount);
amount=reverse(amount);
jTextFieldcertname.setText(cur.getString("name").trim());
jTextFieldcertacno.setText(cur.getString("ac_no").trim());
if(!jComboBoxtype.getSelectedItem().toString().equalsIgnoreCase("Transaction")){
    jTextFieldtransferno.setText(jTextFielddate.getText().substring(0,4));
}else{
jTextFieldtransferno.setText(jTextFielddate.getText().replaceAll("-", ""));
}
int L=amount.length();
for(int i=0;i<L;i++){
    
    if(i==6){
        jTextFieldcertmillion.setText(to_text(amount.substring(i,i+1)));
    }
    else if(i==5){
     jTextFieldhundredthousand.setText(to_text(amount.substring(i,i+1)));
    }
else if(i==4){
     jTextFieldtenthousand.setText(to_text(amount.substring(i,i+1)));
    }
else if(i==3){
    jTextFieldthousand.setText(to_text(amount.substring(i,i+1)));
    }
else if(i==2){
     jTextFieldhundred.setText(to_text(amount.substring(i,i+1)));
    }
else if(i==1){
     jTextFieldtens.setText(to_text(amount.substring(i,i+1)));
              }
     else if(i==0){
     jTextFieldunits.setText(to_text(amount.substring(i,i+1)));
    }
    
  
}
   count=2;
   certno=certno+1;                        
   } //end of if
   else if(count==2){
    jTextFieldcertmillion2.setText("");
    jTextFieldhundredthousand2.setText("");
    jTextFieldtenthousand2.setText("");
    jTextFieldthousand2.setText("");
    jTextFieldhundred2.setText("");
    jTextFieldtens2.setText("");
    jTextFieldunits2.setText("");
    
   // JOptionPane.showMessageDialog(rootPane,"Second Cert"); 
   
jTextFieldcertcertno2.setText(certno+"");
String amount2=cur.getString("amount").replace(".00","");

jTextFieldcertamount2.setText(amount2);
amount2=reverse(amount2);
jTextFieldcertname2.setText(cur.getString("name").trim());
jTextFieldcertacno2.setText(cur.getString("ac_no").trim());
if(!jComboBoxtype.getSelectedItem().toString().equalsIgnoreCase("Transaction")){
    jTextFieldtransferno2.setText(jTextFielddate.getText().substring(0,4));
}else{
jTextFieldtransferno2.setText(jTextFielddate.getText().replaceAll("-", ""));
}
int L=amount2.length();
for(int i=0;i<L;i++){
    
    if(i==6){
        jTextFieldcertmillion2.setText(to_text(amount2.substring(i,i+1)));
    }
    else if(i==5){
     jTextFieldhundredthousand2.setText(to_text(amount2.substring(i,i+1)));
    }
else if(i==4){
     jTextFieldtenthousand2.setText(to_text(amount2.substring(i,i+1)));
    }
else if(i==3){
    jTextFieldthousand2.setText(to_text(amount2.substring(i,i+1)));
    }
else if(i==2){
     jTextFieldhundred2.setText(to_text(amount2.substring(i,i+1)));
    }
else if(i==1){
     jTextFieldtens2.setText(to_text(amount2.substring(i,i+1)));
              }
     else if(i==0){
     jTextFieldunits2.setText(to_text(amount2.substring(i,i+1)));
    }
    
}
 count=1;
 certno=certno+1;
 
 PDFPrinterJob printer = (PDFPrinterJob)PDFPrinterJob.getPrinterJob ();
    	 // set the printable object 
    	 printer.setPrintable (this);
    	 // set number of copies to 1 
    	 printer.setCopies (1);
    	 // print and save the document
    	 printer.print("BatchShareCert//"+accno+".pdf");
         if(jComboBoxprinttype.getSelectedItem().toString().equalsIgnoreCase("Hardcopy")){
             
          PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();  
 
        FileInputStream inputStream = null;
            inputStream = new FileInputStream("BatchShareCert//"+accno+".pdf");
        
 PrintService printService=PrintServiceLookup.lookupDefaultPrintService();
       
        PDDocument pdf = PDDocument.load(inputStream);
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintService(printService);
        job.setPageable(new PDFPageable(pdf));
        job.print(aset);
        pdf.close();   
         }
          
   
                                   }//end of else if
        }//end of while
   
   }
   
   catch(PrinterException | IOException | NullPointerException | SQLException e){
       try
       {
       BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));
         
    
    writer.append("Not printed "+accno+".pdf");
     
    writer.close();
       
       JOptionPane.showMessageDialog(rootPane, e.getMessage());
       }
       catch(Exception ee){ JOptionPane.showMessageDialog(rootPane, ee.getMessage());}
   }
   

             
     
      	 // updating database
          try
     {
       conn=glob.getConnect();
     
     PreparedStatement pstmt=conn.prepareStatement("update newusers set password='"+certno+"' where username='cert'");

pstmt.executeUpdate();
      
     }
     catch(SQLException e){
         JOptionPane.showMessageDialog(rootPane, "Exception: "+e.getMessage());
     }
//finish updating database
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jDesktopPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MouseClicked
   
    }//GEN-LAST:event_jDesktopPane1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   jTextFieldcertmillion.setText("");
    jTextFieldcertmillion2.setText("");
     jTextFieldhundredthousand.setText("");
    
    jTextFieldhundredthousand2.setText("");
     jTextFieldtenthousand.setText("");
   jTextFieldtenthousand2.setText("");

    jTextFieldthousand.setText("");
    
     jTextFieldthousand2.setText("");
     jTextFieldhundred.setText("");
       jTextFieldhundred2.setText("");

     jTextFieldtens.setText("");
        jTextFieldtens2.setText("");    
    
     jTextFieldunits.setText("");
     jTextFieldunits2.setText("");
     jLabelbonus2.setText("");
    jLabelbonus.setText("");
     try
     {
       conn=glob.getConnect();
     Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);

ResultSet cur = stmt.executeQuery("select password from newusers where username='cert'");
       if( cur.next())
       
       {
certno=cur.getInt("password");
//JOptionPane.showMessageDialog(rootPane, certno);

       }
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(rootPane, "Exception: "+e.getMessage());
     }


   


     
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxtypeActionPerformed
     //checking for Bonus share
if(jComboBoxtype.getSelectedItem().toString().equalsIgnoreCase("Bonus Share")){
    jLabelbonus2.setText("Bonus Share");
    jLabelbonus.setText("Bonus Share");
}
else if(jComboBoxtype.getSelectedItem().toString().equalsIgnoreCase("Not Bonus Share")){
    jLabelbonus2.setText("");
    jLabelbonus.setText("");
} 
 //end of checking for Bonus share        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxtypeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GenShareCertBatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenShareCertBatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenShareCertBatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenShareCertBatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GenShareCertBatch().setVisible(true); 
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxprinttype;
    private javax.swing.JComboBox<String> jComboBoxtype;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelbonus;
    private javax.swing.JLabel jLabelbonus2;
    private javax.swing.JLabel jTextFieldcertacno;
    private javax.swing.JLabel jTextFieldcertacno2;
    private javax.swing.JLabel jTextFieldcertamount;
    private javax.swing.JLabel jTextFieldcertamount2;
    private javax.swing.JLabel jTextFieldcertcertno;
    private javax.swing.JLabel jTextFieldcertcertno2;
    private javax.swing.JLabel jTextFieldcertmillion;
    private javax.swing.JLabel jTextFieldcertmillion2;
    private javax.swing.JLabel jTextFieldcertname;
    private javax.swing.JLabel jTextFieldcertname2;
    private javax.swing.JTextField jTextFielddate;
    private javax.swing.JTextField jTextFieldgl;
    private javax.swing.JLabel jTextFieldhundred;
    private javax.swing.JLabel jTextFieldhundred2;
    private javax.swing.JLabel jTextFieldhundredthousand;
    private javax.swing.JLabel jTextFieldhundredthousand2;
    private javax.swing.JLabel jTextFieldtens;
    private javax.swing.JLabel jTextFieldtens2;
    private javax.swing.JLabel jTextFieldtenthousand;
    private javax.swing.JLabel jTextFieldtenthousand2;
    private javax.swing.JLabel jTextFieldthousand;
    private javax.swing.JLabel jTextFieldthousand2;
    private javax.swing.JLabel jTextFieldtransferno;
    private javax.swing.JLabel jTextFieldtransferno2;
    private javax.swing.JLabel jTextFieldunits;
    private javax.swing.JLabel jTextFieldunits2;
    // End of variables declaration//GEN-END:variables
Global glob= new Global();
 public int print (Graphics g, PageFormat pf, int pageIndex) 
    {
    	if (pageIndex == 0)
    	{
 
          // translate the graphics for margins
    	  g.translate(0, 0);
         int w=jDesktopPane1.getWidth();
         int h=jDesktopPane1.getHeight();
    	 // JOptionPane.showMessageDialog(rootPane, jPanel1.getHeight());
    	  //jDesktopPane1.setBounds(new java.awt.Rectangle(0, 0, 620, 806));
          jDesktopPane1.setBounds(new java.awt.Rectangle(0, 0,w ,h ));
    	   jDesktopPane1.revalidate();
         jDesktopPane1.repaint();
    	 // print the panel to the graphics on page 0
    	jDesktopPane1.print (g);
    	 return Printable.PAGE_EXISTS;
    	}
    	else
    	{
    	 return Printable.NO_SUCH_PAGE;
    	}
    }
 
   public String to_text(String input) {
        String output;
        if(input.equalsIgnoreCase("0")){output="ZERO";}
        else if(input.equalsIgnoreCase("1")){output="ONE";}
        else if(input.equalsIgnoreCase("2")){output="TWO";}
        else if(input.equalsIgnoreCase("3")){output="THREE";}
        else if(input.equalsIgnoreCase("4")){output="FOUR";}
        else if(input.equalsIgnoreCase("5")){output="FIVE";}
        else if(input.equalsIgnoreCase("6")){output="SIX";}
        else if(input.equalsIgnoreCase("7")){output="SEVEN";}
        else if(input.equalsIgnoreCase("8")){output="EIGHT";}
        else if(input.equalsIgnoreCase("9")){output="NINE";}
        else{output="";}
        return output;
        
    }
   public String reverse(String input){
     String reverse = "";
for(int i = input. length() - 1; i >= 0; i--) {
reverse = reverse + input. charAt(i); } 
return reverse;
   }
   int certno;
   int count;
   String accno;
   Connection conn;
}
