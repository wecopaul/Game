package weco.entity;

import java.awt.image.BufferedImage;

import weco.data.Size;

public class Spaceship {

	public int hp;
	public int maxAmmo;
	public int ammoOnBuy;
	public String name;
	public int type;
	public int invSlots;
	public BufferedImage image;
	public float speed;
	public Size size;
	
	public Spaceship(int hp, int maxAmmo, int ammoOnBuy, String name, int type, int invSlots, BufferedImage image, float speed, Size size){
		this.hp = hp;
		this.maxAmmo = maxAmmo;
		this.ammoOnBuy = ammoOnBuy;
		this.name = name;
		this.type = type;
		this.invSlots = invSlots;
		this.image = image;
		this.speed = speed;
		this.size = size;
	}
	
}
