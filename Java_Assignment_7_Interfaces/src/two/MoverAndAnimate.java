package two;

public class MoverAndAnimate implements Animatable {
	public void moveAround() {
		System.out.println("I'm moving!");
	}
	
	public void animate() {
		System.out.println("I'm animating!");
	}
	
	public static void main (String[] args) {
		MoverAndAnimate MoverAndAnimate = new MoverAndAnimate();
		MoverAndAnimate.moveAround();
		MoverAndAnimate.animate();
	}
}
