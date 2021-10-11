package eecs3311;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Square extends Shape {
	public Square (int x, int y, int width, int height,Color colour) {
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
		this.setColour(colour);
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.getWidth() * this.getHeight();
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(this.getColour());
		g2d.fillRect(this.getX(),this.getY(),this.getWidth(),this.getHeight());
	}
}
