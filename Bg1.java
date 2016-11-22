import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;



public class Bg1{
                  MyRunner myRunner = new MyRunner(); 
                  Thread myThread = new Thread(myRunner);
                 
                  
                  JFrame Bg1jf = new JFrame ();
		  Toolkit toolkit = Bg1jf.getToolkit();
		  Dimension screenSize = toolkit.getScreenSize ();
                  private Border border = BorderFactory.createRaisedBevelBorder ();
                  private int
                                   temp,play=0,
				   screenWidth = screenSize.width,
				   screenHeight = screenSize.height,
                          
				   xLoc_Bg1P1_JPanel = (int) (screenWidth * 0.01),
				   yLoc_Bg1P1_JPanel= (int) (screenHeight * 0.015),
				   width_Bg1P1_JPanel = (int) (screenWidth * 0.97),
				   height_Bg1P1_JPanel= (int) (screenHeight * 0.885),
				   
                                   xLoc_Bg2P1_JPanel = (int) (screenWidth * 0.01),
				   yLoc_Bg2P1_JPanel= (int) (screenHeight * 0.015),
				   width_Bg2P1_JPanel = (int) (screenWidth * 0.19),
				   height_Bg2P1_JPanel= (int) (screenHeight * 0.885),
				   xLoc_Bg2P2_JPanel = (int) (screenWidth * 0.21),
				   yLoc_Bg2P2_JPanel = (int) (screenHeight * 0.015),
				   width_Bg2P2_JPanel = (int) (screenWidth * 0.57),
				   height_Bg2P2_JPanel = (int) (screenHeight * 0.83),
                                   xLoc_Bg2P3_JPanel = (int) (screenWidth * 0.79),
				   yLoc_Bg2P3_JPanel= (int) (screenHeight * 0.015),
				   width_Bg2P3_JPanel = (int) (screenWidth * 0.186),
				   height_Bg2P3_JPanel= (int) (screenHeight * 0.885),
				   xLoc_Bg2P4_JPanel = (int) (screenWidth * 0.21),
				   yLoc_Bg2P4_JPanel = (int) (screenHeight * 0.855),
				   width_Bg2P4_JPanel = (int) (screenWidth * 0.57),
				   height_Bg2P4_JPanel = (int) (screenHeight * 0.045),
                          
                          	   xLoc_ChShP1_JPanel = (int) (screenWidth * 0.01),
				   yLoc_ChShP1_JPanel= (int) (screenHeight * 0.015),
				   width_ChShP1_JPanel = (int) (screenWidth * 0.77),
				   height_ChShP1_JPanel= (int) (screenHeight * 0.885), 
                                   xLoc_ChShP2_JPanel = (int) (screenWidth * 0.79),
				   yLoc_ChShP2_JPanel= (int) (screenHeight * 0.015),
				   width_ChShP2_JPanel = (int) (screenWidth * 0.186),
				   height_ChShP2_JPanel= (int) (screenHeight * 0.885),
                  
                                   xLoc_ChShWMP1_JPanel = (int) (screenWidth * 0.01),
				   yLoc_ChShWMP1_JPanel= (int) (screenHeight * 0.015),
				   width_ChShWMP1_JPanel = (int) (screenWidth * 0.967),
				   height_ChShWMP1_JPanel= (int) (screenHeight * 0.885);
                  
                                   private static final int BUFFER_SIZE = 4096;
                                   private int[] s={47,72,43,42,29,47,30,28,35,42,55,20,35,27,20,24,28,78};
				   
				   private Panel1 Bg1P1;
				   
                                   
                                   private SecondScreenPanel1 Bg2P1;
				   private SecondScreenPanel2 Bg2P2;
                                   private SecondScreenPanel3 Bg2P3;
				   private SecondScreenPanel4 Bg2P4;
                                   
                                   private ChShlokaPanel1 ChShP1;
				   private ChShlokaPanel2 ChShP2;
                                   private ChShlokaPanel2_1 ChShP2_1;
                                   private ChShlokaWMPanel1 ChShWMP1;
                                   
                                   String[] c1={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29","Shloka 30","Shloka 31","Shloka 32","Shloka 33","Shloka 34","Shloka 35","Shloka 36"
              ,"Shloka 37","Shloka 38","Shloka 39","Shloka 40","Shloka 41","Shloka 42","Shloka 43","Shloka 44","Shloka 45","Shloka 46","Shloka 47"};
	      String[] c2={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29","Shloka 30","Shloka 31","Shloka 32","Shloka 33","Shloka 34","Shloka 35","Shloka 36"
              ,"Shloka 37","Shloka 38","Shloka 39","Shloka 40","Shloka 41","Shloka 42","Shloka 43","Shloka 44","Shloka 45","Shloka 46","Shloka 47","Shloka 48","Shloka 49",
              "Shloka 50","Shloka 51","Shloka 52","Shloka 53","Shloka 54","Shloka 55","Shloka 56","Shloka 57","Shloka 58"
              ,"Shloka 59","Shloka 60","Shloka 61","Shloka 62","Shloka 63","Shloka 64","Shloka 65","Shloka 66","Shloka 67","Shloka 68","Shloka 69","Shloka 70"
              ,"Shloka 71","Shloka 72" };
	      String[] c3={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29","Shloka 30","Shloka 31","Shloka 32","Shloka 33","Shloka 34","Shloka 35","Shloka 36"
              ,"Shloka 37","Shloka 38","Shloka 39","Shloka 40","Shloka 41","Shloka 42","Shloka 43"};
              String[] c4={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29","Shloka 30","Shloka 31","Shloka 32","Shloka 33","Shloka 34","Shloka 35","Shloka 36"
              ,"Shloka 37","Shloka 38","Shloka 39","Shloka 40","Shloka 41","Shloka 42"};
	      String[] c5={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29"};
	      String[] c6={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29","Shloka 30","Shloka 31","Shloka 32","Shloka 33","Shloka 34","Shloka 35","Shloka 36"
              ,"Shloka 37","Shloka 38","Shloka 39","Shloka 40","Shloka 41","Shloka 42","Shloka 43","Shloka 44","Shloka 45","Shloka 46" };
              String[] c7={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29","Shloka 30" };
	      String[] c8={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28" };
	      String[] c9={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29","Shloka 30","Shloka 31","Shloka 32","Shloka 33","Shloka 34" };
              String[] c10={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29","Shloka 30","Shloka 31","Shloka 32","Shloka 33","Shloka 34","Shloka 35","Shloka 36"
              ,"Shloka 37","Shloka 38","Shloka 39","Shloka 40","Shloka 41","Shloka 42" };
	      String[] c11={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29","Shloka 30","Shloka 31","Shloka 32","Shloka 33","Shloka 34","Shloka 35","Shloka 36"
              ,"Shloka 37","Shloka 38","Shloka 39","Shloka 40","Shloka 41","Shloka 42","Shloka 43","Shloka 44","Shloka 45","Shloka 46","Shloka 47","Shloka 48","Shloka 49",
              "Shloka 50","Shloka 51","Shloka 52","Shloka 53","Shloka 54","Shloka 55"};
	      String[] c12={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20" };
              String[] c13={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29","Shloka 30","Shloka 31","Shloka 32","Shloka 33","Shloka 34","Shloka 35" };
	      String[] c14={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27" };
	      String[] c15={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20" };
              String[] c16={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24" };
	      String[] c17={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28"};
	      String[] c18={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29","Shloka 30","Shloka 31","Shloka 32","Shloka 33","Shloka 34","Shloka 35","Shloka 36"
              ,"Shloka 37","Shloka 38","Shloka 39","Shloka 40","Shloka 41","Shloka 42","Shloka 43","Shloka 44","Shloka 45","Shloka 46","Shloka 47","Shloka 48","Shloka 49",
              "Shloka 50","Shloka 51","Shloka 52","Shloka 53","Shloka 54","Shloka 55","Shloka 56","Shloka 57","Shloka 58"
              ,"Shloka 59","Shloka 60","Shloka 61","Shloka 62","Shloka 63","Shloka 64","Shloka 65","Shloka 66","Shloka 67","Shloka 68","Shloka 69","Shloka 70"
              ,"Shloka 71","Shloka 72","Shloka 73","Shloka 74","Shloka 75","Shloka 76","Shloka 77","Shloka 78" };
                                   
                                 
      Bg1(){
           Bg1jf.setBounds (0, 0, screenWidth, screenHeight);
				    Bg1jf.setTitle ("SRIMAD BHAGAVAD GITA");
				    Bg1jf.setLayout (null);
                                      Bg1jf.setBackground(new Color(188,143,143));
				    Bg1P1 = new Panel1();
				   
                                    
                                    Bg2P1 = new SecondScreenPanel1();
				    Bg2P2 = new SecondScreenPanel2();
                                    Bg2P3 = new SecondScreenPanel3();
				    Bg2P4 = new SecondScreenPanel4();
                                    
                                    ChShP1 = new ChShlokaPanel1();
				    ChShP2 = new ChShlokaPanel2();
                                    ChShP2_1 = new ChShlokaPanel2_1();
                                    ChShWMP1= new ChShlokaWMPanel1();
                                    
                                    
                                    
                                    Bg1P1.setBounds( xLoc_Bg1P1_JPanel, yLoc_Bg1P1_JPanel,
                                                     width_Bg1P1_JPanel, height_Bg1P1_JPanel);
                                    
                                    
                                  
                                    Bg2P1.setBounds( xLoc_Bg2P1_JPanel, yLoc_Bg2P1_JPanel,
                                                     width_Bg2P1_JPanel, height_Bg2P1_JPanel);
                                    Bg2P2.setBounds(xLoc_Bg2P2_JPanel, yLoc_Bg2P2_JPanel,
                                                     width_Bg2P2_JPanel, height_Bg2P2_JPanel);
                                    Bg2P3.setBounds( xLoc_Bg2P3_JPanel, yLoc_Bg2P3_JPanel,
                                                     width_Bg2P3_JPanel, height_Bg2P3_JPanel);
                                    Bg2P4.setBounds(xLoc_Bg2P4_JPanel, yLoc_Bg2P4_JPanel,
                                                     width_Bg2P4_JPanel, height_Bg2P4_JPanel);
                                    
                                    ChShP1.setBounds( xLoc_ChShP1_JPanel, yLoc_ChShP1_JPanel,
                                                     width_ChShP1_JPanel, height_ChShP1_JPanel);
                                    ChShP2.setBounds(xLoc_ChShP2_JPanel, yLoc_ChShP2_JPanel,
                                                     width_ChShP2_JPanel, height_ChShP2_JPanel);
                                    ChShP2_1.setBounds(xLoc_ChShP2_JPanel, yLoc_ChShP2_JPanel,
                                                     width_ChShP2_JPanel, height_ChShP2_JPanel);
                                    
                                    ChShWMP1.setBounds( xLoc_ChShWMP1_JPanel, yLoc_ChShWMP1_JPanel,
                                                     width_ChShWMP1_JPanel, height_ChShWMP1_JPanel);
                                    
                                    
                                   
                                    
                                   Bg1P1.Bg1P1jb.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {Bg1toBg2 ();}});
                                   
                                   Bg2P4.Bg2P4jbB.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {Bg2toBg1 ();}});
                                   Bg2P1.jcb.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {combobox2 (e);}});
                                   Bg2P1.Bg2P1jbE.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {enter2 ();}});
                                   
                                   ChShP2.ChShP2jbN.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {nextshloka ();}});
                                   ChShP2.ChShP2jbH.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {home ();}});
                                   ChShP2.jcb.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {combobox3 (e);}});
                                   ChShP2. ChShP2jbE.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {enter3 ();}});
                                   
                                   ChShP2_1.ChShP2_1jbN.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {nextshloka ();}});
                                   ChShP2_1.ChShP2_1jbP.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {previousshloka ();}});
                                   ChShP2_1.ChShP2_1jbH.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {home ();}});
                                   ChShP2_1.jcb.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {combobox1 (e);}});
                                   ChShP2_1. ChShP2_1jbE.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {enter1 ();}});
                                   
                                   
                                    ChShP1.  ChShP1jbWM .addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {wordmeaning ();}});
                                    ChShP1.  ChShP1jbSTOP .addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {audiostop (e);}}); 
                                    ChShP1.  ChShP1jbPLAY .addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) { audioplay (e);}});
                                   ChShWMP1. ChShWMP1jbB.addActionListener (new ActionListener (){public void actionPerformed (ActionEvent e) {ChShWMtoChSh ();}});
                                   
                                   
                                   
                                   
                                  
                                   
                                   
                                   Bg1jf.add (Bg1P1);
				  
				   Bg1jf.setVisible (true);
                                    
      }
 public void setfalse(){
                                    Bg1P1.setVisible (false);
			                   
                                    Bg2P1.setVisible (false);
			            Bg2P2.setVisible (false);
                                    Bg2P3.setVisible (false);
				    Bg2P4.setVisible (false);
                                    ChShP1.setVisible (false);
				    ChShP2.setVisible (false);
                                    ChShP2_1.setVisible (false);
                                    ChShWMP1.setVisible (false);
                       }   
 
 public void add(){
                                        Bg1jf.add (Bg2P1);
					Bg1jf.add (Bg2P2);
					Bg1jf.add (Bg2P3);
                                        Bg1jf.add (Bg2P4);
 
                                        Bg1jf.add (ChShP1);
					Bg1jf.add (ChShP2);
                                        Bg1jf.add (ChShP2_1);
                                        Bg1jf.add (ChShWMP1);
                  }
      
  //next buttons    
 public void Bg1toBg2 ()
		        {
					
				        setfalse();
					add();
                                        
					Bg2P1.setVisible (true);
					Bg2P2.setVisible (true);
					Bg2P3.setVisible (true);
                                        Bg2P4.setVisible (true);
				}

 

 public void nextshloka ()
		        {
					
					setfalse();
					add();
                                        
					
                                        ChShP1.setVisible (true);
                                        if(ChShP1.shno+1<=s[ChShP1.chno-1])
                                        {
                                           ChShP1.shno++;
                                           ChShP1.repaint();
                                        }
                                        else
                                        {
                                            ChShP1.chno++;
                                            ChShP1.shno=1;
                                            ChShP1.repaint();
                                        }
                                        if(ChShP1.chno==1&&ChShP1.shno==1)
                                        {
                                          ChShP2.setVisible(true); 
                                        }
                                        else
                                        {
                                             ChShP2_1.setVisible(true); 
                                        }
                                       		
			}

 
 //next buttons
 
 
 //home buttons      
       public void Bg2toBg1 ()
		        {
					 setfalse();
					add();
                                        
					Bg1P1.setVisible (true);
					
			}
       
      
        public void home ()
		        {
					
					 setfalse();
					add();
                                        
					Bg2P1.setVisible (true);
					Bg2P2.setVisible (true);
					Bg2P3.setVisible (true);
                                        Bg2P4.setVisible (true);
				}
        
        
         
 //home buttons
          
 //previous buttons
           public void previousshloka ()
		        {
					
                                         setfalse();
					add();
					
					ChShP1.setVisible (true);
					if(ChShP1.shno>1)
                                        {
                                           ChShP1.shno--;
                                           ChShP1.repaint();
                                        }
                                        else
                                        {
                                           ChShP1.chno--;
                                           ChShP1.shno= s[ChShP1.chno-1];
                                           ChShP1.repaint();
                                        }
                                        if(ChShP1.chno==1&&ChShP1.shno==1)
                                        {
                                          ChShP2.setVisible(true); 
                                        }
                                        else
                                        {
                                             ChShP2_1.setVisible(true); 
                                        }
                                            
					
					
			}
            
//previous buttons
              
//word meaning buttons
              public void wordmeaning ()
		        {
					
                                         setfalse();
					add();
					
					ChShWMP1.setVisible (true);
                                        ChShWMP1.chno=ChShP1.chno;
                                        ChShWMP1.shno=ChShP1.shno;
					ChShWMP1.repaint();	
			}
              
        
//word meaning buttons 
              
//Back Buttons 
              public void ChShWMtoChSh ()
		        {
					
                                         setfalse();
					 add();
					
					ChShP1.setVisible (true);
					if(ChShP1.chno==1&&ChShP1.shno==1)
                                        {
                                          ChShP2.setVisible(true); 
                                        }
                                        else
                                        {
                                             ChShP2_1.setVisible(true); 
                                        }
                                        
					
			}
              
             
              
//Back Buttons 
//comboboxes
              
              public void combobox1(ActionEvent e)
              { 
                  
	
               try{
              if(e.getSource().equals(ChShP2_1.jcb))
			{
				String x=(String)ChShP2_1.jcb.getSelectedItem();
				ChShP2_1.jcb2.removeAllItems();
				if(x.charAt(x.length()-1)=='1' && x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c1.length;i++)
					ChShP2_1.jcb2.addItem(c1[i]);
				
				}
				if(x.charAt(x.length()-1)=='2'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c2.length;i++)
					ChShP2_1.jcb2.addItem(c2[i]);
				
				}
				if(x.charAt(x.length()-1)=='3'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c3.length;i++)
					ChShP2_1.jcb2.addItem(c3[i]);
				
				}
                                if(x.charAt(x.length()-1)=='4'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c4.length;i++)
					ChShP2_1.jcb2.addItem(c4[i]);
				
				}
                                if(x.charAt(x.length()-1)=='5'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c5.length;i++)
					ChShP2_1.jcb2.addItem(c5[i]);
				
				}
                                if(x.charAt(x.length()-1)=='6'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c6.length;i++)
					ChShP2_1.jcb2.addItem(c6[i]);
				
				}
                                if(x.charAt(x.length()-1)=='7'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c7.length;i++)
					ChShP2_1.jcb2.addItem(c7[i]);
				
				}
                                if(x.charAt(x.length()-1)=='8'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c8.length;i++)
					ChShP2_1.jcb2.addItem(c8[i]);
				
				}
                                if(x.charAt(x.length()-1)=='9'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c9.length;i++)
					ChShP2_1.jcb2.addItem(c9[i]);
				
				}
                                if(x.charAt(x.length()-1)=='0'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c10.length;i++)
					ChShP2_1.jcb2.addItem(c10[i]);
				
				}
                                if(x.charAt(x.length()-1)=='1'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c11.length;i++)
					ChShP2_1.jcb2.addItem(c11[i]);
				
				}
                                if(x.charAt(x.length()-1)=='2'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c12.length;i++)
					ChShP2_1.jcb2.addItem(c12[i]);
				
				}
                                if(x.charAt(x.length()-1)=='3'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c13.length;i++)
					ChShP2_1.jcb2.addItem(c13[i]);
				
				}
                                if(x.charAt(x.length()-1)=='4'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c14.length;i++)
					ChShP2_1.jcb2.addItem(c14[i]);
				
				}
                                if(x.charAt(x.length()-1)=='5'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c15.length;i++)
					ChShP2_1.jcb2.addItem(c15[i]);
				
				}
                                if(x.charAt(x.length()-1)=='6'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c16.length;i++)
					ChShP2_1.jcb2.addItem(c16[i]);
				
				}
                                if(x.charAt(x.length()-1)=='7'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c17.length;i++)
					ChShP2_1.jcb2.addItem(c17[i]);
				
				}
                                if(x.charAt(x.length()-1)=='8'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c18.length;i++)
					ChShP2_1.jcb2.addItem(c18[i]);
				
				}
                        
              }}catch(NullPointerException npe){}
               catch(RuntimeException re){}
               catch(Exception ex){}
              
              
              }
              
              public void enter1()
              {
                   try{
             
			       
                                        
                                        //System.out.println(1);
                                        String s=(String)ChShP2_1.jcb.getSelectedItem();
                                        //System.out.println(2);
                                        int i,l=s.length();
                                        String y="";
                                        String z="";
                                       // System.out.println(3);
                                       for(i=0;i<l;i++)
                                       {
                                         if(s.charAt(i)>='0'&&s.charAt(i)<='9')  
                                             y=y+s.charAt(i);
                                       }
                                       
                                         String p=(String)ChShP2_1.jcb2.getSelectedItem();
                                        l=p.length();
                                        //System.out.println(4);
                                       for(i=0;i<l;i++)
                                       {
                                         if(p.charAt(i)>='0'&&p.charAt(i)<='9')  
                                             z=z+p.charAt(i);
                                       }
				   	int n = Integer.parseInt(y);
                                        int m = Integer.parseInt(z);
                                        //System.out.println(y);
                                        ChShP1.chno=n;
                                        ChShP1.shno=m;
                                        setfalse();
                                        add();
                                        ChShP1.setVisible (true);
                                        ChShP1.repaint();
					if(ChShP1.chno==1&&ChShP1.shno==1)
                                        {
                                          ChShP2.setVisible(true); 
                                        }
                                        else
                                        {
                                             ChShP2_1.setVisible(true); 
                                        }
                                        ChShP2_1.jcb.setSelectedIndex(0);
                                        ChShP2_1.jcb2.setSelectedIndex(0);
			       
               }catch(NullPointerException npe){}
               catch(RuntimeException re){}
               catch(Exception ex){}
               
              }
              
               public void combobox2(ActionEvent e)
              { 
                  
	
               try{
              if(e.getSource().equals(Bg2P1.jcb))
			{
				String x=(String)Bg2P1.jcb.getSelectedItem();
				Bg2P1.jcb2.removeAllItems();
				if(x.charAt(x.length()-1)=='1' && x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c1.length;i++)
					Bg2P1.jcb2.addItem(c1[i]);
				
				}
				if(x.charAt(x.length()-1)=='2'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c2.length;i++)
					Bg2P1.jcb2.addItem(c2[i]);
				
				}
				if(x.charAt(x.length()-1)=='3'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c3.length;i++)
					Bg2P1.jcb2.addItem(c3[i]);
				
				}
                                if(x.charAt(x.length()-1)=='4'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c4.length;i++)
					Bg2P1.jcb2.addItem(c4[i]);
				
				}
                                if(x.charAt(x.length()-1)=='5'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c5.length;i++)
					Bg2P1.jcb2.addItem(c5[i]);
				
				}
                                if(x.charAt(x.length()-1)=='6'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c6.length;i++)
					Bg2P1.jcb2.addItem(c6[i]);
				
				}
                                if(x.charAt(x.length()-1)=='7'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c7.length;i++)
					Bg2P1.jcb2.addItem(c7[i]);
				
				}
                                if(x.charAt(x.length()-1)=='8'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c8.length;i++)
					Bg2P1.jcb2.addItem(c8[i]);
				
				}
                                if(x.charAt(x.length()-1)=='9'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c9.length;i++)
					Bg2P1.jcb2.addItem(c9[i]);
				
				}
                                if(x.charAt(x.length()-1)=='0'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c10.length;i++)
					Bg2P1.jcb2.addItem(c10[i]);
				
				}
                                if(x.charAt(x.length()-1)=='1'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c11.length;i++)
					Bg2P1.jcb2.addItem(c11[i]);
				
				}
                                if(x.charAt(x.length()-1)=='2'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c12.length;i++)
					Bg2P1.jcb2.addItem(c12[i]);
				
				}
                                if(x.charAt(x.length()-1)=='3'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c13.length;i++)
					Bg2P1.jcb2.addItem(c13[i]);
				
				}
                                if(x.charAt(x.length()-1)=='4'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c14.length;i++)
					Bg2P1.jcb2.addItem(c14[i]);
				
				}
                                if(x.charAt(x.length()-1)=='5'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c15.length;i++)
					Bg2P1.jcb2.addItem(c15[i]);
				
				}
                                if(x.charAt(x.length()-1)=='6'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c16.length;i++)
					Bg2P1.jcb2.addItem(c16[i]);
				
				}
                                if(x.charAt(x.length()-1)=='7'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c17.length;i++)
					Bg2P1.jcb2.addItem(c17[i]);
				
				}
                                if(x.charAt(x.length()-1)=='8'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c18.length;i++)
					Bg2P1.jcb2.addItem(c18[i]);
				
				}
                        
              }}catch(NullPointerException npe){}
               catch(RuntimeException re){}
               catch(Exception ex){}
              
              
               
              }
               public void enter2 ()
		        {
					
                                        try{
               
			       
                                       
                                        //System.out.println(1);
                                        String s=(String)Bg2P1.jcb.getSelectedItem();
                                        //System.out.println(2);
                                        int i,l=s.length();
                                        String y="";
                                        String z="";
                                       // System.out.println(3);
                                       for(i=0;i<l;i++)
                                       {
                                         if(s.charAt(i)>='0'&&s.charAt(i)<='9')  
                                             y=y+s.charAt(i);
                                       }
                                       
                                         String p=(String)Bg2P1.jcb2.getSelectedItem();
                                        l=p.length();
                                        //System.out.println(4);
                                       for(i=0;i<l;i++)
                                       {
                                         if(p.charAt(i)>='0'&&p.charAt(i)<='9')  
                                             z=z+p.charAt(i);
                                       }
				   	int n = Integer.parseInt(y);
                                        int m = Integer.parseInt(z);
                                        //System.out.println(y);
                                        ChShP1.chno=n;
                                        ChShP1.shno=m;
                                        setfalse();
                                        add();
                                        ChShP1.setVisible (true);
                                        ChShP1.repaint();
					if(ChShP1.chno==1&&ChShP1.shno==1)
                                        {
                                          ChShP2.setVisible(true); 
                                        }
                                        else
                                        {
                                             ChShP2_1.setVisible(true); 
                                        }
                                         Bg2P1.jcb.setSelectedIndex(0);
                                          Bg2P1.jcb2.setSelectedIndex(0);
                                        
			       
               }catch(NullPointerException npe){}
               catch(RuntimeException re){}
               catch(Exception ex){}
					
			}
               public void combobox3(ActionEvent e)
              { 
                  
	 
               try{
              if(e.getSource().equals(ChShP2.jcb))
			{
				String x=(String)ChShP2.jcb.getSelectedItem();
				ChShP2.jcb2.removeAllItems();
				if(x.charAt(x.length()-1)=='1' && x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c1.length;i++)
					ChShP2.jcb2.addItem(c1[i]);
				
				}
				if(x.charAt(x.length()-1)=='2'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c2.length;i++)
					ChShP2.jcb2.addItem(c2[i]);
				
				}
				if(x.charAt(x.length()-1)=='3'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c3.length;i++)
					ChShP2.jcb2.addItem(c3[i]);
				
				}
                                if(x.charAt(x.length()-1)=='4'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c4.length;i++)
					ChShP2.jcb2.addItem(c4[i]);
				
				}
                                if(x.charAt(x.length()-1)=='5'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c5.length;i++)
					ChShP2.jcb2.addItem(c5[i]);
				
				}
                                if(x.charAt(x.length()-1)=='6'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c6.length;i++)
					ChShP2.jcb2.addItem(c6[i]);
				
				}
                                if(x.charAt(x.length()-1)=='7'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c7.length;i++)
					ChShP2.jcb2.addItem(c7[i]);
				
				}
                                if(x.charAt(x.length()-1)=='8'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c8.length;i++)
					ChShP2.jcb2.addItem(c8[i]);
				
				}
                                if(x.charAt(x.length()-1)=='9'&& x.charAt(x.length()-2)==' ')
				{
					for(int i=0;i<c9.length;i++)
					ChShP2.jcb2.addItem(c9[i]);
				
				}
                                if(x.charAt(x.length()-1)=='0'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c10.length;i++)
					ChShP2.jcb2.addItem(c10[i]);
				
				}
                                if(x.charAt(x.length()-1)=='1'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c11.length;i++)
					ChShP2.jcb2.addItem(c11[i]);
				
				}
                                if(x.charAt(x.length()-1)=='2'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c12.length;i++)
					ChShP2.jcb2.addItem(c12[i]);
				
				}
                                if(x.charAt(x.length()-1)=='3'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c13.length;i++)
					ChShP2.jcb2.addItem(c13[i]);
				
				}
                                if(x.charAt(x.length()-1)=='4'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c14.length;i++)
					ChShP2.jcb2.addItem(c14[i]);
				
				}
                                if(x.charAt(x.length()-1)=='5'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c15.length;i++)
					ChShP2.jcb2.addItem(c15[i]);
				
				}
                                if(x.charAt(x.length()-1)=='6'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c16.length;i++)
					ChShP2.jcb2.addItem(c16[i]);
				
				}
                                if(x.charAt(x.length()-1)=='7'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c17.length;i++)
					ChShP2.jcb2.addItem(c17[i]);
				
				}
                                if(x.charAt(x.length()-1)=='8'&& x.charAt(x.length()-2)=='1')
				{
					for(int i=0;i<c18.length;i++)
					ChShP2.jcb2.addItem(c18[i]);
				
				}
                        
              }}catch(NullPointerException npe){}
               catch(RuntimeException re){}
               catch(Exception ex){}
              
             
               
              }
               public void enter3()
               {
                   try{
              
			       
                                        //System.out.println(1);
                                        String s=(String)ChShP2.jcb.getSelectedItem();
                                        //System.out.println(2);
                                        int i,l=s.length();
                                        String y="";
                                        String z="";
                                       // System.out.println(3);
                                       for(i=0;i<l;i++)
                                       {
                                         if(s.charAt(i)>='0'&&s.charAt(i)<='9')  
                                             y=y+s.charAt(i);
                                       }
                                       
                                         String p=(String)ChShP2.jcb2.getSelectedItem();
                                        l=p.length();
                                        //System.out.println(4);
                                       for(i=0;i<l;i++)
                                       {
                                         if(p.charAt(i)>='0'&&p.charAt(i)<='9')  
                                             z=z+p.charAt(i);
                                       }
				   	int n = Integer.parseInt(y);
                                        int m = Integer.parseInt(z);
                                        //System.out.println(y);
                                        ChShP1.chno=n;
                                        ChShP1.shno=m;
                                        setfalse();
                                        add();
                                        ChShP1.setVisible (true);
                                        ChShP1.repaint();
					if(ChShP1.chno==1&&ChShP1.shno==1)
                                        {
                                          ChShP2.setVisible(true); 
                                        }
                                        else
                                        {
                                             ChShP2_1.setVisible(true); 
                                        }
                                        ChShP2.jcb.setSelectedIndex(0);
                                          ChShP2.jcb2.setSelectedIndex(0);
			       
               }catch(NullPointerException npe){}
               catch(RuntimeException re){}
               catch(Exception ex){}
               }
//functions for audio player
              public void audioplay(ActionEvent e) {
                   if(play==0)
                     myThread.start();
                     else
                     myThread.resume();
   
   
    }
               public void audiostop(ActionEvent e){
                      myThread.suspend();
                        play=1;
                     
                  
                  
                  }
              
      public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                 new Bg1();
            }
        } );
    }
    }

class MyRunner implements Runnable{
    private ChShlokaPanel1 ChShP1;
    private static final int BUFFER_SIZE = 4096;
  public void run(){
      String audioFilePath="p0.wav";
   
        File audioFile = new File(audioFilePath);
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
 
            SourceDataLine audioLine = (SourceDataLine) AudioSystem.getLine(info);
 
            audioLine.open(format);
 
            audioLine.start();
             
            System.out.println("Playback started.");
             
            byte[] bytesBuffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
 
            while ((bytesRead = audioStream.read(bytesBuffer)) != -1) {
                 
                audioLine.write(bytesBuffer, 0, bytesRead);
            }
             
            audioLine.drain();
            audioLine.close();
            audioStream.close();
             
            System.out.println("Playback completed.");
             
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        } catch(NullPointerException npe){}
        
  }
}
