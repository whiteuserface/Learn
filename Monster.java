package SideProject01;

public abstract class Monster {
	MonAttribute ma = new MonAttribute2(6, 11); //객체 참조 겸 생성자 초기화
	
	abstract void attack();
	
	abstract void move();
}

class 울트라 extends Monster implements Ground{
	@Override
	void attack() {
		System.out.println("울트라 공격");
	}

	@Override
	void move() {
		System.out.println("울트라 이동");
		
	}
	@Override
	public void walk() {
		System.out.println(ma.getGroundSpeed()+"의 속도로");
		System.out.println("울트라 걷기");
	};
	
}

class 히드라 extends Monster implements Ground{
	@Override
	void attack() {
		System.out.println("히드라 공격");
	}

	@Override
	void move() {
		System.out.println(ma.getGroundSpeed()+"의 속도로");
		System.out.println("히드라 이동");
		
	}
	@Override
	public void walk() {
		System.out.println(ma.getGroundSpeed()+"의 속도로");
		System.out.println("히드라 걷기");
	};
}

class 저글링 extends Monster implements Ground{
	@Override
	void attack() {
		System.out.println("저글링 공격");
	}

	@Override
	void move() {
		System.out.println(ma.getGroundSpeed()+"의 속도로");
		System.out.println("저글링 이동");
		
	}
	@Override
	public void walk() {
		System.out.println(ma.getGroundSpeed()+"의 속도로");
		System.out.println("저글링 걷기");
	};
}

class 뮤탈 extends Monster implements Fly{
	@Override
	void attack() {
		System.out.println("뮤탈 공격");
	}

	@Override
	void move() {
		System.out.println(ma.getFlySpeed()+"의 속도로");
		System.out.println("뮤탈 이동");
		
	}
	
	@Override
	public void flymove() {
		System.out.println(ma.getFlySpeed()+"의 속도로");
		System.out.println("뮤탈 날아라");
	}
}
