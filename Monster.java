package SideProject01;

public abstract class Monster {
	MonAttribute ma = new MonAttribute2(6, 11); //��ü ���� �� ������ �ʱ�ȭ
	
	abstract void attack();
	
	abstract void move();
}

class ��Ʈ�� extends Monster implements Ground{
	@Override
	void attack() {
		System.out.println("��Ʈ�� ����");
	}

	@Override
	void move() {
		System.out.println("��Ʈ�� �̵�");
		
	}
	@Override
	public void walk() {
		System.out.println(ma.getGroundSpeed()+"�� �ӵ���");
		System.out.println("��Ʈ�� �ȱ�");
	};
	
}

class ����� extends Monster implements Ground{
	@Override
	void attack() {
		System.out.println("����� ����");
	}

	@Override
	void move() {
		System.out.println(ma.getGroundSpeed()+"�� �ӵ���");
		System.out.println("����� �̵�");
		
	}
	@Override
	public void walk() {
		System.out.println(ma.getGroundSpeed()+"�� �ӵ���");
		System.out.println("����� �ȱ�");
	};
}

class ���۸� extends Monster implements Ground{
	@Override
	void attack() {
		System.out.println("���۸� ����");
	}

	@Override
	void move() {
		System.out.println(ma.getGroundSpeed()+"�� �ӵ���");
		System.out.println("���۸� �̵�");
		
	}
	@Override
	public void walk() {
		System.out.println(ma.getGroundSpeed()+"�� �ӵ���");
		System.out.println("���۸� �ȱ�");
	};
}

class ��Ż extends Monster implements Fly{
	@Override
	void attack() {
		System.out.println("��Ż ����");
	}

	@Override
	void move() {
		System.out.println(ma.getFlySpeed()+"�� �ӵ���");
		System.out.println("��Ż �̵�");
		
	}
	
	@Override
	public void flymove() {
		System.out.println(ma.getFlySpeed()+"�� �ӵ���");
		System.out.println("��Ż ���ƶ�");
	}
}
