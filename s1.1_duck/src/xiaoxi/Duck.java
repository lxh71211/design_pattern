package xiaoxi;

public abstract class Duck {
	//Ϊ��Ϊ�ӿ����������������ñ���������Ѽ�����ࣨ��ͬһ��package�У����̳�����
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	//���ýӿڷ���
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	
	//�趨����--�趨��Ϊ�������ڹ�������ʵ����
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
}
