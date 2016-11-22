import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.io.*;

public class ChShloka{

               
                  JFrame ChShjf = new JFrame ();
		  Toolkit toolkit = ChShjf.getToolkit();
		  Dimension screenSize = toolkit.getScreenSize ();
                  private Border border = BorderFactory.createRaisedBevelBorder ();
                  
                          
                           private int
				   screenWidth = screenSize.width,
				   screenHeight = screenSize.height,
				   xLoc_ChShP1_JPanel = (int) (screenWidth * 0.01),
				   yLoc_ChShP1_JPanel= (int) (screenHeight * 0.025),
				   width_ChShP1_JPanel = (int) (screenWidth * 0.77),
				   height_ChShP1_JPanel= (int) (screenHeight * 0.875),
				  
                                   xLoc_ChShP2_JPanel = (int) (screenWidth * 0.79),
				   yLoc_ChShP2_JPanel= (int) (screenHeight * 0.025),
				   width_ChShP2_JPanel = (int) (screenWidth * 0.19),
				   height_ChShP2_JPanel= (int) (screenHeight * 0.875);
                                   
                                   
				   
				   private ChShlokaPanel1 ChShP1;
				   private ChShlokaPanel2 ChShP2;
                                   
                                  
                                  
      ChShloka(){
           ChShjf.setBounds (0, 0, screenWidth, screenHeight);
				    ChShjf.setTitle ("SRIMAD BHAGAVAD GITA");
				    ChShjf.setLayout (null);
                                    
				    ChShP1 = new ChShlokaPanel1();
				    ChShP2 = new ChShlokaPanel2();
                                    
                                   
                                   
                                    ChShP1.setBounds( xLoc_ChShP1_JPanel, yLoc_ChShP1_JPanel,
                                                     width_ChShP1_JPanel, height_ChShP1_JPanel);
                                    ChShP2.setBounds(xLoc_ChShP2_JPanel, yLoc_ChShP2_JPanel,
                                                     width_ChShP2_JPanel, height_ChShP2_JPanel);
                                    
                                   
                                    
                                  
                                    ChShjf.add (ChShP1);
				    ChShjf.add (ChShP2);
                                   
				    ChShjf.setVisible (true);
      }
      
      
    
      public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                 new ChShloka();
            }
        } );
    }
    }


