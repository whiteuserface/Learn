package SideProject01;

public class MonAttribute {
	
	
	private int groundSpeed = 5;
	private int flySpeed = 10;
	
	MonAttribute(int groundSpeed, int flySpeed){
		this.groundSpeed = groundSpeed; //this ���
		this.flySpeed = flySpeed;
	}
	MonAttribute(int groundSpeed){
		this.groundSpeed = groundSpeed;
	} //�����ε� ���
	
	public int getGroundSpeed() {
		return groundSpeed;
	}
	public int getFlySpeed() {
		return flySpeed;
	}
}
