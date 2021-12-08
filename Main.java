package SideProject01;

public class Main {
	public static void main(String[] args) {
		
		울트라 u1 = new 울트라();
		저글링 z1 = new 저글링();
		히드라 h1 = new 히드라();
		뮤탈 m1 = new 뮤탈();
		마린 sol1 = new 마린();
		파벳 fire1 = new 파벳();
		레이스 race1 = new 레이스();
		
		u1.attack();
		z1.attack();
		h1.attack();
		m1.attack();
		sol1.attack();
		fire1.attack();
		race1.attack();
		
		u1.move();
		z1.move();
		h1.move();
		m1.flymove();
		sol1.move();
		fire1.move();
		race1.flymove();
		
		Fly[] flyMember = new Fly[] {  //Fly interface 배열
				m1, race1
		};
		
		Ground[] walkMember = new Ground[] { //Ground interface 배열
				u1, z1, h1, sol1, fire1
		};
		
		Monster[] monMember = new Monster[] { //abstract monMember 배열
				u1, z1, h1, m1
		};
		
		Unit[] unitMember = new Unit[] { //Unit abstract 배열
				sol1, fire1, race1
		};
		
		for(int i=0; i<monMember.length; i++) {
			if(monMember[i] instanceof Fly) {
				System.out.println(monMember[i]+"는 나는놈!");
			} else if(monMember[i] instanceof Ground) {
				System.out.println(monMember[i]+"는 걷는놈!");
			}
		}
		
		
		
		
	}

}
