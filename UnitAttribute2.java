package SideProject01;

public class UnitAttribute2 extends UnitAttribute {
	UnitAttribute2(int groundSpeed, int flySpeed){
		super(groundSpeed, flySpeed);
	}
	//상속 시 super를 통해서 부모의 private 변수를 변경
	UnitAttribute2(int groundSpeed){
		super(groundSpeed); //오버로딩 사용
	}
	@Override //오버라이드 사용
	public int getGroundSpeed() {
		int tmp = super.getGroundSpeed();
		return tmp;
	}
	@Override
	public int getFlySpeed() {
		int tmp = super.getFlySpeed();
		return tmp;
	}
}
