import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.io.*;



public class Bg2{
 
                  JFrame Bg2jf = new JFrame ();
		  Toolkit toolkit = Bg2jf.getToolkit();
		  Dimension screenSize = toolkit.getScreenSize ();
                  private Border border = BorderFactory.createRaisedBevelBorder ();
                  private int
				   screenWidth = screenSize.width,
				   screenHeight = screenSize.height,
				  xLoc_Bg2P1_JPanel = (int) (screenWidth * 0.01),
				   yLoc_Bg2P1_JPanel= (int) (screenHeight * 0.025),
				   width_Bg2P1_JPanel = (int) (screenWidth * 0.19),
				   height_Bg2P1_JPanel= (int) (screenHeight * 0.875),
				   xLoc_Bg2P2_JPanel = (int) (screenWidth * 0.21),
				   yLoc_Bg2P2_JPanel = (int) (screenHeight * 0.025),
				   width_Bg2P2_JPanel = (int) (screenWidth * 0.57),
				   height_Bg2P2_JPanel = (int) (screenHeight * 0.83),
                                   xLoc_Bg2P3_JPanel = (int) (screenWidth * 0.79),
				   yLoc_Bg2P3_JPanel= (int) (screenHeight * 0.025),
				   width_Bg2P3_JPanel = (int) (screenWidth * 0.19),
				   height_Bg2P3_JPanel= (int) (screenHeight * 0.875),
				   xLoc_Bg2P4_JPanel = (int) (screenWidth * 0.21),
				   yLoc_Bg2P4_JPanel = (int) (screenHeight * 0.865),
				   width_Bg2P4_JPanel = (int) (screenWidth * 0.57),
				   height_Bg2P4_JPanel = (int) (screenHeight * 0.10);
				   
				   private SecondScreenPanel1 Bg2P1;
				   private SecondScreenPanel2 Bg2P2;
                                   private SecondScreenPanel3 Bg2P3;
				   private SecondScreenPanel4 Bg2P4;
                                  
      Bg2(){
           Bg2jf.setBounds (0, 0, screenWidth, screenHeight);
				    Bg2jf.setTitle ("SRIMAD BHAGAVAD GITA");
				    Bg2jf.setLayout (null);
				    Bg2P1 = new SecondScreenPanel1();
				    Bg2P2 = new SecondScreenPanel2();
                                    Bg2P3 = new SecondScreenPanel3();
				    Bg2P4 = new SecondScreenPanel4();
                                   
                                   
                                     
                                    
                                     Bg2P1.setBounds( xLoc_Bg2P1_JPanel, yLoc_Bg2P1_JPanel,
                                                     width_Bg2P1_JPanel, height_Bg2P1_JPanel);
                                   Bg2P2.setBounds(xLoc_Bg2P2_JPanel, yLoc_Bg2P2_JPanel,
                                                     width_Bg2P2_JPanel, height_Bg2P2_JPanel);
                                    Bg2P3.setBounds( xLoc_Bg2P3_JPanel, yLoc_Bg2P3_JPanel,
                                                     width_Bg2P3_JPanel, height_Bg2P3_JPanel);
                                    Bg2P4.setBounds(xLoc_Bg2P4_JPanel, yLoc_Bg2P4_JPanel,
                                                     width_Bg2P4_JPanel, height_Bg2P4_JPanel);
                                    Bg2jf.add (Bg2P1);
				    Bg2jf.add (Bg2P2);
                                    Bg2jf.add (Bg2P3);
				    Bg2jf.add (Bg2P4);
				    Bg2jf.setVisible (true);
      }
      
      
       
      public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                 new Bg2();
            }
        } );
    }
    }
