package Game;

public abstract class Weapon {  //a class has abstract method, it has to become an abstract class
	
	public abstract void shoot();
	public abstract void secondaryFire(); //for zoom

	
	public void reload() {
		//reload the weapon,
		//method nay phai dung voi tat ca cac class extends no
	}

}
