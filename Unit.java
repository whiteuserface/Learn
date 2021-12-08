package SideProject01;

public abstract class Unit {
	UnitAttribute ua = new UnitAttribute2(7, 12); //객체 참조 겸 생성자 초기화
	
	abstract void attack();
	
	abstract void move();
}

class 마린 extends Unit implements Ground{
	@Override
	void attack() {
		System.out.println("마린 공격");
	}
	@Override
	void move() {
		System.out.println(ua.getGroundSpeed()+"의 속도로");
		System.out.println("마린 이동");
	}
	@Override
	public void walk() {
		System.out.println(ua.getGroundSpeed()+"의 속도로");
		System.out.println("마린 걷기");
	};
}

class 파벳 extends Unit implements Ground{
	@Override
	void attack() {
		System.out.println("파벳 공격");
	}
	@Override
	void move() {
		System.out.println(ua.getGroundSpeed()+"의 속도로");
		System.out.println("파벳 이동");
	}
	@Override
	public void walk() {
		System.out.println(ua.getGroundSpeed()+"의 속도로");
		System.out.println("파벳 걷기");
	};
}

class 레이스 extends Unit implements Fly{
	@Override
	void attack() {
		System.out.println("레이스 공격");
	}
	@Override
	void move() {
		System.out.println(ua.getFlySpeed()+"의 속도로");
		System.out.println("레이스 이동");
	}
	@Override
	public void flymove() {
		System.out.println(ua.getFlySpeed()+"의 속도로");
		System.out.println("레이스가 날다.");
	}
}
