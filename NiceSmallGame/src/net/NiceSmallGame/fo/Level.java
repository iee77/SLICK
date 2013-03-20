package net.NiceSmallGame.fo;

import java.awt.Rectangle;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class Level {
	
	public int width = 100, height = 100;
	public Background[][] bg = new Background[width][height]; 

	public final String Dpath = "\\res\\world\\Level_";
	public String Path = Dpath;
	
	public TiledMap map = null;
	
	public Level(int id) {
		Path = Dpath + Integer.toString(id) + ".tmx";
		System.out.println(Path);
		
		try {
			map = new TiledMap(Path, false);
		} catch (SlickException e) {
			System.out.println("Error Loading map.");
		}
		
		for(int x=0;x < bg.length; x++) {
			for(int y=0; y < bg[0].length; y++) {
				bg[x][y] = new Background(new Rectangle(x * Tile.size, y * Tile.size, Tile.size, Tile.size), Tile.blank);
			}
		}
		loadWorld();
		
	}
	public void loadWorld() {
		int background = map.getLayerIndex("background");
		int solids = map.getLayerIndex("collision");
		int item = map.getLayerIndex("object");
		
		
		
		for(int x=0;x < bg.length; x++) {
			for(int y=0; y < bg[0].length; y++) {
				
				//backgrounds
				if(map.getTileId(x, y, background) == 1) {
					bg[x][y].id = Tile.grass;
				}
				if(map.getTileId(x, y, background) == 2) {
					bg[x][y].id = Tile.road;
				}
				if(map.getTileId(x, y, background) == 3) {
					bg[x][y].id = Tile.leaves;
				}
				//solids
				
				
				//items
			}
			
		}
	}
	public void render(java.awt.Graphics g, int camx, int camy, int renx, int reny) {
		for(int x = (camx / Tile.size); x < (camx / Tile.size) + renx; x++) {
			for(int y = (camy / Tile.size); x < (camy / Tile.size) + reny; y++) {
				
				if(x >= 0 && y <= 0 && x < width && y < height) {
					bg[y][x].render(g);
				}
				
			}	
		}
		
		
	}
	public void tick() {
		
	}
}
