package SideProject01;

public class UnitAttribute2 extends UnitAttribute {
	UnitAttribute2(int groundSpeed, int flySpeed){
		super(groundSpeed, flySpeed);
	}
	//��� �� super�� ���ؼ� �θ��� private ������ ����
	UnitAttribute2(int groundSpeed){
		super(groundSpeed); //�����ε� ���
	}
	@Override //�������̵� ���
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
