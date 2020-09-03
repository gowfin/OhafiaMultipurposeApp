/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package omfbreports;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.BufferedReader;

import java.io.StringReader;

/**
 *
 * @author Emma
 */
public class OutputPrinter implements Printable{

    @Override
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
        if (page>0){
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d=(Graphics2D)g;
        int x=(int)pf.getImageableX();
        int y=(int)pf.getImageableY();
        g2d.translate(y, y);
        Font font=new Font("Serif",Font.PLAIN,14);
        FontMetrics metrics=g.getFontMetrics(font);
        int lineHeight=metrics.getHeight();
        BufferedReader br=new BufferedReader(new StringReader(printData));
        try{
       String line;
       x+=100;
        x+=100;
        while((line=br.readLine())!=null){
            y+=lineHeight;
            g2d.drawString(line, x, y);
        
        }
        
        }
        catch(Exception e){
        }
        return PAGE_EXISTS;
    }
 private String printData;
 public OutputPrinter(String printDataIn)
 {
     this.printData=printDataIn;
 }
}
