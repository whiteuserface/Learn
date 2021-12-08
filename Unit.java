package SideProject01;

public abstract class Unit {
	UnitAttribute ua = new UnitAttribute2(7, 12); //��ü ���� �� ������ �ʱ�ȭ
	
	abstract void attack();
	
	abstract void move();
}

class ���� extends Unit implements Ground{
	@Override
	void attack() {
		System.out.println("���� ����");
	}
	@Override
	void move() {
		System.out.println(ua.getGroundSpeed()+"�� �ӵ���");
		System.out.println("���� �̵�");
	}
	@Override
	public void walk() {
		System.out.println(ua.getGroundSpeed()+"�� �ӵ���");
		System.out.println("���� �ȱ�");
	};
}

class �ĺ� extends Unit implements Ground{
	@Override
	void attack() {
		System.out.println("�ĺ� ����");
	}
	@Override
	void move() {
		System.out.println(ua.getGroundSpeed()+"�� �ӵ���");
		System.out.println("�ĺ� �̵�");
	}
	@Override
	public void walk() {
		System.out.println(ua.getGroundSpeed()+"�� �ӵ���");
		System.out.println("�ĺ� �ȱ�");
	};
}

class ���̽� extends Unit implements Fly{
	@Override
	void attack() {
		System.out.println("���̽� ����");
	}
	@Override
	void move() {
		System.out.println(ua.getFlySpeed()+"�� �ӵ���");
		System.out.println("���̽� �̵�");
	}
	@Override
	public void flymove() {
		System.out.println(ua.getFlySpeed()+"�� �ӵ���");
		System.out.println("���̽��� ����.");
	}
}
