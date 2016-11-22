import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.io.*;

public class ChShlokaWM{

               
                  JFrame ChShWMjf = new JFrame ();
		  Toolkit toolkit = ChShWMjf.getToolkit();
		  Dimension screenSize = toolkit.getScreenSize ();
                  private Border border = BorderFactory.createRaisedBevelBorder ();
                  
                          
                           private int
				   screenWidth = screenSize.width,
				   screenHeight = screenSize.height,
				   xLoc_ChShWMP1_JPanel = (int) (screenWidth * 0.01),
				   yLoc_ChShWMP1_JPanel= (int) (screenHeight * 0.025),
				   width_ChShWMP1_JPanel = (int) (screenWidth * 0.967),
				   height_ChShWMP1_JPanel= (int) (screenHeight * 0.875);
				   
                            
				   private ChShlokaWMPanel1 ChShWMP1;
				  
                                                 
      ChShlokaWM(){
           ChShWMjf.setBounds (0, 0, screenWidth, screenHeight);
				    ChShWMjf.setTitle ("SRIMAD BHAGAVAD GITA");
				    ChShWMjf.setLayout (null);
				    ChShWMP1 = new ChShlokaWMPanel1();
				    
                                
                                    ChShWMP1.setBounds( xLoc_ChShWMP1_JPanel, yLoc_ChShWMP1_JPanel,
                                                     width_ChShWMP1_JPanel, height_ChShWMP1_JPanel);
                                    
                                    ChShWMjf.add (ChShWMP1);
				    
				    ChShWMjf.setVisible (true);
      }
      
 
    
      public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                 new ChShlokaWM();
            }
        } );
    }
    }


