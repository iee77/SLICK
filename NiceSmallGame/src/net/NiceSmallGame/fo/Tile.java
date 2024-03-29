package net.NiceSmallGame.fo;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Tile {
	
	public static int[] blank = {-1, -1};
	
	//background
	public static int[] grass = {0, 0};
	public static int[] road = {1, 0};
	public static int[] leaves = {2, 0};
	
	//Collision
	
	
	//items
	
	
	//characters
	
	
	
	public static int size = 32;
	public static BufferedImage	terrain, background, items, characters;
	
	
	public Tile() {
		
		try {
			Tile.background = ImageIO.read(new File("\\res\\bg.png"));
			Tile.terrain = ImageIO.read(new File("\\res\\terrain.png"));
			Tile.characters = ImageIO.read(new File("\\res\\Character_Normal.png"));
			Tile.items = ImageIO.read(new File("\\res\\Sword.png"));
		} catch (Exception e) {
			System.out.println("Error loading imgs.");
		}
		
	}
}
