package _03_jars._3_magic_box;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener, MouseMotionListener {

	/*
	 * We are going to hide secrets within the magic box. 
	 * When the user clicks on a secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 * 
	 * 2. When the mouse is clicked, use the Media Palace (read the code in the magic_box package) to play sounds, 
	 *    show images or speak.
	 * 
	 * 3. Choose 3 different locations on the background image.You can either use the mouse position, 
	 *    or the color of the image, then decide what action the Media Palace should take in each case. 
	 *     backgroundImage.getRGB(e.getX(), e.getY()) will give you the color of the current pixel.
	 *     
	 *   
	 *     
	 */

	BufferedImage backgroundImage;


	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
			addMouseMotionListener(this);
			addMouseListener(this);
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
		JFrame frame = new JFrame("The Magic Box contains many secrets...");
		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/_03_jars/_3_magic_box/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int mouseX = e.getX();
		int mouseY = e.getY();
		System.out.println(mouseX + " " + " " +mouseY );
		if (mouseX == 342 && mouseY == 633 || mouseX == 343 && mouseY == 633 || mouseX == 343 && mouseY == 632 || mouseX == 343 && mouseY == 635 || mouseX == 340 && mouseY == 631 || mouseX == 342 && mouseY == 632) {
			JOptionPane.showMessageDialog(null, "This door is hard to reach but holds many pieces of valuable lore.\n As the old phrase goes, 'Fortune favors the bold'. ");
		}
		if (mouseX == 331 && mouseY == 144 || mouseX == 331 && mouseY == 145 || mouseX == 331 && mouseY == 146 || mouseX == 331 && mouseY == 147 || mouseX == 331 && mouseY == 148 || mouseX == 332 && mouseY == 144 ||  mouseX == 332 && mouseY == 145 ||  mouseX == 332 && mouseY == 146 ||  mouseX == 332 && mouseY == 147 ||  mouseX == 332 && mouseY == 148 ||  mouseX == 335 && mouseY == 144 ||  mouseX == 335 && mouseY == 145 || mouseX == 335 && mouseY == 146 || mouseX == 335 && mouseY == 147 || mouseX == 336 && mouseY == 144 || mouseX == 336 && mouseY == 145 || mouseX == 336 && mouseY == 146 || mouseX == 336 && mouseY == 147 || mouseX == 336 && mouseY == 148) {
			JOptionPane.showMessageDialog(null, "You twist the wheel. Immediatly, water sprays everywhere and you drop into the pool at the base of the fountain.\n As the old phrase goes, 'Curiosity killed the cat'. ");	
		}
if (mouseX == 199 && mouseY == 505 || mouseX == 199 && mouseY == 506 || mouseX == 199 && mouseY == 507 || mouseX == 199 && mouseY == 508 || mouseX == 199 && mouseY == 509 || mouseX == 199 && mouseY == 510 ||mouseX == 5199 && mouseY == 511 || mouseX == 199 && mouseY == 512 || mouseX == 199 && mouseY == 513 || mouseX == 199 && mouseY == 514 || mouseX == 199 && mouseY == 515 || mouseX == 199 && mouseY == 516 || mouseX == 200 && mouseY == 505 || mouseX == 200 && mouseY == 200 || mouseX == 200 && mouseY == 507 || mouseX == 200 && mouseY == 200 || mouseX == 200 && mouseY == 509 || mouseX == 200 && mouseY == 510 ||mouseX == 200 && mouseY == 511 || mouseX == 200 && mouseY == 512 || mouseX == 200 && mouseY == 513 || mouseX == 200 && mouseY == 514 || mouseX == 200 && mouseY == 515 || mouseX == 200 && mouseY == 516 ) {
			JOptionPane.showMessageDialog(null, "You talk to the strangle man. He tells you to be adventurous but still wary of dangers.\n He also says that it is safer to open this palace's door than to work with its machinery. ");
		}
if (mouseX == 399 && mouseY == 657 || mouseX == 399 && mouseY == 658 || mouseX == 398 && mouseY == 657 || mouseX == 398 && mouseY == 658 || mouseX == 399 && mouseY == 657 || mouseX == 400 && mouseY == 400 || mouseX == 401 && mouseY == 657 || mouseX == 401 && mouseY == 658) {
	JOptionPane.showMessageDialog(null, "You found a slip of green paper on the floor. It is a 500-dollar bill!");
}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
			
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}


