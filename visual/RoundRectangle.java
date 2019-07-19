package visual;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class RoundRectangle extends JComponent {
	
	private Color c;
	private int width;
	private int height;
	private int cornerSize;
	
	public RoundRectangle( Color c , int width , int height , int cornerSize ) {
		
		this.c = c;
		this.width = width;
		this.height = height;
		this.cornerSize = cornerSize;
		setBounds(0, 0, width, height);
		
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(c);
		g.fillRoundRect(0, 0, width, height, cornerSize, cornerSize);
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlankBoard stage = new BlankBoard();
		stage.add(new RoundRectangle(Color.RED, 60, 60, 10));
		
	}

}
