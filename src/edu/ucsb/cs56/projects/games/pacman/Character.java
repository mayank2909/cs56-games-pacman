package edu.ucsb.cs56.projects.games.pacman;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JComponent;

/**
   Class that every character inherits from, including players
   and AI-controlled enemies.
 */
public abstract class Character {
	public int startX, startY;
	public int x, y, dx, dy, viewdx, viewdy, reqdx, reqdy, speed;
	
	/**
	 * Constructor for Character class
	 * @param x the starting x coordinate of pacman
	 * @param y the starting y coordinate of pacman
	 */
	public Character(int x, int y){
		startX = x;
		startY = y;
        reset();
	}
	
	/**
	 * Restores the character's default values.
	 */
	public void reset(){
        this.x = startX;
        this.y = startY;
        dx = 0;
        dy = 0;
        reqdx = 0;
        reqdy = 0;
        viewdx = -1;
        viewdy = 0;
	}
       
	/**
	 * draws the character onto the screen	  
	 * @param g a Graphics2D object
	 * @param canvas A JComponent object to be drawn on	 
	 */
	public abstract void draw(Graphics2D g, JComponent canvas);
	
	/**
	 * Load game sprites from images folder
	 */
	public abstract void loadImages();

	/**
	 * Returns the image used for displaying remaining lives
	 * @return Image of character
	 */
	public abstract Image getLifeImage();

	/**
	 *Moves character's current position
	 */
	public void move(){
        x = x + speed * dx;
        y = y + speed * dy;
	}
}
