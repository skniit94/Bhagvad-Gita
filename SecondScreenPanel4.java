import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class SecondScreenPanel4 extends JPanel{
         public Border border = BorderFactory.createLineBorder (Color.BLACK);
         JButton Bg2P4jbB,Bg2P4jb2,Bg2P4jb3,Bg2P4jb4;
         public SecondScreenPanel4()
	          {
		         super ();
                         setBorder (border);
                         setBackground(new Color(205,133,63));
		         setVisible (true);
                         Bg2P4jbB=new JButton("BACK");
                          Bg2P4jbB.setBackground(new Color(255,250,205));
                         add(Bg2P4jbB);
                         Bg2P4jb2=new JButton("ABOUT");
                          Bg2P4jb2.setBackground(new Color(255,250,205));
                         add(Bg2P4jb2);
                         Bg2P4jb3=new JButton("DEDICATION");
                          Bg2P4jb3.setBackground(new Color(255,250,205));
                         add(Bg2P4jb3);
                         Bg2P4jb4=new JButton("CONTEXT");
                          Bg2P4jb4.setBackground(new Color(255,250,205));
                         add(Bg2P4jb4);
                  }
}
