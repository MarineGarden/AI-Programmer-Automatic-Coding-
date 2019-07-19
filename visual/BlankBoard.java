package visual;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class BlankBoard extends JFrame {

	{
		
		setLayout(null);
		setExtendedState(MAXIMIZED_BOTH);
		setUndecorated(true);
		getContentPane().setBackground( Color.WHITE );
		
		addMouseListener(new DoubleShotDown());
		
		setVisible(true);
		
	}
	
	public static class DoubleShotDown extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			
			if ( e.getClickCount() > 1 )
				System.exit(0);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new BlankBoard();
		
	}
	
}
