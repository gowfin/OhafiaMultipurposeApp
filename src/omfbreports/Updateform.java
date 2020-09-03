/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omfbreports;

import java.awt.Cursor;
import java.awt.FileDialog;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Emmanuel Ikpe
 */
public class Updateform extends javax.swing.JFrame {

    /**
     * Creates new form Updateform
     */
    public Updateform() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextFieldphoto = new javax.swing.JTextField();
        jLabelPhoto = new javax.swing.JLabel();
        jButtonupdate = new javax.swing.JButton();
        jLabelPhone = new javax.swing.JLabel();
        jLabelform = new javax.swing.JLabel();
        jTextFieldSign = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jButtonsearch1 = new javax.swing.JButton();
        jButtonsearch2 = new javax.swing.JButton();
        jTextFieldform = new javax.swing.JTextField();
        jLabelSign = new javax.swing.JLabel();
        jButtonsearch3 = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jLabelClient = new javax.swing.JLabel();
        jLabelpreview = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));

        jTextFieldphoto.setEditable(false);

        jLabelPhoto.setText("Photo");

        jButtonupdate.setBackground(new java.awt.Color(0, 0, 0));
        jButtonupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonupdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonupdate.setText("Update");
        jButtonupdate.setBorder(null);
        jButtonupdate.setEnabled(false);
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });

        jLabelPhone.setText("Phone No:");

        jLabelform.setText("Form");

        jTextFieldSign.setEditable(false);

        jTextFieldPhone.setEditable(false);

        jButtonsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsearch1ActionPerformed(evt);
            }
        });

        jButtonsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsearch2ActionPerformed(evt);
            }
        });

        jTextFieldform.setEditable(false);

        jLabelSign.setText("Signature");

        jButtonsearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsearch3ActionPerformed(evt);
            }
        });

        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });
        jTextFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIDKeyTyped(evt);
            }
        });

        jLabelClient.setText("ClientID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelSign, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelClient, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldSign, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldform, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonsearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldphoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelPhoto))
                    .addComponent(jButtonsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelSign))
                            .addComponent(jButtonsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelform)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonsearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButtonupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabelpreview.setBackground(new java.awt.Color(255, 51, 204));
        jLabelpreview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelpreview.setText("Preview");
        jLabelpreview.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelpreview, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelpreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsearch1ActionPerformed
        String path;
        FileDialog fd = new FileDialog(this, "Choose a file", FileDialog.LOAD);
        //fd.setDirectory(System.getProperty("user.home"));
        fd.setDirectory("\\\\omfbserver\\E\\FinSolutions\\Photos");
       
        fd.setMultipleMode(true);
        fd.setFile("*.jpg;*.JPG;*.png:*.bmp");
        fd.setVisible(true);

        pixpath=fd.getDirectory()+fd.getFile();
        if (pixpath == null)
        JOptionPane.showMessageDialog(this,"No file selected");
        else if(pixpath.contains("Photos")){
            //JOptionPane.showMessageDialog(this,pixpath);
            ImageIcon pic=new ImageIcon(pixpath);
            Image resizpic =pic.getImage().getScaledInstance(230,180,Image.SCALE_SMOOTH);
            ImageIcon resizIcon = new ImageIcon(resizpic);
            //jLabelPassport.setText("");
           jLabelpreview.setIcon(resizIcon);
            repaint();
            pack();
            jTextFieldphoto.setText(pixpath);
        } else{
          JOptionPane.showMessageDialog(this,"You must choose Photos folder");  
        }
    }//GEN-LAST:event_jButtonsearch1ActionPerformed

    private void jButtonsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsearch2ActionPerformed

        FileDialog fd = new FileDialog(this, "Choose a file", FileDialog.LOAD);
        fd.setDirectory("\\\\omfbserver\\E\\FinSolutions\\Signature");
        fd.setMultipleMode(true);
        fd.setFile("*.jpg;*.JPG;*.png:*.bmp");
        fd.setVisible(true);

        pixpath2=fd.getDirectory()+fd.getFile();
        if (pixpath2 == null)
        JOptionPane.showMessageDialog(this,"No file selected");
        else if(pixpath2.contains("Signature")){
            //JOptionPane.showMessageDialog(this,pixpath);
            ImageIcon pic=new ImageIcon(pixpath2);
            Image resizpic =pic.getImage().getScaledInstance(230,180,Image.SCALE_SMOOTH);
            ImageIcon resizIcon = new ImageIcon(resizpic);
            //jLabelPassport.setText("");
           jLabelpreview.setIcon(resizIcon);
            repaint();
            pack();
             jTextFieldSign.setText(pixpath2);
        }  else{
          JOptionPane.showMessageDialog(this,"You must choose Signature folder");  
        }
    }//GEN-LAST:event_jButtonsearch2ActionPerformed

    private void jButtonsearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsearch3ActionPerformed
        String path="\\\\Fileserver\\FILESERVER\\OhafiaKYC\\"+jLabelform.getText()+"\\";
        FileDialog fd = new FileDialog(this, "Choose a file", FileDialog.LOAD);
        fd.setDirectory(path);
        fd.setMultipleMode(true);
        fd.setFile("*.jpg;*.JPG;*.png:*.bmp");
        fd.setVisible(true);
//JOptionPane.showMessageDialog(this,jLabelform.getText());
        pixpath3=fd.getDirectory()+fd.getFile();
        if (pixpath3 == null)
        JOptionPane.showMessageDialog(this,"No file selected");
        else if(fd.getDirectory().toString().contains(jLabelform.getText())){
                
            
            //JOptionPane.showMessageDialog(this,pixpath);
            ImageIcon pic=new ImageIcon(pixpath3);
            Image resizpic =pic.getImage().getScaledInstance(230,180,Image.SCALE_SMOOTH);
            ImageIcon resizIcon = new ImageIcon(resizpic);
            //jLabelPassport.setText("");
           jLabelpreview.setIcon(resizIcon);
            repaint();
            pack();
             jTextFieldform.setText(fd.getFile());
        }
        else {
            JOptionPane.showMessageDialog(this,"Wrong Folder Selected \n Choose "+jLabelform.getText()+" Folder");
        }
    }//GEN-LAST:event_jButtonsearch3ActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed

if(jTextFieldphoto.isVisible() && jTextFieldphoto.getText().equalsIgnoreCase("")){JOptionPane.showMessageDialog(rootPane, "No Photo Selected");}
if(jTextFieldSign.isVisible() && jTextFieldSign.getText().equalsIgnoreCase("")){JOptionPane.showMessageDialog(rootPane, "No signature Selected");}
       
   if(jTextFieldform.isVisible() &&jTextFieldform.getText().equalsIgnoreCase("")){JOptionPane.showMessageDialog(rootPane, "No Scanned Form Selected");}
     
this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
PreparedStatement pstmt;
Global glob = new Global();
glob.getConnect();
 Connection conn= glob.getConnectkyc();
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
 Date cdate = new Date();
  String strnow=sdf.format(cdate);

 String Smonth,Sday;
 Calendar now=Calendar.getInstance();
        now.getTime();
        int year=now.get(Calendar.YEAR);
        int Omonth=now.get(Calendar.MONTH);//opening as january=0 not 1
        int day=now.get(Calendar.DAY_OF_MONTH);
         int month=Omonth+1;//note month start with january=0 in java
        Smonth=month+"";
        Sday=day+"";
       if(month<10){Smonth="0"+month;}// let it appear as two digit e.g 02
        if(day<10){Sday="0"+day;}
        Smonth=month+"";
 String query1="INSERT INTO [KYC].[dbo].[KYCtable]([ClientID],[SD],[AppLet],[PerData],[SignForm],[ATMForm],[IDCard],"
         + "[Nepabill],[Mandate],[Resoform],[introform],[CACform],[DateCreated],[DateModified]) values('?,?,?,?,?,?,?,?,?,?,?,?,?')";
  String query2="" ;

 if(jLabelform.getText().equalsIgnoreCase("ATMForm")){
        query1="INSERT INTO [KYC].[dbo].[KYCtable] ([ClientID],[ATMForm],[DateCreated]) values(?,?,?)";
       query2="update KYCtable set ATMForm='"+jTextFieldform.getText()+"' ,DateModified='"+year+"-"+Smonth+"-"+Sday+" 00:00:00.000' where clientid='"+ jTextFieldID.getText()+"'" ;

 }
 else  if(jLabelform.getText().equalsIgnoreCase("Resolution")){
      query1="INSERT INTO [KYC].[dbo].[KYCtable] ([ClientID],[resoform],[DateCreated]) values(?,?,?)";
     query2="update KYCtable set Resoform='"+jTextFieldform.getText()+"' ,DateModified='"+year+"-"+Smonth+"-"+Sday+" 00:00:00.000'  where clientid='"+ jTextFieldID.getText()+"'" ;
 
 }
else  if(jLabelform.getText().equalsIgnoreCase("Personal data")){
     query1="INSERT INTO [KYC].[dbo].[KYCtable] ([ClientID],[PerData],[DateCreated]) values(?,?,?)";
     query2="update KYCtable set PerData='"+jTextFieldform.getText()+"' ,DateModified='"+year+"-"+Smonth+"-"+Sday+" 00:00:00.000'  where clientid='"+ jTextFieldID.getText()+"'" ;
 
 }
   else  if(jLabelform.getText().equalsIgnoreCase("NEPA BILL")){
       query1="INSERT INTO [KYC].[dbo].[KYCtable] ([ClientID],[Nepabill],[DateCreated]) values(?,?,?)";
     query2="update KYCtable set Nepabill='"+jTextFieldform.getText()+"' ,DateModified='"+year+"-"+Smonth+"-"+Sday+" 00:00:00.000'  where clientid='"+ jTextFieldID.getText()+"'" ;
 
 }      
 else  if(jLabelform.getText().equalsIgnoreCase("Sign Form")){
      query1="INSERT INTO [KYC].[dbo].[KYCtable] ([ClientID],[SignForm],[DateCreated]) values(?,?,?)";
    
     query2="update KYCtable set SignForm='"+jTextFieldform.getText()+"' ,DateModified='"+year+"-"+Smonth+"-"+Sday+" 00:00:00.000'  where clientid='"+ jTextFieldID.getText()+"'" ;
 
 }
 else  if(jLabelform.getText().equalsIgnoreCase("Application Letter")){
     
     query1="INSERT INTO [KYC].[dbo].[KYCtable] ([ClientID],[AppLet],[DateCreated]) values(?,?,?)";

     query2="update KYCtable set AppLet='"+jTextFieldform.getText()+"' ,DateModified='"+year+"-"+Smonth+"-"+Sday+" 00:00:00.000'  where clientid='"+ jTextFieldID.getText()+"'" ;
 
 }
 else  if(jLabelform.getText().equalsIgnoreCase("Corporate Affairs")){
     query1="INSERT INTO [KYC].[dbo].[KYCtable] ([ClientID],[CACForm],[DateCreated]) values(?,?,?)";

     query2="update KYCtable set CACForm='"+jTextFieldform.getText()+"' ,DateModified='"+year+"-"+Smonth+"-"+Sday+" 00:00:00.000'  where clientid='"+ jTextFieldID.getText()+"'" ;
 
 }
 else  if(jLabelform.getText().equalsIgnoreCase("ID Card")){
      query1="INSERT INTO [KYC].[dbo].[KYCtable] ([ClientID],[IDCard],[DateCreated]) values(?,?,?)";

     query2="update KYCtable set IDCARD='"+jTextFieldform.getText()+"' ,DateModified='"+year+"-"+Smonth+"-"+Sday+" 00:00:00.000'  where clientid='"+ jTextFieldID.getText()+"'" ;
 
 }
 else  if(jLabelform.getText().equalsIgnoreCase("Intro Form")){
     query1="INSERT INTO [KYC].[dbo].[KYCtable] ([ClientID],[introform],[DateCreated]) values(?,?,?)";

     query2="update KYCtable set introform='"+jTextFieldform.getText()+"' ,DateModified='"+year+"-"+Smonth+"-"+Sday+" 00:00:00.000'  where clientid='"+ jTextFieldID.getText()+"'" ;
 
 }
 else  if(jLabelform.getText().equalsIgnoreCase("Mandate")){
     query1="INSERT INTO [KYC].[dbo].[KYCtable] ([ClientID],[Mandate],[DateCreated]) values(?,?,?)";

      
     query2="update KYCtable set Mandate='"+jTextFieldform.getText()+"' ,DateModified='"+year+"-"+Smonth+"-"+Sday+" 00:00:00.000'  where clientid='"+ jTextFieldID.getText()+"'" ;
 
 }
 else  if(jLabelform.getText().equalsIgnoreCase("Signature Card")){
     query1="INSERT INTO [KYC].[dbo].[KYCtable] ([ClientID],[SC],[DateCreated]) values(?,?,?)";

     query2="update KYCtable set SC='"+jTextFieldform.getText()+"' ,DateModified='"+year+"-"+Smonth+"-"+Sday+" 00:00:00.000'  where clientid='"+ jTextFieldID.getText()+"'" ;
 
 }
  
try{
   
 
pstmt=conn.prepareStatement(query1);//insert into kyctable
pstmt.setString(1, jTextFieldID.getText());
pstmt.setString(2, jTextFieldform.getText());
pstmt.setString(3, year+"-"+Smonth+"-"+Sday+" 00:00:00.000");

pstmt.executeUpdate();


conn.close(); 
JOptionPane.showMessageDialog(this, "Completed Successfully");
}
catch(Exception e){
    //JOptionPane.showMessageDialog(this, e.getMessage());
if(e.getMessage().contains("PRIMARY KEY")){
try{
pstmt=conn.prepareStatement(query2);
pstmt.executeUpdate();
JOptionPane.showMessageDialog(this, "Updated Successfully");
}
catch(Exception ex){JOptionPane.showMessageDialog(this, ex.getMessage());}
}
//JOptionPane.showMessageDialog(this, e.getMessage());
}
this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jTextFieldIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDKeyTyped
jButtonupdate.setEnabled(true);
    }//GEN-LAST:event_jTextFieldIDKeyTyped

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

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
            java.util.logging.Logger.getLogger(Updateform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Updateform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Updateform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Updateform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Updateform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonsearch1;
    public javax.swing.JButton jButtonsearch2;
    public javax.swing.JButton jButtonsearch3;
    private javax.swing.JButton jButtonupdate;
    public javax.swing.JLabel jLabelClient;
    public javax.swing.JLabel jLabelPhone;
    public javax.swing.JLabel jLabelPhoto;
    public javax.swing.JLabel jLabelSign;
    public javax.swing.JLabel jLabelform;
    private javax.swing.JLabel jLabelpreview;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextFieldID;
    public javax.swing.JTextField jTextFieldPhone;
    public javax.swing.JTextField jTextFieldSign;
    public javax.swing.JTextField jTextFieldform;
    public javax.swing.JTextField jTextFieldphoto;
    // End of variables declaration//GEN-END:variables
String pixpath,pixpath2,pixpath3;

}
