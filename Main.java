package SideProject01;

public class Main {
	public static void main(String[] args) {
		
		��Ʈ�� u1 = new ��Ʈ��();
		���۸� z1 = new ���۸�();
		����� h1 = new �����();
		��Ż m1 = new ��Ż();
		���� sol1 = new ����();
		�ĺ� fire1 = new �ĺ�();
		���̽� race1 = new ���̽�();
		
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
		
		Fly[] flyMember = new Fly[] {  //Fly interface �迭
				m1, race1
		};
		
		Ground[] walkMember = new Ground[] { //Ground interface �迭
				u1, z1, h1, sol1, fire1
		};
		
		Monster[] monMember = new Monster[] { //abstract monMember �迭
				u1, z1, h1, m1
		};
		
		Unit[] unitMember = new Unit[] { //Unit abstract �迭
				sol1, fire1, race1
		};
		
		for(int i=0; i<monMember.length; i++) {
			if(monMember[i] instanceof Fly) {
				System.out.println(monMember[i]+"�� ���³�!");
			} else if(monMember[i] instanceof Ground) {
				System.out.println(monMember[i]+"�� �ȴ³�!");
			}
		}
		
		
		
		
	}

}
