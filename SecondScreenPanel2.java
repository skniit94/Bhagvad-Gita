import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SecondScreenPanel2 extends JPanel{
    
     public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
       public Border loweredbevel = BorderFactory.createLoweredBevelBorder();
       public Border border = BorderFactory.createCompoundBorder(
                          raisedbevel, loweredbevel);
      
        public BufferedImage image;
        
         public SecondScreenPanel2()
	          {
		         super ();
		         setBorder (border);
		         setVisible (true);
                         setLayout(null);
                         setBackground(new Color(255,165,0));
                         try{
                             image=ImageIO.read(new File("krishna_arjuna_Mahabharata-Kurukshetra1.jpg"));
                         }catch(IOException e){
                         
                         }
                  }
          public void paintComponent (Graphics g)
	          {
				 super.paintComponent (g);
		       String expression1 = "There is nothing lost or wasted in this life.",
                                
                                expression2 = "-Bhagavad Gita";
		         Font f1 = new Font ("Serif", Font.PLAIN|Font.BOLD, 35);
                         Font f2 = new Font ("Serif", Font.PLAIN|Font.BOLD, 20);
		         g.setFont (f1);
		         g.setColor ( new Color (153, 0, 0));
		         g.drawString (expression1, 75, 600); 
                         
                         g.setFont (f2);
                         g.setColor ( new Color (255, 63, 0));
		         g.drawString (expression2, 580, 620);
                         
                         g.drawImage(image,17,10,null);
	          }
}
