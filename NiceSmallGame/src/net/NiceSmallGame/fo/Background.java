package net.NiceSmallGame.fo;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Background extends Rectangle{
	
	public int[] id = {-1, -1}; 
	
	public Background(Rectangle rect, int id[]) {
		setBounds(rect);
		this.id = id;
		
		
	}
	
	public void render(Graphics g) {
		g.drawImage(Tile.background, x - (int)Core.oX, y - (int)Core.oY, x + width - (int)Core.oX, y + height - (int)Core.oY, id[0] * Tile.size, id[1] * Tile.size, id[0] * Tile.size + Tile.size, id[1] * Tile.size + Tile.size, null);
	}
}
