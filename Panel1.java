import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
class Panel1 extends JPanel
     {
        public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
       public Border loweredbevel = BorderFactory.createLoweredBevelBorder();
       public Border border = BorderFactory.createCompoundBorder(
                          raisedbevel, loweredbevel);
        JButton Bg1P1jb;
         public BufferedImage image;
      
        public Panel1 ()
	          {
		         super ();
                         Insets insets=getInsets();
		         setBorder (border);
                         setLayout(null);
                         setBackground(new Color(255,165,0));
		         setVisible (true);
                         Bg1P1jb=new JButton("EXPLORE");
                         Dimension size = Bg1P1jb.getPreferredSize();
                         Bg1P1jb.setBounds(588 , 600 ,
                         150, size.height);
                          Bg1P1jb.setBackground(new Color(255,228,181));
                         try{
                             image=ImageIO.read(new File("krishna.png"));
                         }catch(IOException e){
                         
                         }
                         
                         add(Bg1P1jb);
	          }
        public void paintComponent (Graphics g)
	          {
				 super.paintComponent (g);
		         String expression1 ="\u0936\u094D\u0930\u0940\u092E\u0926\u094D\u092D\u0917\u0935\u0926\u094D\u0917\u0940\u0924\u093E ";
                              
		         Font f = new Font ("Serif", Font.PLAIN|Font.BOLD, 130);
		         g.setFont (f);
		         g.setColor (new Color (153, 0, 0));
		         g.drawString (expression1, 270, 520); 
                         g.drawImage(image,550,10,null);
	          }
     }