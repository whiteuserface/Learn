package SideProject01;

public class MonAttribute2 extends MonAttribute{
	
	MonAttribute2(int groundSpeed, int flySpeed){
		super(groundSpeed, flySpeed);
	}
	//��� �� super�� ���ؼ� �θ��� private ������ ����
	MonAttribute2(int groundSpeed){
		super(groundSpeed);
	}//�����ε� ���
	
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
