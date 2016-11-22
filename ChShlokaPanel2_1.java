import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;

public class ChShlokaPanel2_1 extends JPanel{
        public Border border = BorderFactory.createLineBorder (Color.BLACK);
         JButton ChShP2_1jbH,ChShP2_1jbN,ChShP2_1jbP,  ChShP2_1jbE;
         JComboBox jcb=null;
	 JComboBox jcb2=null;
         public ChShlokaPanel2_1()
	          {
		         super ();
		         setBorder (border);
		         setVisible (true);
                         setLayout (null);
                         setBackground(new Color(222,184,135));
                         Insets insets=getInsets();  
                         Dimension size;
                         
                         String[] str={ "Chapter 1", "Chapter 2","Chapter 3","Chapter 4","Chapter 5","Chapter 6","Chapter 7","Chapter 8",
                         "Chapter 9","Chapter 10","Chapter 11","Chapter 12","Chapter 13","Chapter 14","Chapter 15","Chapter 16","Chapter 17","Chapter 18" };
                          
                         jcb=new JComboBox(str);
                         size = jcb.getPreferredSize();
		         jcb.setBounds(55, 265 ,150,size.height);
                         jcb.setBackground(new Color(220,220,220));
		        
		
		         String[] c1={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29","Shloka 30","Shloka 31","Shloka 32","Shloka 33","Shloka 34","Shloka 35","Shloka 36"
              ,"Shloka 37","Shloka 38","Shloka 39","Shloka 40","Shloka 41","Shloka 42","Shloka 43","Shloka 44","Shloka 45","Shloka 46","Shloka 47" };
		
		         jcb2=new JComboBox(c1);
                         size = jcb2.getPreferredSize();
		         jcb2.setBounds(55, 300,150, size.height);
                         jcb2.setBackground(new Color(220,220,220));
		
                          
                           ChShP2_1jbE=new JButton("Goto Shloka");
                          size = ChShP2_1jbE.getPreferredSize();
                          ChShP2_1jbE.setBounds(55 , 350 ,
                          150, size.height);
                           ChShP2_1jbE.setBackground(new Color(255,250,205));
                          
                          
                         ChShP2_1jbP=new JButton("PREVIOUS");
                          size = ChShP2_1jbP.getPreferredSize();
                          ChShP2_1jbP.setBounds(55 + insets.left, 570 + insets.top,
                          150, size.height);
                           ChShP2_1jbP.setBackground(new Color(255,250,205));
                          
                           ChShP2_1jbH=new JButton("HOME");
                          size = ChShP2_1jbH.getPreferredSize();
                          ChShP2_1jbH.setBounds(55 + insets.left, 600 + insets.top,
                          150, size.height);
                          ChShP2_1jbH.setBackground(new Color(255,250,205));
                          
                           ChShP2_1jbN=new JButton("NEXT");
                          size = ChShP2_1jbN.getPreferredSize();
                          ChShP2_1jbN.setBounds(55 + insets.left, 630 + insets.top,
                          150, size.height);
                          ChShP2_1jbN.setBackground(new Color(255,250,205));
                          
                          add(jcb);
                          add(jcb2);
                          add(ChShP2_1jbP);
                          add(ChShP2_1jbH);
                          add(ChShP2_1jbN);
                          add(ChShP2_1jbE);
                  }

		
	}
         

