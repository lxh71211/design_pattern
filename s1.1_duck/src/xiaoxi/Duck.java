package xiaoxi;

public abstract class Duck {
	//为行为接口类型声明两个引用变量，所有鸭子子类（在同一个package中）都继承它们
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
