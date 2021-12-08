package SideProject01;

public class UnitAttribute {
	private int groundSpeed = 6;
	private int flySpeed = 11;
	
	UnitAttribute(int groundSpeed, int flySpeed){
		this.groundSpeed = groundSpeed;  //this 사용
		this.flySpeed = flySpeed;
	}
	UnitAttribute(int groundSpeed){
		this.groundSpeed = groundSpeed;
	} //오버로딩 사용
	
	public int getGroundSpeed() {
		return groundSpeed;
	}
	public int getFlySpeed() {
		return flySpeed;
	}
}
