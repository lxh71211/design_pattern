package xiaoxi;

public abstract class Duck {
	//Ϊ��Ϊ�ӿ����������������ñ���������Ѽ�����ࣨ��ͬһ��package�У����̳�����
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
