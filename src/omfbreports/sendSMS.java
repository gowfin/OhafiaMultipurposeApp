/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omfbreports;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Emmanuel Ikpe
 */
public class sendSMS {
    public void getAcc(String trxtype,String acc,String gl, double amount,String text,String sesdate){
        Global glob = new Global();
        Connection conn = glob.getConnect();
        String SQL="select SUM(amount) bal,RTRIM(LEFT(GETDATE(),22)) dt from memtrans " +
" where ac_no='"+acc+"' and gl_no='"+gl+"'";
        String SQL2="SELECT  Mobile FROM SMSSET  WHERE Branch = 100 AND GL_No = '"+gl+"' AND AC_No ='"+acc+"' AND DRCRALERT = 1 ";
              String DRCR="CR",time,mobile,msg;
              String TrxDRCR="DR";
              if(trxtype.equalsIgnoreCase("Credit")){TrxDRCR="CR";}
        Double Bal;
        try{
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet current = stmt.executeQuery(SQL);
        /* SMS Settings */
	current.next();
        
        Bal=current.getDouble("bal");
        time=current.getString("dt");
	if (current.getDouble("bal")<=0){DRCR="CR";}
        else{DRCR="DR";}
	
	 ResultSet current2 = stmt.executeQuery(SQL2);	
	   if( current2.next()){
            mobile=current2.getString("mobile").trim();
	msg =  "OMFB "+trxtype+" Alert A/C No.: "+gl+".***"+acc.substring(3)+"  Amt: "+amount+" "+TrxDRCR+" Details:"+text +" "+time +" Avail Bal: "+Math.abs(Bal)+" "+DRCR  ;      
        
    
	//msg = msg.substring(0,-160);
        //JOptionPane.showMessageDialog(null, msg+" and "+sesdate);
         String SQL3="INSERT INTO SMSHIST (BRANCH,Mobile,SCODE,RMessage,RDATE, MSTATUS,SES_DATE,SMESSAGE,SDATE,GL_FR,AC_FR,GL_TO,AC_TO,Cycle,Amount,SentReply,SysInfo) " +
" VALUES (100,'"+mobile+"','DRCR','','"+sesdate+"','','"+sesdate+"','"+msg+"','"+sesdate+"','"+gl+"','"+acc+"','','',0,0,0,'')";
 PreparedStatement pstmt1=conn.prepareStatement(SQL3);
      
 pstmt1.executeUpdate();
 // System.out.print(SQL3);
 //JOptionPane.showMessageDialog(null, SQL3);
                              }
        
                }
        catch(SQLException e){JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
}
