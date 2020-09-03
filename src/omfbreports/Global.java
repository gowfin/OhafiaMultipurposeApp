package omfbreports;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emma
 */
public class Global {
    private Component JCalendar;
  
  public void setAns(int i,char Ans){
      Answer[i]=Ans;     
  }  
     public char getAns(int i){
      return Answer[i];     
  }
     
     public char getCOpt(int i){
      return Coption[i];     
  }
    
    
  public boolean checkHoliday(String ScheduleDate){
       boolean isHoliday=false; 
      
      for(int tt=0;tt<numberOfholidays;tt++){
                 if(holidays[tt].equalsIgnoreCase(ScheduleDate.substring(0, 5))){
               isHoliday=true;
                break;
                 }                                        
      }
      return isHoliday;     
  }  
    public void setIp(String ip ){
      IP=ip;     
  } 
    public String getIp( ){
      return IP;     
  }
     
    public String getIDFormat(int id ){
        String ID=id+"";
        if(id<10){ID="000"+id;}
        else if(id<100){ID="00"+id;}
        else if(id<1000){ID="0"+id;}
      return ID;     
  }
   
     public boolean checkNumerictype(String type ){
        boolean numeric;
        if(type.equalsIgnoreCase("Numeric")||type.equalsIgnoreCase("Formula")){numeric=true;}
        else 
        {numeric=false;}
      return numeric;     
  }
    public Connection getConnect( ){
        //Declare path for the config file
         String path="config.auc",aline,Server="",Dbname="",user="",pwd="";



        try{
            File file=new File(path);
        FileReader file_to_read=new FileReader(file);
        BufferedReader bf=new BufferedReader(file_to_read);
        
       aline=bf.readLine();
       // while((aline=bf.readLine())!=null){
            
          //JOptionPane.showMessageDialog(null,aline);
          
          //}
        int count =0,lasti=0;
         bf.close(); 
         for(int i=0; i<=aline.length();i++){
            if( aline.substring(i, i+1).equalsIgnoreCase(";") && count==0){
            Server=aline.substring(0, i); 
            OsServer=Server;
            count=1;
            lasti=i+1;//to omit ";"
            }
            else if( aline.substring(i, i+1).equalsIgnoreCase(";") && count==1){
            Dbname=aline.substring(lasti, i); 
            count=2;
            lasti=i+1;//to omit ";"

            }
            else if( aline.substring(i, i+1).equalsIgnoreCase(";") && count==2){
            user=aline.substring(lasti, i); 
            count=3;
            lasti=i+1;//to omit ";"

            }
             if( count==3){// count ==3 means only pwd left
            pwd=aline.substring(lasti); 
            count=0;
           aline="";//to remove the selected parameter

            }
         }
         // JOptionPane.showMessageDialog(null,aline+": "+Server+Dbname+user+pwd);
         //convert ip address if any to Server Name
if(OsServer.contains(".")){
    InetAddress host = InetAddress.getByName(OsServer);
                    OsServer=host.getCanonicalHostName();
                    Server=OsServer;
                    
           
                           }
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex.getMessage());
       
        }   
        String url =  "jdbc:sqlserver://"+Server+"\\SQLEXPRESS:1433;databaseName="+Dbname;
             
Connection conn=null;

try
{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     conn = DriverManager.getConnection(url, user, pwd);


}catch(Exception e){
 JOptionPane.showMessageDialog(JCalendar, e.getMessage());
}
      return conn;     
  }
  ///////
    public Connection getConnectkyc( ){
        //Declare path for the config file
         String path="config.kyc",aline,Server="",Dbname="",user="",pwd="";



        try{
            File file=new File(path);
        FileReader file_to_read=new FileReader(file);
        BufferedReader bf=new BufferedReader(file_to_read);
        
       aline=bf.readLine();
       // while((aline=bf.readLine())!=null){
            
          //JOptionPane.showMessageDialog(null,aline);
          
          //}
        int count =0,lasti=0;
         bf.close(); 
         for(int i=0; i<=aline.length();i++){
            if( aline.substring(i, i+1).equalsIgnoreCase(";") && count==0){
            Server=aline.substring(0, i); 
            count=1;
            lasti=i+1;//to omit ";"
            }
            else if( aline.substring(i, i+1).equalsIgnoreCase(";") && count==1){
            Dbname=aline.substring(lasti, i); 
            count=2;
            lasti=i+1;//to omit ";"

            }
            else if( aline.substring(i, i+1).equalsIgnoreCase(";") && count==2){
            user=aline.substring(lasti, i); 
            count=3;
            lasti=i+1;//to omit ";"

            }
             if( count==3){// count ==3 means only pwd left
            pwd=aline.substring(lasti); 
            count=0;
           aline="";//to remove the selected parameter

            }
         }
         // JOptionPane.showMessageDialog(null,aline+": "+Server+Dbname+user+pwd);

        }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex.getMessage());
       
        }
    String url =  "jdbc:sqlserver://"+Server+"\\SQLEXPRESS:1433;databaseName="+Dbname;
             
Connection conn=null;

try
{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     conn = DriverManager.getConnection(url, user, pwd);


}catch(Exception e){
 JOptionPane.showMessageDialog(JCalendar, e.getMessage());
}
      return conn;     
  }
    /////////
    
 
 
 
 
  public String getDbName(){
     return Dbase;
 }
 public void setDbName(String DatabaseName){
 Dbase=DatabaseName;    
 }
 public void getHolidays(){
    String path="holidays.txt",aline;
numberOfholidays=0;


        try{
            File file=new File(path);
        FileReader file_to_read=new FileReader(file);
        BufferedReader bf=new BufferedReader(file_to_read);
        
       
        while((aline=bf.readLine())!=null){
            
           
          holidays[numberOfholidays]=aline;
          //JOptionPane.showMessageDialog(this,holidays);
            
          numberOfholidays++; 
        }
        
         bf.close(); 
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex.getMessage());
       
        }     
 }
  public void setBal(double bal ){
     Balance=bal; 
      
  } 
    public double getBal( ){
     return Balance;     
  }
    public void license(){
     String query="select * from license";
     SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
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
        String today=year+"-"+Smonth+"-"+Sday+" 00:00:00.000";
       
      try{
          Date todaydate= new SimpleDateFormat("yyyy-MM-dd").parse(today);
           Global glob= new Global();
     Connection conn=glob.getConnect(); 

 Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet current = stmt.executeQuery(query);
         current.next();
         
         Date lastlogin = new SimpleDateFormat("yyyy-MM-dd").parse(current.getString("lastlogin"));
        long diff= (todaydate.getTime()-lastlogin.getTime())/(24*3600000);
           // JOptionPane.showMessageDialog(JCalendar,lastlogin.getTime()/(24*3600000));
            //JOptionPane.showMessageDialog(JCalendar,todaydate.getTime()/(24*3600000));
        //JOptionPane.showMessageDialog(JCalendar,diff);
        
        if(current.getString("licenseStatus").equalsIgnoreCase("expired")||current.getInt("Daysused")>=current.getInt("Duration")){
        JOptionPane.showMessageDialog(JCalendar, "License expired Call: 07033314962");
        System.exit(0);
        }
        else if(current.getDate("expiryDate").after(todaydate)){
              
                         if(diff>0){// for forwarding counting of days
                         String query2="update license set DaysUsed= DaysUsed+"+diff+", lastlogin='"+sdf.format(todaydate)+"'";
                         PreparedStatement pstmt;
                         pstmt=conn.prepareStatement(query2);
                         pstmt.executeUpdate();
                         }
                         
                       
          }else{
               String query2="update license set licensestatus= 'expired'";
                         PreparedStatement pstmt;
                         pstmt=conn.prepareStatement(query2);
                         pstmt.executeUpdate();
              JOptionPane.showMessageDialog(JCalendar, "License expired Call: 07033314962");
              System.exit(0);
          }
       
      }
      catch(Exception e){JOptionPane.showMessageDialog(JCalendar, e.getMessage());}
    }
    public void withdrawDeposit(double withdramount,String bal,String ID,String name){
        String Smonth,Sday;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
 Date cdate = new Date();
  String strnow=sdf.format(cdate);

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
        String query1="update glbal set Glbdebit=Glbdebit+"+withdramount+" where CoaNbr='24101-547' and GlbFinyear='C'"
        + " and glbPeriod='"+Smonth+"'";
String query2="update glbal set GlbCredit=GlbCredit+"+withdramount+" where CoaNbr='11102-547' and GlbFinyear='C'"
  + " and glbPeriod='"+Smonth+"'";
  //convert amount to negative because you are lessing as below:

withdramount=-withdramount;String tranid="005";
String query3="update Deposit  set RunningBal=RunningBal"+BigDecimal.valueOf(withdramount).setScale(2, RoundingMode.HALF_UP)+" where AccountID='"+ID+"'";
String query4=("insert into transactn (AccountID,tranid,Amount,DebitGL,CreditGL,Runningbal,ValueDate,DateEffective,CustNO,StmtRef,BranchID,ChequeNbr,CreatedBy)"
        + " values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

  //String PayBal=jTablePayment.getModel().getValueAt(jTablePayment.getSelectedRow(),2).toString();
       
     
        try{
  String url =  "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=BankDatabase";
         
      Global glob = new Global();
Connection conn= glob.getConnect();       

   
 conn.setAutoCommit(false);//for transaction posting

  PreparedStatement pstmt;
 
pstmt=conn.prepareStatement(query1);
pstmt.executeUpdate();
 
pstmt=conn.prepareStatement(query2);
pstmt.executeUpdate();


pstmt=conn.prepareStatement(query3);
pstmt.executeUpdate();
pstmt=conn.prepareStatement(query4);
 
pstmt.setString(1,ID);
pstmt.setString(2,tranid);
pstmt.setString(3,Math.abs(withdramount)+"");
pstmt.setString(4,"11102-547");
pstmt.setString(5,"31300");
Double curbal=Double.parseDouble(bal)+withdramount;
pstmt.setString(6,BigDecimal.valueOf(curbal).setScale(i, RoundingMode.HALF_UP)+"");

pstmt.setString(7,strnow);
pstmt.setString(8,strnow);
pstmt.setString(9,ID);
pstmt.setString(10,"Auto-Withdr");

//JOptionPane.showMessageDialog(this,jTextFieldDescription.getToolTipText());
pstmt.setString(11,name);

pstmt.setString(12,"Auto-posted");

pstmt.setString(13,"System");
 
pstmt.executeUpdate();
 //JOptionPane.showMessageDialog(JCalendar, "ok");




         conn.commit();//transaction saved
 
}
   
catch(Exception e){
    JOptionPane.showMessageDialog(JCalendar, e.getMessage());
}
    }
    
    ////////////////////////////////////
    
    
    
    
      public void autorepay(double Repayamount,String bal,String ID,String name){
          PreparedStatement pstmt;
         int repaycount=0;
        String Smonth,Sday;
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
 Date cdate = new Date();
  String strnow=sdf.format(cdate);
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
        String query="select interestpercent from loans where loanid='"+ID+"'";
        
        Global glob= new Global();
     Connection conn=glob.getConnect();
     String SQL="select * from loanschedule where remark='P'  and loanID='"+ID+"'";
        try{
Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet current = stmt.executeQuery(SQL);
            current.next();
            repaycount=current.getInt("count");
            current.close();
         }catch(Exception e){JOptionPane.showMessageDialog(JCalendar, e.getMessage());}
     double intRatio=1;
        try{
           
          
Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet current = stmt.executeQuery(query);
         current.next();
       intRatio=Double.parseDouble(current.getString("interestpercent"));
        //JOptionPane.showMessageDialog(JCalendar,current.getString("interestpercent") );
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(JCalendar, e.getMessage());
        }
             BigDecimal bb =BigDecimal.valueOf(Repayamount).divide(BigDecimal.valueOf(intRatio));
               Double pamount =bb.doubleValue();
      Double intamount=Repayamount-pamount;
String query1="update glbal set GlbCredit=GlbCredit+"+BigDecimal.valueOf(pamount).setScale(2, RoundingMode.HALF_UP)+" where CoaNbr='13101-547' and GlbFinyear='C'"
        + " and glbPeriod='"+Smonth+"'";
String query1b="update glbal set GlbCredit=GlbCredit+"+BigDecimal.valueOf(intamount).setScale(2, RoundingMode.HALF_UP)+" where CoaNbr='31300' and GlbFinyear='C'"
        + " and glbPeriod='"+Smonth+"'";
String query2="update glbal set Glbdebit=Glbdebit+"+BigDecimal.valueOf(Repayamount).setScale(2, RoundingMode.HALF_UP)+" where CoaNbr='11102-547' and GlbFinyear='C'"
  + " and glbPeriod='"+Smonth+"'";

String query3="update loans set OutstandingBal=OutstandingBal+"+BigDecimal.valueOf(Repayamount).setScale(2, RoundingMode.HALF_UP).subtract(BigDecimal.valueOf(intamount).setScale(2, RoundingMode.HALF_UP))+" where loanID='"+ID+"'";
String query4=("insert into transactn (AccountID,tranid,Amount,DebitGL,CreditGL,Runningbal,ValueDate,DateEffective,custNo,StmtRef,BranchID,ChequeNbr,CreatedBy)"
        + " values(?,?,?,?,?,?,?,?,?,?,?,?,?)");


  //String PayBal=jTablePayment.getModel().getValueAt(jTablePayment.getSelectedRow(),2).toString();

       
        try{
  String url =  "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=BankDatabase";
     
     

   
 conn.setAutoCommit(false);//for transaction posting
pstmt=conn.prepareStatement(query1);//update loan  portfolio
pstmt.executeUpdate();
pstmt=conn.prepareStatement(query1b);//update interest income
pstmt.executeUpdate();

pstmt=conn.prepareStatement(query2);
pstmt.executeUpdate();
pstmt=conn.prepareStatement(query3);
pstmt.executeUpdate();

pstmt=conn.prepareStatement(query4);
pstmt.setString(1,ID);
pstmt.setString(2,"001");
pstmt.setString(3,Repayamount+"");
pstmt.setString(4,"11102-547");
pstmt.setString(5,"13101-547");
double curbal=Double.parseDouble(bal)-Repayamount+intamount;//bal is negative;so plus reduces the bal
pstmt.setString(6,BigDecimal.valueOf(curbal).setScale(i, RoundingMode.HALF_UP)+"");
pstmt.setString(7,strnow);
pstmt.setString(8,strnow);
pstmt.setString(9,ID);
pstmt.setString(10,"Sys-Repay");
//JOptionPane.showMessageDialog(this,jTextFieldDescription.getToolTipText());
pstmt.setString(11,name);
pstmt.setString(12,"auto-Posted");
pstmt.setString(13,"System");
pstmt.executeUpdate();


//updating for interest
pstmt=conn.prepareStatement(query4);
pstmt.setString(1,ID);
pstmt.setString(2,"011");
pstmt.setString(3,intamount+"");
pstmt.setString(4,"11102-547");
pstmt.setString(5,"31300");
pstmt.setString(6,BigDecimal.valueOf(curbal).setScale(i, RoundingMode.HALF_UP)+"");
pstmt.setString(7,strnow);
pstmt.setString(8,year+"-"+Smonth+"-"+Sday);
pstmt.setString(9,ID);
pstmt.setString(10,"Interest");
//JOptionPane.showMessageDialog(this,jTextFieldDescription.getToolTipText());
pstmt.setString(11,name);
pstmt.setString(12,"Auto-Post");
pstmt.setString(13,"System");
pstmt.executeUpdate();

String amount=Repayamount+"";
double AmountD=Double.parseDouble(amount);
String query5="";
String qq="";

while(AmountD>0 ){
 String query55="select * from loanschedule where remark='P' and loanID='"+ID+"'";
Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet current = stmt.executeQuery(query55);
        current.next();
        //check for presence of partial or none serviced condition
Double PplusInt,PrinNonserv,IntNonserv;
int count;
if(current.getString("status").equalsIgnoreCase("Partial")){
    PplusInt=current.getDouble("PrinRepay")-current.getDouble("servicedPrin")+current.getDouble("intRepay")-current.getDouble("servicedint");
PrinNonserv=current.getDouble("PrinRepay")-current.getDouble("servicedPrin");
IntNonserv=current.getDouble("intRepay")-current.getDouble("servicedInt");
count=current.getInt("count");//remain in thesame schedule,do not go next
}
else{PplusInt=current.getDouble("PrinRepay")+current.getDouble("intRepay");
PrinNonserv=current.getDouble("PrinRepay");
IntNonserv=current.getDouble("intRepay");
count=current.getInt("count");
}
if(AmountD>=PplusInt){
  query5="update loanschedule set status='Serviced',servicedprin=servicedprin+'"+PrinNonserv+"',"
        + "ServicedInt=ServicedInt+'"+IntNonserv+"',remark='D' where count='"+count +"'"
        + " and loanID='"+ID+"'";
  //check for last schedule item to avoid errors of updating unexisting row
  if(current.getDouble("RunningBal")>(current.getDouble("RepayWithInt")+1)){
 qq="update loanschedule set remark='P' where count='"+(current.getInt("count")+1)+"'";
                        }
  else{
       qq="update loanschedule set remark='P' where count='"+(current.getInt("count"))+"'";

  }
   AmountD=AmountD-PplusInt;
 //JOptionPane.showMessageDialog(this, "Amount= "+AmountD); 
}
else if (AmountD<PplusInt){
    if(AmountD>IntNonserv){
        double AmountR=AmountD-IntNonserv;
       query5="update loanschedule set status='Partial',servicedprin=servicedprin+'"+AmountR+"',"
        + "ServicedInt=ServicedInt+'"+IntNonserv+"',remark='P' where count='"+ (current.getInt("count"))+"'"
        + " and loanID='"+ID+"'";
        
   AmountD=AmountD-PplusInt;
   
    //JOptionPane.showMessageDialog(this, "Amount= "+AmountD); 
          }
   else{  
        
    query5="update loanschedule set status='Partial',"
        + "ServicedInt=ServicedInt+'"+AmountD+"',remark='P' where count='"+ (current.getInt("count")) +"'"
        + " and loanID='"+ID+"'";
            
 //JOptionPane.showMessageDialog(this, "Amount= "+AmountD); 
    AmountD=0;
    repaycount=repaycount+1;
    }
}
pstmt=conn.prepareStatement(query5);
pstmt.executeUpdate();
   pstmt=conn.prepareStatement(qq);
pstmt.executeUpdate();
      
}
         conn.commit();//transaction saved
 
}
   
catch(Exception e){ JOptionPane.showMessageDialog(JCalendar, e.getMessage());
   }
}
          // TODO add your handling code here:
   
      
    
  public char[]  Coption=new char[200];  
  public char[]  Answer=new char[200];
  public int[]  question=new int[200];
  public int[]  optionA=new int[200];
  public int[]  optionB=new int[200];
  public int[]  optionC=new int[200];
  public int[]  optionD=new int[200];
  public int[]  optionE=new int[200];
  public int[]  ReviewQ=new int[200];
  public int[]  Unanswer=new int[200];
  String[] DbaseQ= new String[100];
  String[] OffsetQ= new String[100];
  String[] holidays= new String[100];
  int numberOfholidays;
  public String StudentName=null;
  public String IP;
  public static int i=0;
  public  double Balance=0;
 public static double SumDebit=0;
 public static double SumCredit=0;
 public static boolean edit=false;
 public static String Dbase="BankDatabase";
 public String OsServer ; 
}
