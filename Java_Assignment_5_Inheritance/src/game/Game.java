package game;

public class Game {

	public static void main(String[] args) {
		
		Player Player = new Player();
		Enemy Enemy = new Enemy();
		
		Player.update();
		Enemy.update();
		
	}
	
}
