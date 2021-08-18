package gunFightingGame;

public class Main {

	public static void main(String[] args) {
		Player1 p1=new Player1("Pratik","Machine gun",100);
		p1.getName();
		p1.damageByGun1();
		p1.damageByGun1();
		p1.heal();
		p1.damageByGun2();
		p1.damageByGun2();
		
		Player2 p2=new Player2("Pratik","AK47",100,true);
		p2.damageByGun1();
		p2.damageByGun2();
		p2.heal();
	}
}
