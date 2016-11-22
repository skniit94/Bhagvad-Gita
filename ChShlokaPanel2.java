import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class ChShlokaPanel2 extends JPanel{
      public Border border = BorderFactory.createLineBorder (Color.BLACK);
         JButton ChShP2jbH,ChShP2jbN,ChShP2jbE;
         JComboBox jcb=null;
	 JComboBox jcb2=null;
         public ChShlokaPanel2()
	          {
		         super ();
		         setBorder (border);
		         setVisible (true);
                         setLayout (null);
                             setBackground(new Color(222,184,135));
                         Insets insets=getInsets();  
                         Dimension size;
                         
                          
                         
                         
                          ChShP2jbE=new JButton("Goto Shloka");
                          size = ChShP2jbE.getPreferredSize();
                          ChShP2jbE.setBounds(55 , 350,
                          150, size.height);
                          ChShP2jbE.setBackground(new Color(255,250,205));
                          
                         
   
                           ChShP2jbH=new JButton("HOME");
                          size = ChShP2jbH.getPreferredSize();
                          ChShP2jbH.setBounds(55 + insets.left, 600 + insets.top,
                          150, size.height);
                            ChShP2jbH.setBackground(new Color(255,250,205));
                          
                           ChShP2jbN=new JButton("NEXT");
                          size = ChShP2jbN.getPreferredSize();
                          ChShP2jbN.setBounds(55 + insets.left, 630 + insets.top,
                          150, size.height);
                            ChShP2jbN.setBackground(new Color(255,250,205));
                          
                          String[] chapters = { "Chapter 1", "Chapter 2","Chapter 3","Chapter 4","Chapter 5","Chapter 6","Chapter 7","Chapter 8",
                         "Chapter 9","Chapter 10","Chapter 11","Chapter 12","Chapter 13","Chapter 14","Chapter 15","Chapter 16","Chapter 17","Chapter 18",};
                        
                       
                        
                        jcb = new JComboBox(chapters);
                        size =jcb.getPreferredSize();
                        jcb.setSelectedIndex(0);
                        jcb.setBounds(55, 265,150,size.height);
                        add(jcb);
                        jcb.setBackground(new Color(220,220,220));
                        
                         String[] c5={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29"};
                        
                        jcb2 = new JComboBox(c5);
                        size =jcb2.getPreferredSize();
                        jcb2.setSelectedIndex(0);
                        jcb2.setBounds(55 , 300 ,150,size.height);
                        add(jcb2);
                        jcb2.setBackground(new Color(220,220,220));
          
                          add(ChShP2jbH);
                          add(ChShP2jbN);
                          add(ChShP2jbE);
                         
                  }
         
}
