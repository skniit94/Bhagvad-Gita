import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class SecondScreenPanel3 extends JPanel{
        public Border border = BorderFactory.createLineBorder (Color.BLACK);
         JButton Bg2P3jb1,Bg2P3jb2,Bg2P3jb3,Bg2P3jb4,Bg2P3jb5,Bg2P3jb6,Bg2P3jb7;
         public SecondScreenPanel3()
	          {
		         super ();
		         setBorder (border);
		         setVisible (true);
                         setLayout (null);
                         setBackground(new Color(255,228,181));
                         Insets insets=getInsets();  
                         
                          Bg2P3jb1=new JButton("Gita Mahatmyam");
                          Dimension size = Bg2P3jb1.getPreferredSize();
                          Bg2P3jb1.setBounds(55 + insets.left, 15 + insets.top,
                          150, size.height);
                           Bg2P3jb1.setBackground(new Color(240,230,140));
                          
                          Bg2P3jb2=new JButton("Vedanta Vocabulary");
                           size = Bg2P3jb2.getPreferredSize();
                          Bg2P3jb2.setBounds(55 + insets.left, 65 + insets.top,
                     150, size.height);
                           Bg2P3jb2.setBackground(new Color(240,230,140));
                           
                          Bg2P3jb3=new JButton("Gita Glossary");
                         size = Bg2P3jb3.getPreferredSize();
                          Bg2P3jb3.setBounds(55 + insets.left, 115 + insets.top,
                     150, size.height);
                           Bg2P3jb3.setBackground(new Color(240,230,140));
                           
                          Bg2P3jb4=new JButton("Pronunciation");
                         size = Bg2P3jb4.getPreferredSize();
                          Bg2P3jb4.setBounds(55 + insets.left, 165 + insets.top,
                     150, size.height);
                           Bg2P3jb4.setBackground(new Color(240,230,140));
                           
                          Bg2P3jb5=new JButton("Notes & Comments");
                         size = Bg2P3jb5.getPreferredSize();
                          Bg2P3jb5.setBounds(55 + insets.left, 215 + insets.top,
                     150, size.height);
                           Bg2P3jb5.setBackground(new Color(240,230,140));
                          
                          Bg2P3jb6=new JButton("Resources");
                          size = Bg2P3jb6.getPreferredSize();
                          Bg2P3jb6.setBounds(55 + insets.left, 265 + insets.top,
                     150, size.height);
                           Bg2P3jb6.setBackground(new Color(240,230,140));
                          
                          Bg2P3jb7=new JButton("Acknowledgements");
                           size = Bg2P3jb7.getPreferredSize();
                          Bg2P3jb7.setBounds(55 + insets.left, 315 + insets.top,
                     150, size.height);
                           Bg2P3jb7.setBackground(new Color(240,230,140));
                          
                          add(Bg2P3jb1);
                          add(Bg2P3jb2);
                          add(Bg2P3jb3);
                          add(Bg2P3jb4);
                          add(Bg2P3jb5);
                          add(Bg2P3jb6);
                          add(Bg2P3jb7);
        
                  }
         
}
