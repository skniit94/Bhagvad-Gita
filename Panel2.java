import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Panel2 extends JPanel{
        public Border border = BorderFactory.createRaisedBevelBorder ();
        JButton Bg1P2jb;
        public Panel2()
        {
            super();
            Bg1P2jb=new JButton("EXPLORE");
            add(Bg1P2jb);
            
            setVisible(true);
            
            
        }
}