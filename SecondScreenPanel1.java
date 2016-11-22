import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class SecondScreenPanel1 extends JPanel{
        
    public Border border = BorderFactory.createLineBorder (Color.BLACK);
        JButton Bg2P1jbE;
        JComboBox jcb=null,jcb2=null;
         public SecondScreenPanel1()
	          {
                        super ();
		        setBorder (border);
		        setVisible (true);
                        setLayout(null);
                            setBackground(new Color(255,228,181));
		        String[] chapters = { "Chapter 1", "Chapter 2","Chapter 3","Chapter 4","Chapter 5","Chapter 6","Chapter 7","Chapter 8",
                         "Chapter 9","Chapter 10","Chapter 11","Chapter 12","Chapter 13","Chapter 14","Chapter 15","Chapter 16","Chapter 17","Chapter 18",};
                        
                        Insets insets=getInsets(); 
                        Bg2P1jbE=new JButton("Goto Shloka");
                          Dimension size = Bg2P1jbE.getPreferredSize();
                          Bg2P1jbE.setBounds(55 , 350 ,
                          150, size.height);
                          add(Bg2P1jbE);
                           Bg2P1jbE.setBackground(new Color(240,230,140));
                          
                        
                        jcb = new JComboBox(chapters);
                        size =jcb.getPreferredSize();
                        jcb.setSelectedIndex(0);
                        jcb.setBounds(55 , 265,
                         150, size.height);
                         jcb.setBackground(new Color(220,220,220));
                        add(jcb);
                        
                       String[] c1={ "Shloka 1","Shloka 2","Shloka 3","Shloka 4","Shloka 5","Shloka 6","Shloka 7","Shloka 8","Shloka 9","Shloka 10","Shloka 11"
              ,"Shloka 12","Shloka 13","Shloka 14","Shloka 15","Shloka 16","Shloka 17","Shloka 18","Shloka 19","Shloka 20","Shloka 21","Shloka 22","Shloka 23"
              ,"Shloka 24","Shloka 25","Shloka 26","Shloka 27","Shloka 28","Shloka 29","Shloka 30","Shloka 31","Shloka 32","Shloka 33","Shloka 34","Shloka 35","Shloka 36"
              ,"Shloka 37","Shloka 38","Shloka 39","Shloka 40","Shloka 41","Shloka 42","Shloka 43","Shloka 44","Shloka 45","Shloka 46","Shloka 47"};
                        
                        jcb2 = new JComboBox(c1);
                        size =jcb2.getPreferredSize();
                        jcb2.setSelectedIndex(0);
                        jcb2.setBounds(55 , 300,
                         150, size.height);
                        jcb2.setBackground(new Color(220,220,220));
                        add(jcb2);
                        
                  }
}