package SideProject01;

public class UnitAttribute {
	private int groundSpeed = 6;
	private int flySpeed = 11;
	
	UnitAttribute(int groundSpeed, int flySpeed){
		this.groundSpeed = groundSpeed;  //this ���
		this.flySpeed = flySpeed;
	}
	UnitAttribute(int groundSpeed){
		this.groundSpeed = groundSpeed;
	} //�����ε� ���
	
	public int getGroundSpeed() {
		return groundSpeed;
	}
	public int getFlySpeed() {
		return flySpeed;
	}
}
